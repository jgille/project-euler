package io.jgille.projecteuler.problems.p5

import kotlin.ranges.IntRange
import spock.lang.Specification
import spock.lang.Unroll

import static io.jgille.projecteuler.problems.p5.SmallestMultiple.smallestMultiple

class SmallestMultipleSpec extends Specification {

    @Unroll
    def "The smallest number that can be divided by each of the numbers from #min to #max without any remainder is #expected"(int min, int max,  int expected) {
        expect:
        smallestMultiple(new IntRange(min, max)) == expected

        where:
        min | max | expected
        1   | 10  | 2520
        1   | 20  | 232792560
    }
}
