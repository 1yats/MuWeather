package com.muweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class MuWeatherApplication :Application(){

    companion object{

        const val TOKEN = "XlWBS6pbGfBtVPg9"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}