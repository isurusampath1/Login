package com.isoft.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        this.setTitle("Dashboard")
    }
}
