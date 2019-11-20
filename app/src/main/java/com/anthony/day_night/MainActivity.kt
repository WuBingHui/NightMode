package com.anthony.day_night

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ThemeUtils.changeTheme(this)
        setContentView(R.layout.activity_main)

        followSystemBtn.setOnClickListener {
            ThemeUtils.setMode(ThemeUtils.Mode.DEFAULT)
            ThemeUtils.changeTheme(this)

            recreate()
        }

        dayBtn.setOnClickListener {
            ThemeUtils.setMode(ThemeUtils.Mode.DAY)
            ThemeUtils.changeTheme(this)

            recreate()
        }

        nightBtn.setOnClickListener {
            ThemeUtils.setMode(ThemeUtils.Mode.NIGHT)
            ThemeUtils.changeTheme(this)

            recreate()
        }


    }


}
