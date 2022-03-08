package com.mars.infra.lego.test.action

import android.util.Log
import com.mars.infra.lego.api.Action

/**
 * Created by Mars on 2022/3/8
 */
class SecondAction: Action<Unit> {

    private var time: Long = 0

    override fun performAction() {
        time -= System.currentTimeMillis()
        Thread.sleep(200)
        time += System.currentTimeMillis()
        Log.e("mars", "SecondAction performTask invoke, and spend $time ms")
    }
}