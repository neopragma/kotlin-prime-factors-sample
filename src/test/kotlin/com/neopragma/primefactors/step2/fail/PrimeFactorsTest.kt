package com.neopragma.primefactors.step2.fail

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class PrimeFactorsTest : DescribeSpec() {

    init {
        describe("Find the prime factors of an integer") {
            it("returns an empty list for the number 1") {
                primeFactorsOf(1) shouldBe listOf()
            }

            // We added the second example for the Prime Factors Kata.
            // We expect the new example to fail because the prime factors
            // of 2 are not an empty list.

            it("returns list (2) for the number 2") {
                primeFactorsOf(2) shouldBe listOf(2)
            }
        }
    }
}