package com.neopragma.primefactors.step6.pass

fun primeFactorsOf(num: Int): List<Int> {
    var workingValue = num
    val primes: MutableList<Int> = mutableListOf()
    if (workingValue > 1) {

        // Transformation #10 (if -> while)
        // This was the only change needed to make the example pass.

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


