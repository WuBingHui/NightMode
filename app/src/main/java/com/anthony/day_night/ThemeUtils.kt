package com.anthony.day_night

import android.app.Activity
import androidx.annotation.IntRange
import androidx.appcompat.app.AppCompatDelegate


class ThemeUtils() {


    enum class Mode {
        DAY,
        NIGHT,
        DEFAULT
    }

    companion object{
        private var dayMode = false

        private var nightMode = false

        private var followSystemMode = true


        private var currentStyle = R.style.MarioTheme

        fun changeTheme(activity: Activity) {
            if (followSystemMode) {
                // 預設設定為跟隨系統
                AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
                )
                currentStyle = R.style.MarioTheme
                activity.setTheme(currentStyle)
                return
            }
            if (dayMode) {
                currentStyle = R.style.MarioTheme_Day
                activity.setTheme(currentStyle)
                return
            }
            if (nightMode) {
                currentStyle = R.style.MarioTheme_Night
                activity.setTheme(currentStyle)
                return
            }
        }

        fun setMode(mode: Mode) {
            dayMode = false
            nightMode = false
            followSystemMode = false
            when (mode) {
                Mode.DAY -> {
                    dayMode = true
                }
                Mode.NIGHT -> {
                    nightMode = true
                }
                Mode.DEFAULT -> {
                    followSystemMode = true
                }
            }

        }
    }




}