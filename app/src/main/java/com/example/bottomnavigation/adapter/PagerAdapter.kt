package com.example.bottomnavigation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.bottomnavigation.CartFragment
import com.example.bottomnavigation.tablayout.OneTabLayot
import com.example.bottomnavigation.tablayout.ThreeTabLayout
import com.example.bottomnavigation.tablayout.TwoTabLayout

class PagerAdapter(fragmentActivity: CartFragment) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> OneTabLayot()
            1 -> TwoTabLayout()
            else -> ThreeTabLayout()
        }
    }

}