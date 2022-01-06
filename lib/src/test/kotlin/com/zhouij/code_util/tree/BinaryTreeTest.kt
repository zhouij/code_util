package com.zhouij.code_util.tree

import org.junit.Test
import kotlin.test.assertEquals

class BinaryTreeTest {

    @Test
    fun `Test Building Tree`() {
        val input = "[2,1,4,null,null,3]"
        val root = buildBinaryTree(input)
        assertEquals(root!!.`val`, 2)
        val output = levelOrderTraversal(root)
        assertEquals(input, output)
    }
}