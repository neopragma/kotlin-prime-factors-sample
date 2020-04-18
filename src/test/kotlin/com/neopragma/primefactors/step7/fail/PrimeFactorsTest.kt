package com.neopragma.primefactors.step7.fail

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
                        row(4, listOf(2, 2)),
                        row(6, listOf(2, 3)),
                        row(8, listOf(2, 2, 2)),

    // We add the example for 9, the 7th step in the kata.
    // We expect it to fail because the logic currently starts
    // by extracting 2's from the input value.

                        row(9, listOf(3, 3))
                ).forAll { input, expected ->
                    primeFactorsOf(input) shouldBe expected
                }
            }
        }
    }
}

