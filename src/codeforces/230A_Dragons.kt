package codeforces

import java.util.*

/**
 * Created by rohmanhakim on 3/1/18.
 */

// http://codeforces.com/problemset/problem/230/A
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var s = nextInt()
    val n = nextInt()

    val x = mutableListOf<Int>()
    val y = mutableListOf<Int>()

    (1..n).forEach {
        val xi = nextInt()
        val yi = nextInt()
        x.add(xi)
        y.add(yi)
    }

    (0..(n-1)).forEach { i ->
        if(s < x[i]) {
            println("NO")
            return@with
        } else if(s > x[i] && i == (n-1)){
            println("YES")
            return@with
        }

        s += y[i]
    }
}