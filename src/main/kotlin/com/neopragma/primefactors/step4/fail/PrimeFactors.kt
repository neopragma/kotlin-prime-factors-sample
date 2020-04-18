package com.neopragma.primefactors.step4.fail

fun primeFactorsOf(num: Int): List<Int> {
    return if (num > 1) listOf(num) else listOf()
}
