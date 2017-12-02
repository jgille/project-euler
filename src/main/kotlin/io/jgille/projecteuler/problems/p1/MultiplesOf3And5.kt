package io.jgille.projecteuler.problems.p1

object MultiplesOf3And5 {

    @JvmStatic
    fun sumMultiplesOf3And5(range: IntRange): Int {
        return range.filter { it % 3 == 0 || it % 5 == 0 }.sum()
    }

}
