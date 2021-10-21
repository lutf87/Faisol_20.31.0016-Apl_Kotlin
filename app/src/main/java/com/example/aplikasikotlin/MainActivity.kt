package com.example.aplikasikotlin

import android.icu.text.UnicodeSet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun submit_btn(view: View){
        val namaEditText = findViewById<EditText>(R.id.nama)
        val nama = namaEditText.text.toString()

        val say = "Hi "
        val say1 = ", "
        val say2 = " Wellcome to Android Studio!"
        val toast = Toast.makeText(applicationContext, say + nama+say1+say2, Toast.LENGTH_SHORT)
        toast.show()
    }
}