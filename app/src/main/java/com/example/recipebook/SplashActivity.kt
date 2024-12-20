package com.example.recipebook

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Встановлюємо розмітку Splash Screen
        setContentView(R.layout.activity_splash)

        // Задаємо затримку перед переходом до основної активності
        Thread(Runnable {
            try {
                Thread.sleep(3000) // 3 секунди
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
            // Переходимо до головної активності після затримки
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish() // Завершуємо SplashActivity
        }).start()
    }
}

