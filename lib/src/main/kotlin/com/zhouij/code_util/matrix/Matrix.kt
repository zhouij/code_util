package com.zhouij.code_util.tree

fun buildIntMatrix(input: String): Array<IntArray> {
    val s = input.replace("[[", "").replace("]]", "")
    return s.split("],[").map {
        it.split(",").map {
            numberString -> numberString.toInt()
        }.toIntArray()
    }.toTypedArray()
}

fun matrixToString(input: Array<IntArray>): String {
    return "[[${input.joinToString("],[") {
        it.joinToString(",")
    }}]]"
}