package codeforces

import java.util.*

// http://codeforces.com/problemset/problem/230/A
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var s = nextInt()
    val n = nextInt()

    val x = mutableListOf<Pair<Int, Int>>()

    (1..n).forEach {
        val xi = nextInt()
        val yi = nextInt()
        x.add(Pair(xi, yi))
    }

    x.sortBy { it.first }

    (0..(n-1)).forEach { i ->
        if(s <= x[i].first) {
            println("NO")
            return@with
        } else {
            s += x[i].second
        }

        if(s > x[i].first && i == (n-1)){
            println("YES")
            return@with
        }
    }
}