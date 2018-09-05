package com.example.mike.fluttertextfieldproblem


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.flutter.facade.Flutter


/**
 * A simple [Fragment] subclass.
 *
 */
class MyFlutterFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return Flutter.createView(requireActivity(), lifecycle, "home")
    }
}
