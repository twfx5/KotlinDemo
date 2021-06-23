package com.android.kotlindemo

class CommonUtils {

    private val index = 1

    companion object {
        var id = 2;
        @JvmStatic
        fun add(i : Int) {
            id += i
        }
        fun test() {

        }
    }
}