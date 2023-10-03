package com.ashok.githubdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getData() ;
    }

    fun getData(){
        Toast.makeText(this,"this is second commit",Toast.LENGTH_LONG).show()
    }
}