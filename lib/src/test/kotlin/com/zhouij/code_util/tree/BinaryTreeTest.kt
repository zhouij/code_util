package com.zhouij.code_util.tree

import org.junit.Test
import kotlin.test.assertEquals

class BinaryTreeTest {

    @Test
    fun `Test Building Tree`() {
        val root = buildBinaryTree("[2,1,4,null,null,3]")
        assertEquals(root?.`val`, 2)
    }
}