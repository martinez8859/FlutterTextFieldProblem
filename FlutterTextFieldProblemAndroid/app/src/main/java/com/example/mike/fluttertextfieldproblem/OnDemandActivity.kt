package com.example.mike.fluttertextfieldproblem

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_drawer.*

class OnDemandActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawer)

        flutterBtn.setOnClickListener {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.flutter, MyFlutterFragment(), "flutter_fragment_tag").commitNow()
        }
    }
}
