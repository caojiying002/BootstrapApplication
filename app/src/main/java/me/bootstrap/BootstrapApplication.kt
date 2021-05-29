package me.bootstrap

import android.app.Application

class BootstrapApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        globalContext = this
    }
}