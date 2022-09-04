package com.example.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpager.fragment.CameraFragment
import com.example.viewpager.fragment.ChatFragment
import com.example.viewpager.fragment.PanggilanFragment
import com.example.viewpager.fragment.StatusFragment

class ViewPagerAdapter(fm : FragmentManager):FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int =  4
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> CameraFragment()
            1 -> ChatFragment()
            2 -> StatusFragment()
            else -> PanggilanFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> ""
            1 -> "CHAT"
            2 -> "STATUS"
            else -> "PANGGILAN"
        }
    }
}