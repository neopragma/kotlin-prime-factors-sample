package com.neopragma.primefactors.step7.fail

fun primeFactorsOf(num: Int): List<Int> {
    var workingValue = num
    val primes: MutableList<Int> = mutableListOf()
    if (workingValue > 1) {
        while (workingValue % 2 == 0) {
            primes.add(2)
            workingValue /= 2
        }
        if (workingValue > 1) {
            primes.add(workingValue)
        }
    }
    return primes
}


