package com.neopragma.primefactors.step2.pass

fun primeFactorsOf(num: Int): List<Int> {

    // When the input value is greater than 1, return a list containing 2.
    // Obviously not a complete solution, but the minimum code necessary
    // to make all the examples pass. To flesh out the solution we must
    // write appropriate examples to drive out the logic step by step.

    return if (num > 1) listOf(2) else listOf()
}
