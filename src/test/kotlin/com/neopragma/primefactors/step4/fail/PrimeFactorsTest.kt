package com.neopragma.primefactors.step4.fail

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.data.forAll
import io.kotest.data.headers
import io.kotest.data.row
import io.kotest.data.table
import io.kotest.matchers.shouldBe

class PrimeFactorsTest : DescribeSpec() {
    init {
        describe("Find the prime factors of an integer") {
            it("returns the list of prime factors for each input value") {
                table(
                        headers("input", "expected"),
                        row(1, listOf()),
                        row(2, listOf(2)),
                        row(3, listOf(3)),

                        // We add the fourth example for the Prime Factors kata.
                        // We expect this to fail because PrimeFactors.of() returns
                        // a list containing just the original input value, so in
                        // this case it will return a list containing 4.

                        row(4, listOf(2, 2))
                ).forAll { input, expected ->
                    com.neopragma.primefactors.step3.refactored.primeFactorsOf(input) shouldBe expected
                }
            }
        }
    }
}


