package com.example.e_goal

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.*

class SetGoal : AppCompatActivity() {
   private lateinit var Listview: ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_goal)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w: Window = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }


//        val Lists = arrayListOf("C++", "Kotlin", "Python++", "Java", "C++")
//
//
////        btnAdd.setOnClickListener{
////            val TXTADD= txtAdd.text
////            Lists.add ("GoLAng")
////            Toast.makeText(applicationContext, "You have Added $TXTADD",Toast.LENGTH_SHORT).show()
////        }
//
//        Listview.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, Lists)
//
//        Listview.setOnItemClickListener { adapterView, view, i, l ->
//
//            Toast.makeText(applicationContext, "You Clicked " + Lists[i], Toast.LENGTH_SHORT).show()
//
//
//        }

    }
}