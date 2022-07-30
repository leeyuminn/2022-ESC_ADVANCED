package example2


import kotlin.reflect.full.*    // required import

class Plant {
    fun trim(){}
    fun fertilize(){}
}

fun testAnnotations() {
    val classObj = Plant::class
    for (m in classObj.declaredMemberFunctions) {
        println(m.name)
    }
}

fun main() {
    testAnnotations()
}