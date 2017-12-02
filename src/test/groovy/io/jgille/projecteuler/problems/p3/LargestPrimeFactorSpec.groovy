package io.jgille.projecteuler.problems.p3

import spock.lang.Specification
import spock.lang.Unroll

import static io.jgille.projecteuler.problems.p3.LargestPrimeFactor.largestPrimeFactor

class LargestPrimeFactorSpec extends Specification {

    @Unroll
    def "The largest prime factor of #x is #expected"(long x, long expected) {
        expect:
        largestPrimeFactor(x) == expected

        where:
        x            | expected
        13195        | 29
        600851475143 | 6857
    }
}
