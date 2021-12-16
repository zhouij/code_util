package com.zhouij.code_util.tree

import java.util.*

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun buildBinaryTree(input: String): TreeNode? {

    val values = input.filter { !it.isWhitespace() }
        .filter { !"[]".contains(it) }
        .split(',')

    if (values.isEmpty()) return null

    val q = LinkedList<TreeNode>()

    val root = buildTreeNode(values[0])
    q.addFirst(root)

    var index = 1
    while (index < values.size) {
        val curr = q.removeLast()
        val left = buildTreeNode(values[index++])
        curr.left = left
        if (left != null) {
            q.addFirst(left)
        }
        if (index == values.size) break
        val right = buildTreeNode(values[index++])
        curr.right = right
        if (right != null) {
            q.addFirst(right)
        }
    }
    return root
}

private fun buildTreeNode(input: String): TreeNode? {
    return if (input == "null") null
    else TreeNode(input.toInt())
}