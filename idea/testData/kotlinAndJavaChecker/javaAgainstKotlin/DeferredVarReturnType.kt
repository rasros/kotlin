// ALLOW_AST_ACCESS
class A {
    var foo = bar()

    @JvmField
    var foobaz = bar()
}

fun bar(): String = ""
