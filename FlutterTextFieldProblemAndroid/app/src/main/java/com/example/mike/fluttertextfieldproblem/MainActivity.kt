package com.example.mike.fluttertextfieldproblem

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        basicBtn.setOnClickListener {
            startActivity(Intent(this, BasicActivity::class.java))
        }

        onDemandBtn.setOnClickListener {
            startActivity(Intent(this, OnDemandActivity::class.java))
        }
    }
}
