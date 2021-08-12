package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_calendar.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lateinit var navController: NavController
        navController = nav_host_fragment.findNavController()
    }

    override fun onBackPressed() {
        var fragmentList = supportFragmentManager.getFragments()
        for(fragment in fragmentList){
            if(fragment is onBackPressedListener){
                println("backpressesd")
                return
            }
        }
        super.onBackPressed()
    }
    interface onBackPressedListener{
        fun onBackPressed()
    }
}