package com.neopragma.primefactors.step3.pass

fun primeFactorsOf(num: Int): List<Int> {

    // So far, all examples call for a list containing the input value.
    // Transformation #4: (constant -> scalar)

    return if (num > 1) listOf(num) else listOf()
}
