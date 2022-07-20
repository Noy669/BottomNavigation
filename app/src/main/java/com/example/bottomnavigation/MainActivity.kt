package com.example.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNav: BottomNavigationView
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//          appBarConfiguration = AppBarConfiguration(
//            setOf(R.id.cart_layout)
//                    bottomNav.setupWithNavController (nav_host)}
        initView()
        bottomNav.setupWithNavController(navController)

    }

    fun initView() {
        bottomNav = findViewById(R.id.bottom_nav)
        navController = findNavController(R.id.fragment_container)
    }
//        bottomNav = findViewById(R.id.bottom_nav)
//        bottomNav.setOnItemSelectedListener {
//            when (it.itemId) {
//                R.id.bottom_home -> {
//                    loadFragment(HomeFragment())
//                    true
//                }
//                R.id.bottom_search -> {
//                    loadFragment(SearchFragment())
//                    true
//                }
//                R.id.bottom_cart -> {
//                    loadFragment(CartFragment())
//                    true
//                }
//                R.id.bottom_profile -> {
//                    loadFragment(PersonFragment())
//                    true
//                }
//                R.id.bottom_more -> {
//                    loadFragment(MoreFragment())
//                    true
//                }
//            }
//            true
//        }
//    }
//
//    private fun loadFragment(fragment: Fragment) {
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.container, fragment)
//            .addToBackStack("")
//            .commit()
//    }

}