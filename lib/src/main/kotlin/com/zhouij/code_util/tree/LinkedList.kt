package com.zhouij.code_util.tree

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun buildLinkedList(input: String): ListNode? {
    val suedoRoot = ListNode(0)
    var curr = suedoRoot

    input.filter { !it.isWhitespace() }
        .filter { !"[]".contains(it) }
        .split(',')
        .forEach {
            val node = ListNode(it.toInt())
            curr.next = node
            curr = node
        }

    return suedoRoot.next
}

fun linkedListTraversal(root: ListNode?): String {
    val result = mutableListOf<Int>()

    var curr: ListNode? = root
    while (curr != null) {
        result.add(curr.`val`)
        curr = curr.next
    }
    return "[${result.joinToString(",")}]"
}
