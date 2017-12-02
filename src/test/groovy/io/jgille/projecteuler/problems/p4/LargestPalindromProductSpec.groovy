package io.jgille.projecteuler.problems.p4

import spock.lang.Specification
import spock.lang.Unroll

import static io.jgille.projecteuler.problems.p4.LargestPalindromProduct.largestPalindromProduct

class LargestPalindromProductSpec extends Specification {

    @Unroll
    def "The largest palindrom product of two #x-digit numbers is #expected"(int x, int expected) {
        expect:
        largestPalindromProduct(x) == expected

        where:
        x | expected
        1 | 9
        2 | 9009
        3 | 906609
    }
}
