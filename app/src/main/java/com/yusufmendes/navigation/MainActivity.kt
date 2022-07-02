package com.yusufmendes.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    private lateinit var navgationController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //navigation action bar islemleri
        navgationController = Navigation.findNavController(this,R.id.fragment)
        NavigationUI.setupActionBarWithNavController(this,navgationController)


    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navgationController,null)
    }
}