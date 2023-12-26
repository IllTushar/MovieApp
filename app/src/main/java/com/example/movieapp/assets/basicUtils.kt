package com.example.movieapp.assets

import android.content.Context
import android.widget.Toast

class basicUtils(private val context: Context) {
    fun toast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}