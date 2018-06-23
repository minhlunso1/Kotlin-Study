package main

import components.Comparator
import pojo.Date

/**
 * @author Minh
 * 6/23/2018
 */
fun main(args: Array<String>) {
    val mutableCollection: MutableSet<Date> = HashSet()
    mutableCollection.add(Date(16 , 12 ,2014))
    mutableCollection.add(Date(16 , 12 ,2014))
    mutableCollection.add(Date(16 , 10 ,2014))
    println("HashSet size: ${mutableCollection.size}")//duplicate so the size is only 2

    println("Compare with custom Comparator:")
    mutableCollection.sortedWith(Comparator).forEach(){ println(it)}
    println("Ascending:")
    mutableCollection.sortedWith(compareBy({ it.year }, { it.month }, { it.day })).forEach { println(it) }
    println("Descending:")
    mutableCollection.sortedWith(compareByDescending<Date>{ it.year }.thenByDescending{it.month}.thenByDescending { it.day })
            .forEach { println(it) }
}