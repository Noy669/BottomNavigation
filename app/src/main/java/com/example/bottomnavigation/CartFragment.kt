package com.example.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavigation.adapter.PagerAdapter
import com.example.bottomnavigation.databinding.FragmentCartBinding
import com.google.android.material.tabs.TabLayoutMediator

class CartFragment : Fragment() {

    private lateinit var binding: FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentCartBinding.inflate(layoutInflater)
        initial()
    }

    private fun initial() {
        binding.viewPager.adapter = PagerAdapter(this)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> tab.setIcon(R.drawable.first_tab_layout_icon)
                    .setText(R.string.first_tab_layout_text)
                1 -> tab.setIcon(R.drawable.second_tab_layout_icon)
                    .setText(R.string.second_tab_layout_text)
                2 -> tab.setIcon(R.drawable.third_tab_layout_icon)
                    .setText(R.string.third_tab_layout_text)
            }
        }.attach()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cart, container, false)
    }

}