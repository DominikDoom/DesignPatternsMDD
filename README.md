# DesignPatternsMDD
This is a graded project for an introductory model-driven development (MDD) course at the [Technische Hochschule Mittelhessen](https://www.thm.de/site/).

---

The project's core idea is to use a metamodel framework for generating common design patterns that Java provides no easy native features for.
In addition to a normal [Ecore](https://en.wikipedia.org/wiki/Eclipse_Modeling_Framework#Ecore) model containing classes & their attributes, the modeler can also specify which patterns a class uses 
(e.g. Builder, Singleton, Observer, etc.).
This makes it possible to generate a complex application framework that allows for more algorithmic behavior to be modeled than is usual for MDD projects. 
It nonetheless still retainins a high amount of flexibility by not limiting the form the modeled packages & classes can take. This way, it serves as a
kind of extension to the base Ecore feature set for specifying common boilerplate code.

The project consists of two parts:
1. An eclipse-based metamodel project & accompanying eclipse plugin for running the generator on model files 
2. A command line tool for generating source files out of the models created in eclipse.

The generator CLI tool is written in Kotlin to make use of its modern functional features.
It processes a metamodel file or a folder containing them, generating appropriate `.java` files for
each model's classes and their patterns.

The generation process itself uses [JavaPoet](https://github.com/square/javapoet) and [KPoet](https://github.com/agrosner/KPoet)
to enable feature-rich class & code specification while avoiding template strings.

## Build
The generator CLI tool is set up using Maven.
#### To generate an executable JAR with all necessary dependencies included:
```
mvn clean compile assembly:single
```

## Usage
To run the generator on a model file, pass the input and (root) output path as arguments when executing the JAR:
```shell
java -jar DesignPatternGenerator-<version>.jar "<Ecore/Metamodel input file/directory>" "<CodeGen output directory>"
```
The specific output location for each generated file is dependent on the package names specified in the respective model.

**Ex.:** If the root output directory is `TestProject/src-gen/` and the model contains a package named `org.example.testproject.entities`,
the full path of all classes in this package will be `TestProject/src-gen/org/example/testproject/entities/*.java`.

Additional packages containing pattern-specific utility classes may be created to prevent redundant declaration.

## Footnotes
Collaborative project with [@rabitem](https://github.com/rabitem) and [@bluenido](https://github.com/bluenido)
