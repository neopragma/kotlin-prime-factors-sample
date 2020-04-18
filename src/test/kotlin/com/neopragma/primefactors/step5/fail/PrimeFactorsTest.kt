package com.neopragma.primefactors.step5.fail

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

                        // We add the 5th example for the Prime Factors kata.
                        // We expect it to pass because the prime factors of 6
                        // follow the same pattern as those of 4.

                        // As TDD practitioners, we are not comfortable with an
                        // example that passes on the first try. So, we alter the
                        // expected value in order to see that the example can fail
                        // for the right reason.

                        row(6, listOf(2, 4))  // <- should be (2, 3)
                ).forAll { input, expected ->
                    primeFactorsOf(input) shouldBe expected
                }
            }
        }
    }
}
