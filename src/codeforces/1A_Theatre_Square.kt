package codeforces

import java.util.*

/**
 * Created by rohmanhakim on 3/2/18.
 */

// http://codeforces.com/problemset/problem/1/A
fun leastFlagStones(squareLength: Int, paveLength: Int): Int =
        if((squareLength % paveLength) > 0) (squareLength / paveLength) + 1 else (squareLength / paveLength)

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextInt()
    val m = nextInt()
    val a = nextInt()

    println(leastFlagStones(n,a) * leastFlagStones(m,a))
}