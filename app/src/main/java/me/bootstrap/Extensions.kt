package me.bootstrap

import android.annotation.SuppressLint
import android.content.Context

// initialized via Application.onCreate()
// only application(global) context allowed
@SuppressLint("StaticFieldLeak")
lateinit var globalContext : Context