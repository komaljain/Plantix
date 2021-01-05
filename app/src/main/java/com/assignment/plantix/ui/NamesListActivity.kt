package com.assignment.plantix.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.assignment.plantix.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NamesListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
