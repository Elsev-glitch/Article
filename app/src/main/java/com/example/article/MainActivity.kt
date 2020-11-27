package com.example.article

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
    lateinit var toolbar: Toolbar
    lateinit var toolbarImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        APP_ACTIVITY = this
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        title = ""

        toolbarImage = toolbar_image

        if (toolbarImage.visibility == View.VISIBLE){
            toolbarImage.visibility = View.GONE
        }
    }
}