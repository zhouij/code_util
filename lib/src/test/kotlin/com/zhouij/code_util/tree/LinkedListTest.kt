package com.zhouij.code_util.tree

import org.junit.Test
import kotlin.test.assertEquals

class LinkedListTest {

    @Test
    fun `Test Building LinkedList`() {
        val input = "[1,2,3,4,5,6]"
        val linkedList = buildLinkedList(input)
        val output = linkedListTraversal(linkedList)
        assertEquals(input, output)
    }


}