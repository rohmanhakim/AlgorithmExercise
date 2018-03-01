/**
 * Created by rohmanhakim on 3/1/18.
 */

import java.util.*

data class Tree(var left: Tree? = null, var right: Tree? = null) {
    var value = 0
}

operator fun Tree?.plus(x: Int): Tree? {
    if (this == null) return Tree().apply { value = x }
    if (x < value) {
        left += x
    } else {
        right += x
    }
    return this
}

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextInt()
    val k = nextInt()
    val a = Array(n) { IntArray(k) { nextInt() } }
    println(a.map { it.fold(null, Tree?::plus) }.toSet().size)
}
