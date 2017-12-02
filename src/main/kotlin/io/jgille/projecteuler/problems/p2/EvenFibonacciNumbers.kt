package io.jgille.projecteuler.problems.p2

object EvenFibonacciNumbers {

    @JvmStatic
    fun sumEvenFibonacciNumbers(maxValue: Int): Int {
        return sumEvenFibonacciNumbers(0, FibonnaciTerm(0, 1), maxValue)
    }

    private fun sumEvenFibonacciNumbers(sum: Int, term: FibonnaciTerm, maxValue: Int): Int {
        val value = term.value()
        if (value > maxValue) {
            return sum
        }
        val newSum = sum + if (even(value)) value else 0
        return sumEvenFibonacciNumbers(newSum, term.next(), maxValue)
    }

    private fun even(value: Int) = value % 2 == 0

}

data class FibonnaciTerm(val t0: Int, val t1: Int) {

    fun value() = t0 + t1

    fun next(): FibonnaciTerm {
        return FibonnaciTerm(t1, value())
    }
}