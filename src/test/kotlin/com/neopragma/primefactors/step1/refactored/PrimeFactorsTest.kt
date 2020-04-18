package com.neopragma.primefactors.step1.refactored

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class PrimeFactorsTest : DescribeSpec() {

    init {
        describe("Find the prime factors of an integer") {
            it("returns an empty list for the number 1") {
                primeFactorsOf(1) shouldBe listOf()
            }
        }
    }
}
