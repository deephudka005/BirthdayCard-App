package com.example.birthdaycardwithnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_birthday_greet.*

class BirthdayGreet : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)
        val name=intent.getStringExtra(NAME_EXTRA)
        birthdayGreeting.text="Happy Birthday\n$name!"

    }
}