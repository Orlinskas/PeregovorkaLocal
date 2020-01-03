package com.orlinskas.peregovorkalocal

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(applicationContext, "Done", Toast.LENGTH_LONG).show()
    }
}
