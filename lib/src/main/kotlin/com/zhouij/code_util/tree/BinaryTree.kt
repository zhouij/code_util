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

fun levelOrderTraversal(root: TreeNode): String {
    val result = mutableListOf<String>()
    val q = LinkedList<TreeNode?>()
    q.addFirst(root)
    while (!q.isEmpty()) {
        val curr = q.removeLast()
        if (curr == null) {
            result.add("null")
        } else {
            result.add(curr.`val`.toString())
            q.addFirst(curr.left)
            q.addFirst(curr.right)
        }
    }
    removeTrailingWords(result, "null")
    return "["+ result.joinToString(separator = ",") + "]"
}

fun removeTrailingWords(input: MutableList<String>, word: String) {
    var curr = input.last()
    while (curr == word) {
        input.removeLast()
        curr = input.last()
    }
}

vfrrdr
private fun buildTreeNode(input: String): TreeNode? {
    return if (input == "null") null
    else TreeNode(input.toInt())
}