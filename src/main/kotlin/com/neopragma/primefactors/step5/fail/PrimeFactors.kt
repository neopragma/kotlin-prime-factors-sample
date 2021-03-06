package com.neopragma.primefactors.step5.fail

fun primeFactorsOf(num: Int): List<Int> {
    var workingValue = num
    val primes: MutableList<Int> = mutableListOf()
    if (workingValue > 1) {
        if (workingValue % 2 == 0) {
            primes.add(2)
            workingValue /= 2
        }
        if (workingValue > 1) {
            primes.add(workingValue)
        }
    }
    return primes
}

