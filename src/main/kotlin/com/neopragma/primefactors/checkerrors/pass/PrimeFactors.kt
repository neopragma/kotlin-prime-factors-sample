package com.neopragma.primefactors.checkerrors.pass

fun primeFactorsOf(num: Int): List<Int> {
    if (num < 1) throw IllegalArgumentException("Input value must be a positive nonzero integer.")
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


