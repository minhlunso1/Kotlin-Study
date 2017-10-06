package main

import OuterInner.OuterClass
import OuterInner.OuterClassKotlin

/**
 * @author Minh
 * 10/6/2017
 */
fun main(args: Array<String>) {
    var a: OuterClass.InnerClass = OuterClass.InnerClass()
    a.setId(1)
    var b: OuterClass.InnerClass = OuterClass.InnerClass()
    b.setId(2)
    println("Get id from outer:" + OuterClass().idFromInner)
    println("a id:" + a.id)

    var c: OuterClassKotlin = OuterClassKotlin()
    var d: OuterClassKotlin.InnerClass = OuterClassKotlin.InnerClass
    d.setId(1)
    println("Get id from outer kotlin val:" + c.idFromInner)
    println("Get id from inner kotlin:" + OuterClassKotlin.InnerClass.getId())
    println("d id:" + d.getId())
}