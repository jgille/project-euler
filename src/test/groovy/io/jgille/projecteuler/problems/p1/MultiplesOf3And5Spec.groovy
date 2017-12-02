package io.jgille.projecteuler.problems.p1

import kotlin.ranges.IntRange
import spock.lang.Specification
import spock.lang.Unroll

import static io.jgille.projecteuler.problems.p1.MultiplesOf3And5.sumMultiplesOf3And5

class MultiplesOf3And5Spec extends Specification {

    @Unroll
    def "The sum of multiples of 3 and 5 of all natural numbers below #max is #expected"(int max, int expected) {
        expect:
        sumMultiplesOf3And5(new IntRange(0, max - 1)) == expected

        where:
        max  | expected
        10   | 23
        20   | 78
        1000 | 233168
    }
}
