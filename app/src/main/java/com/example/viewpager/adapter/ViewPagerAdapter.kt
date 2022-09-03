package com.example.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpager.fragment.ChatFragment
import com.example.viewpager.fragment.PanggilanFragment
import com.example.viewpager.fragment.StatusFragment

class ViewPagerAdapter(fm : FragmentManager):FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int =  3
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> ChatFragment()
            1 -> StatusFragment()
            else -> PanggilanFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "CHAT"
            1 -> "STATUS"
            else -> "PANGGILAN"
        }
    }
}