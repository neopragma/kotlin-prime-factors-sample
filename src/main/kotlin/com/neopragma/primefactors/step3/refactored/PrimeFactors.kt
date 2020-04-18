package com.neopragma.primefactors.step3.refactored

fun primeFactorsOf(num: Int): List<Int> {
    return if (num > 1) listOf(num) else listOf()
}
