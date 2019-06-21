package com.ixyxj.robot

import android.app.Application
import android.util.Log

/**
 * created by ixyxj on 2019/6/21 10:18
 */

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        Utils.startAccessibilitySettings(this)
    }
}