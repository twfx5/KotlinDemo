package com.android.kotlindemo

import android.content.Context

object CacheUtils {
    private var context: Context = BaseApplication.currentApplication()
    private var SP = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE)

    fun save(key: String, value: String) {
        SP.edit().putString(key, value).apply()
    }

    fun get(key: String): String? {
        return SP.getString(key, null)
    }
}