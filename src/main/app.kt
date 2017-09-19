package main

fun main(args: Array<String>) {
    println(Utils.displayProjectName())

    var firstName = "Min"
    val lastName = "Nguyen"
    firstName += "h"
    var name = firstName + " " + lastName
    var breakLine = """
        |Hello $name
        |My name is $firstName $lastName
        |3rd
        """.trimMargin("|")
    println(breakLine)

    var canBeNull : String?
    canBeNull = null

    val x = 5
    var isLarger = if (x > 2) {
        var i = x - 2
        "true $i"
    } else false
    println(canBeNull ?: isLarger)//show canBeNull value if canBeNull != null

    var myClass1 = MyClass(1)
    println("My class id: " + myClass1.id)
    var myClass2 = myClass1 as? MyClass//if myClass1 != null
    var myClass3 :MyClass?
    myClass3 = null
    if (myClass1 is MyClass)
        myClass3 = myClass1 as MyClass
    println("My class2 id:" + myClass2?.id)
    println("My class3 id:" + myClass3?.id)
    myClass3 = null
    var int3 = myClass3?.id
    var int3_1 = int3?.plus(2)
    var printInt3 = """
        |int3: $int3
        |int3_1: $int3_1
        """.trimMargin()
    println(printInt3)
    var myClass4 = MyClass(2, "b")
    println("My class4 name: " + myClass4.getNameM())

    var intArray : IntArray = intArrayOf(1,2,3,4,5)
    var intArray2 = IntArray(1)//value is 0
    printArrayValue(intArray)

    println(getScore(9))
}

//until, step, downTo
fun printArrayValue (intArray : IntArray, off : Int = 0, length : Int = intArray.size) {
//    for (item in intArray)
//        println(item)
//    for (i in intArray.indices) {
//        if (i in off..length)
//            println(intArray[i])
//    }
//    for (i in off..length step 1)
//        println(intArray[i])
    for (i in 4 downTo 1 step 2)
        println(intArray[i])
}

fun getScore(score : Int) : String {
    when (score) {
        9, 10 -> {
            val result = "good"
            return result.slice(IntRange(1,3))
        }
        in 6..8 ->
            return "ok"
        else ->
            return "fail"
    }
}