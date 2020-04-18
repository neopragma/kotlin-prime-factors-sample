package com.neopragma.primefactors.step3.fail

fun primeFactorsOf(num: Int): List<Int> {
    return if (num > 1) listOf(2) else listOf()
}
