package com.example.birthdaycardwithnavigation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val name= nameInput.editableText.toString()
        val intent = Intent(this, BirthdayGreet::class.java)
        intent.putExtra(BirthdayGreet.NAME_EXTRA, name)

        /*Toast.makeText(this,"Happy Birthday $name", Toast.LENGTH_LONG).show()*/

        startActivity(intent)
    }

}