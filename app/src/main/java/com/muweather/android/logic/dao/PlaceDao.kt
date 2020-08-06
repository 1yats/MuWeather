package com.muweather.android.logic.dao

import android.content.Context
import android.provider.Settings.Global.putString
import androidx.core.content.edit
import com.google.gson.Gson
import com.muweather.android.MuWeatherApplication
import com.muweather.android.logic.model.Place

object PlaceDao {

    fun savePlace(place :Place){
        sharedPreferences().edit{
            putString("place",Gson().toJson(place))
        }
    }

    fun getSacedPlace():Place{
        val placeJson = sharedPreferences().getString("place","")
        return Gson().fromJson(placeJson,Place::class.java)
    }

    fun isPlaceSaced() = sharedPreferences().contains("place")

    private fun sharedPreferences() = MuWeatherApplication.context.
        getSharedPreferences("mu_weather",Context.MODE_PRIVATE)
}