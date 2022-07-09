package com.example.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class FirstPageFragment : Fragment() {
    lateinit var bottomNav: BottomNavigationView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.first_page_main, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_page_main)
        loadFragment(FirstPageFragment())
        bottomNav = findViewById(R.id.bottom_nav) as BottomNavigationView
        bottomNav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.bottom_home -> {
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.bottom_search -> {
                    loadFragment(SearchFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.bottom_cart -> {
                    loadFragment(CartFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.bottom_profile -> {
                    loadFragment(PersonFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.bottom_more -> {
                    loadFragment(MoreFragment())
                    return@setOnNavigationItemReselectedListener
                }
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.container_first_page, fragment)
        transaction?.addToBackStack(null)
        transaction?.commit()
    }

}



