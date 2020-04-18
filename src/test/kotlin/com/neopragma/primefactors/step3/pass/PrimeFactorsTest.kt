package com.neopragma.primefactors.step3.pass

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class PrimeFactorsTest : DescribeSpec() {

    init {
        describe("Find the prime factors of an integer") {
            it("returns an empty list for the number 1") {
                primeFactorsOf(1) shouldBe listOf()
            }
            it("returns list (2) for the number 2") {
                primeFactorsOf(2) shouldBe listOf(2)
            }
            it("returns list (3) for the number 3") {
                primeFactorsOf(3) shouldBe listOf(3)
            }
        }
    }
}

