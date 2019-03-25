package pojo

class MyClass public constructor(id: Int) {
    var id: Int = id
    var name: String? = null
    private var age: Int = 1

    //when need to implement codes in constructor otherwise set the property directly is fine to constructor
    init {
        this.id = id
    }

    constructor(id: Int, name: String): this(id) {
        this.name = name
    }

    fun getNameM(): String {
//        name?.let {
//            return name as String
//        }
//        return ""
        //could return null
        return name as String
    }

    fun doSth() {
        var a = "abc"
        println(a.dropLast(1))
        a = "aabc"
        println(a.dropWhile {it == 'a' || it == 'd'})
    }

    fun getAgeWithMultiply(mul: Int): Int = age * mul
}