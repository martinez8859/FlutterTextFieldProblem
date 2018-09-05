package com.example.mike.fluttertextfieldproblem

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class BasicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)

        supportFragmentManager.beginTransaction()
                .replace(R.id.flutter, MyFlutterFragment(), "flutter_fragment_tag").commitNow()
    }
}
