package generation

import java.util.*

enum class DesignPattern {
    NONE,
    OBSERVER,
    BUILDER,
    SINGLETON;

    infix fun and(other: DesignPattern) = DesignPatterns.of(this, other)
}

typealias DesignPatterns = EnumSet<DesignPattern>

infix fun DesignPatterns.allOf(other: DesignPatterns) = this.containsAll(other)
infix fun DesignPatterns.and(other: DesignPattern): EnumSet<DesignPattern> = DesignPatterns.of(other, *this.toTypedArray())