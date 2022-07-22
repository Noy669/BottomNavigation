package com.example.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNav: BottomNavigationView
    private lateinit var navController: NavController
    private lateinit var sideBar:NavigationView
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOf(R.id.cart_layout)
        initView()
        bottomNav.setupWithNavController(navController)
        sideBar.setupWithNavController(navController)
    }

    fun initView() {
        bottomNav = findViewById(R.id.bottom_nav)
        sideBar = findViewById(R.id.nav_view)
        navController = findNavController(R.id.fragment_container)
    }
}