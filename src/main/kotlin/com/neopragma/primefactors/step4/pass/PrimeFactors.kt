package com.neopragma.primefactors.step4.pass

fun primeFactorsOf(num: Int): List<Int> {
    var workingValue = num
    val primes: MutableList<Int> = mutableListOf()
    if (workingValue > 1) {

        // As long as the input value is evenly divisible by 2,
        // we add 2 to the list of primes, as that will be the
        // smallest possible prime factor.

        // Transformation #5 (statement -> statements)
        // Transformation #6 (unconditional -> if)

        if (workingValue % 2 == 0) {
            primes.add(2)
            workingValue /= 2
        }

        // After we've extracted all the 2's, we add the remaining
        // value to the list, unless it's 1.

        if (workingValue > 1) {
            primes.add(workingValue)
        }
    }
    return primes
}
