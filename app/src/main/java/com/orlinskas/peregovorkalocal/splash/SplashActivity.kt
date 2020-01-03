package com.orlinskas.peregovorkalocal.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.orlinskas.peregovorkalocal.MainActivity

class SplashActivity : AppCompatActivity() {
    private lateinit var model: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        model = ViewModelProviders.of(this).get(SplashViewModel::class.java)

        //model.user when {
        //    have -> runMainActivity()
        //    not have -> runActivity(SomeActivity::class.java)
        //}

        runActivity(MainActivity::class.java)
    }

    private fun runMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun <T : Any?> runActivity(clazz: Class<T>) {
        val intent = Intent(this, clazz)
        startActivity(intent)
        finish()
    }
}