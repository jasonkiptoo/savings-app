package com.example.e_goal

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.e_goal.databinding.ActivityMainBinding
import com.example.e_goal.databinding.ActivityMainBinding.inflate


class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var SavelayoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ReasonAdapter.ViewHolder>? = null
    private var Saveadapter: RecyclerView.Adapter<SavingAdapter.ViewHolder>? = null
    lateinit var recyclerView: RecyclerView
    lateinit var Saverecycler: RecyclerView
    lateinit var IVdeposit: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ////init the view Binding

        binding = inflate(layoutInflater)
        setContentView(binding.root)
//call the home fragment to be init when app opens
                ReplaceFragment(home())

///set the selected item from the Bottom_Navigation_bar
        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {

                R.id.menu_Home -> ReplaceFragment(home())
                R.id.menu_Profile -> ReplaceFragment(profile())
                R.id.menu_Save -> ReplaceFragment(save())
                else -> {
                }
            }
            true
        }


        //Code to make fullscreeN

//       if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            val w: Window = window
//            w.setFlags(
//                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
//            )
//        }

//        recyclerView = findViewById(R.id.recviewSavings)
//        Saverecycler = findViewById(R.id.recviewSavings)
//        IVdeposit = findViewById(R.id.IVdeposit)

        //call the deposit method
//        depositActivity()

//
//        layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        SavelayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        recyclerView.layoutManager = layoutManager
//        Saverecycler.layoutManager = SavelayoutManager
//        adapter = ReasonAdapter()
//        Saveadapter = SavingAdapter()
//        recyclerView.adapter = adapter
//        Saverecycler.adapter = Saveadapter


    }

    ///Code to replace the Frame Layout when a button is clicked
    //create a function Replace fragment
    private fun ReplaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
            val fragmentTransaction=fragmentManager.beginTransaction()
                    fragmentTransaction.replace(R.id.ConstraintFragment,fragment)
        fragmentTransaction.commit()


    }


    ////function to next activity
//    private fun depositActivity() {
//
//        IVdeposit.setOnClickListener {
//            val intent = Intent(applicationContext, SetGoal::class.java)
//            startActivity(intent)
//        }
//    }

}