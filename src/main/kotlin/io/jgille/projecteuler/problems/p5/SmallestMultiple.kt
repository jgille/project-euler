package io.jgille.projecteuler.problems.p5

object SmallestMultiple {

    @JvmStatic
    fun smallestMultiple(range: IntRange): Int {
        return IntRange(range.endInclusive, Int.MAX_VALUE)
                .find { x ->
                    range.all { y -> x % y == 0 }
                }!!
    }

}