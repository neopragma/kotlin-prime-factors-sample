package com.neopragma.primefactors.checkerrors.fail

fun primeFactorsOf(num: Int): List<Int> {
    var workingValue = num
    val primes: MutableList<Int> = mutableListOf()
    var candidate = 2
    while (workingValue > 1) {
        while (workingValue % candidate == 0) {
            primes.add(candidate)
            workingValue /= candidate
        }
        candidate++
    }
    return primes
}


