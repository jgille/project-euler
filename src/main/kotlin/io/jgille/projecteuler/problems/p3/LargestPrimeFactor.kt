package io.jgille.projecteuler.problems.p3

import java.lang.Math.ceil
import java.lang.Math.sqrt

object LargestPrimeFactor {

    @JvmStatic
    fun largestPrimeFactor(x: Long): Long {
        var res = x
        LongRange(2, ceil(sqrt(x.toDouble())).toLong()).forEach {
            while (res != it && res % it == 0L) {
                res /= it
            }
        }
        return res
    }
}