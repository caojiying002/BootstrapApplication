package me.bootstrap

import android.app.Application

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        globalContext = this
    }
}