package com.neopragma.primefactors.step7.refactored

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

// Removed unnecessary code

//    if (workingValue > 1) {
//        primes.add(workingValue)
//    }
    return primes
}


