package com.chao.practice.grammar

import android.util.Log
import java.util.*

class MyGrammar {

    fun print(a: Int) {
        println("result is $a")
        val asc = Array(5, { i -> (i * 8 * i).toString() })
        val vexs = CharArray(5)
        val personArray = Array(5, { Person("chao", 2) })
//        val rets = Array<EData>(20)
        val my = arrayOfNulls<EData>(100)
        for (item in my) {
            Log.e("TAG", item.toString())
        }
        Log.e("TAG", "size =" + my.size)
        var s = "abc"
        val str = "length is ${s.length}"
        var x: Int = 0
        when (x) {
            1, 4 -> {
            }
            2 -> {
            }
            else -> {
            }
        }
    }

    class Person(var name: String, var id: Int)

    class EData constructor(var start: Char, var end: Char, var weight: Int)

    fun bubbleSort(array: IntArray) {
        array.withIndex()
        for (i in array.size - 1..0) {
            var flag = false
            for (j in 0..i) {
                if (array[j + 1] < array[j]) {
                    val tmp = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = tmp
                    flag = true
                }
            }
            if (!flag) break
        }
        Log.e("TAG",Arrays.toString(array))
    }
}