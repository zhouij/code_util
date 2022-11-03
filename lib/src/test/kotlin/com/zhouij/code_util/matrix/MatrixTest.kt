package com.zhouij.code_util.matrix

import com.zhouij.code_util.tree.buildIntMatrix
import com.zhouij.code_util.tree.matrixToString
import org.junit.Test
import kotlin.test.assertEquals

class MatrixTest {

    @Test
    fun `Test Matrix Generation`() {
        val input = "[[0,1,2,0],[3,4,5,2],[1,3,1,5]]"

        val matrix = buildIntMatrix(input)

        val result = matrixToString(matrix)

        assertEquals(input, result)
    }
}