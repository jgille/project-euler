package io.jgille.projecteuler.problems.p2

import spock.lang.Specification
import spock.lang.Unroll

import static io.jgille.projecteuler.problems.p2.EvenFibonacciNumbers.sumEvenFibonacciNumbers

class EvenFibonacciNumbersSpec extends Specification {

    @Unroll
    def "The sum of even fibonacci numbers not exceeding #max is #expected"(int max, int expected) {
        expect:
        sumEvenFibonacciNumbers(max) == expected

        where:
        max     | expected
        0       | 0
        2       | 2
        10      | 10
        35      | 44
        4000000 | 4613732
    }
}
