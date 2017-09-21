package main

import OuterInner.OuterClass
import pojo.Car
import pojo.MyClass
import pojo.TV

fun main(args: Array<String>) {
    var myClassArray : ArrayList<MyClass> = ArrayList()
    myClassArray.add(MyClass(1, "M"))
    myClassArray.add(MyClass(2, "M2"))
    myClassArray.add(MyClass(3, "M3"))
    myClassArray.add(MyClass(4, "M4"))
    myClassArray.stream().filter{it.id > 2}.forEach({ println(it.name)})
    myClassArray.parallelStream().filter{it.id > 2}.forEach{
        it.name += "!"
        println(it.name)}

    val(param, value, word) = "id=1=one".split("=")
    println(param + " " + value + " " + word)
    val splitEquals = "id=1=one".split("=")
    splitEquals.stream().forEach{println(it)}

    myClassArray.get(0).doSth()
    println(myClassArray.get(0).getAgeWithMultiply(2))

    val tv1 = TV(1,1)
    val tv2 = tv1.copy(mid = 2)
    val tv3 = tv1.copy()
    println("TV same:" + tv1.equals(tv3))
    var (pid, mid) = tv2
    println("TV2 pid: " + pid)
    println("TV2 mid: " + mid.triple())

    val outerClass = OuterClass()
    println("Inner class id: " + outerClass.idFromInner)

    var sampleMyClass = TV.getMyClassFromTv(TV.getSampleTv())
    println("sampleMyClass id - name:" + sampleMyClass.id + " - " + sampleMyClass.getNameM())

    var honda = Car.Honda(1200)
    println("Speed: " + getSpeed(honda))
    println("Speed: " + getSpeed(Car.Mockup))
}

fun Int.triple(): Int = this * 3

fun getSpeed(car: Any): Int = when (car) {
    is Car.Honda -> car.speed
    is Car.Bugatti -> car.speed + car.boost
    Car.Mockup -> 0
    else -> -1
}