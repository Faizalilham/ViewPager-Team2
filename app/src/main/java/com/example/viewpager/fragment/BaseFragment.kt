package com.example.viewpager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager.R
import com.example.viewpager.adapter.ViewPagerAdapter
import com.example.viewpager.databinding.FragmentBaseBinding


class BaseFragment : Fragment() {

    private lateinit var binding : FragmentBaseBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBaseBinding.inflate(layoutInflater)
        val viewPagerAdapter = ViewPagerAdapter(childFragmentManager)
        binding.viewPager.adapter = viewPagerAdapter
        binding.Tablayout.setupWithViewPager(binding.viewPager)
        return binding.root
    }


}