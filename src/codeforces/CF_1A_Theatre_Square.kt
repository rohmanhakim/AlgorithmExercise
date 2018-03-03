package codeforces

import java.util.*

// http://codeforces.com/problemset/problem/1/A
fun leastFlagStones(squareLength: Long, paveLength: Long): Long =
        if((squareLength % paveLength) > 0) (squareLength / paveLength) + 1 else (squareLength / paveLength)

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextLong()
    val m = nextLong()
    val a = nextLong()

    println(leastFlagStones(n,a) * leastFlagStones(m,a))
}