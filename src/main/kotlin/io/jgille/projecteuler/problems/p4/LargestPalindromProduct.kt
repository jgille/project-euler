package io.jgille.projecteuler.problems.p4

import java.lang.Math.max

object LargestPalindromProduct {

    @JvmStatic
    fun largestPalindromProduct(xDigit: Int): Int {
        val max = IntRange(1, xDigit).map { "9" }.reduce { a, b -> a + b}.toInt()
        var res = 0
        (1..max).forEach { x ->
            (1..max)
                    .asSequence()
                    .map { x * it }
                    .filter { isPalindrom(it) }
                    .forEach { res = max(res, it) }
        }
        return res
    }

    private fun isPalindrom(x: Int): Boolean {
        return x.toString() == x.toString().reversed()
    }

}