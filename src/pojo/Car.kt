package pojo

/**
 * @author Minh
 * 9/17/2017
 */
sealed class Car {
    data class Honda(val speed: Int) : Car()
    data class Bugatti(val speed: Int, val boost: Int) : Car()
    object Mockup : Car()
}