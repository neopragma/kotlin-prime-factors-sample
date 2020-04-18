package com.neopragma.primefactors.step3.refactored

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.data.forAll
import io.kotest.data.headers
import io.kotest.data.row
import io.kotest.data.table
import io.kotest.matchers.shouldBe

class PrimeFactorsTest : DescribeSpec() {

    // Refactored the similar examples into a data-driven or parameterized test.

    init {
        describe("Find the prime factors of an integer") {
            it("returns the list of prime factors for each input value") {
                table(
                    headers("input", "expected"),
                    row(1, listOf()),
                    row(2, listOf(2)),
                    row(3, listOf(3))
                ).forAll { input, expected ->
                    primeFactorsOf(input) shouldBe expected
                }
            }
        }
    }
}

