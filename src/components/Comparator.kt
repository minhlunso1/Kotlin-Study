package components

import pojo.Date
import kotlin.Comparator

/**
 * @author Minh
 * 6/23/2018
 */
class Comparator {
    companion object: Comparator<Date> {
        override fun compare(o1: Date, o2: Date): Int = when {
            o1.year != o2.year -> o1.year - o2.year
            o1.month != o2.month -> o1.month - o2.month
            else -> o1.day - o2.day
        }
    }
}