package com.neopragma.primefactors.step7.pass

fun primeFactorsOf(num: Int): List<Int> {
    var workingValue = num
    val primes: MutableList<Int> = mutableListOf()

    // Move this declaration outside the scope of the first 'if' (now 'while').
    // Transformation #5 (statement -> statements)

    var candidate = 2

    // Transformation #10 (if -> while)

    while (workingValue > 1) {

        // The lowest prime might not be 2, so we start with 2
        // and then continue using whatever remains after the 2's
        // have been extracted as the next candidate prime.

        // Transformation #4 (constant -> scalar)

        while (workingValue % candidate == 0) {
            primes.add(candidate)
            workingValue /= candidate
        }

        // Next candidate to try.
        // Transformation #5 (statement -> statements)

        candidate++
    }
    if (workingValue > 1) {
        primes.add(workingValue)
    }
    return primes
}


