package com.neopragma.primefactors.checkerrors.fail

import io.kotest.assertions.throwables.shouldThrow
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
                        row(9, listOf(3, 3)),
                        row(18, listOf(2, 3, 3)),
                        row(74, listOf(2, 37)),
                        row(4095, listOf(3, 3, 5, 7, 13))
                ).forAll { input, expected ->
                    primeFactorsOf(input) shouldBe expected
                }
            }
            it ("rejects input values less than 1") {
                shouldThrow<IllegalArgumentException> {
                    primeFactorsOf(0)
                }
            }
        }
    }
}

