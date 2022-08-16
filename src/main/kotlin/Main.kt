import generation.Generator
import util.*
import java.io.File
import java.io.InputStream
import java.nio.file.Path
import java.util.*

/**
 * Extension property for checking supported file types.
 * */
private val File.validMDDFileType: Boolean
    get() {
        return arrayOf("designpatternsmdd")
            .contains(extension)
    }

/**
 * The main function expects two arguments:
 * 1. The path to the ecore/metamodel input file or directory
 * 2. The path to the codegen output directory
 * */
fun main(args: Array<String>) {
    // Get properties
    val inS: InputStream = {}.javaClass.getResourceAsStream("dpmdd.properties")!!
    val p = Properties()
    p.load(inS)
    val jarName = p.getProperty("jarName")

    // Check for right amount of arguments
    if (args.size != 2) {
        println("${ANSI_RED}One or both required parameters are missing.$ANSI_RESET")
        println("Usage: ${ANSI_PURPLE}java$ANSI_YELLOW -jar$ANSI_RESET $jarName.jar $ANSI_RED<Ecore/Metamodel input file/directory> <CodeGen output directory>$ANSI_RESET")
        return
    }
    // Get input and output paths
    val inputPath = Path.of(args[0])
    val outputPath = Path.of(args[1])
    val inFile = inputPath.toFile()

    // Setup generator
    val generator = Generator(outputPath)

    when {
        inFile.isDirectory -> {
            val fileList = inFile.listFiles()!!
            if (fileList.isEmpty()) {
                println("${ANSI_RED}No files found in input directory$ANSI_RESET")
                return
            }
            for (file in fileList) {
                if (file.isFile && file.validMDDFileType) {
                    generator.addFile(file)
                } else {
                    println("${ANSI_YELLOW}Skipping file$ANSI_BLUE ${file.name}$ANSI_YELLOW due to unsupported file type$ANSI_RESET")
                }
            }
        }

        inFile.isFile && inFile.validMDDFileType -> {
            generator.addFile(inFile)
        }

        else -> {
            println("${ANSI_RED}Invalid input file or directory specified$ANSI_RESET")
            return
        }
    }

    // Generate code
    if (generator.hasFiles())
        generator.generate()
    else
        println("${ANSI_YELLOW}No files were generated$ANSI_RESET")
}

