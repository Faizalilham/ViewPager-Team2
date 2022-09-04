package com.example.viewpager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.viewpager.R
import com.example.viewpager.adapter.ViewPagerAdapter
import com.example.viewpager.databinding.FragmentBaseBinding
import com.google.android.material.tabs.TabLayout


class BaseFragment : Fragment() {

    private lateinit var binding : FragmentBaseBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBaseBinding.inflate(layoutInflater)
        val viewPagerAdapter = ViewPagerAdapter(childFragmentManager)
        binding.viewPager.adapter = viewPagerAdapter
        binding.viewPager.setCurrentItem(1,true)
        binding.Tablayout.apply {
            setupWithViewPager(binding.viewPager)
            getTabAt(0)?.setIcon(R.drawable.ic_camera)
            setTabWidthAsWrapContent(0)
        }
        return binding.root
    }

    private fun TabLayout.setTabWidthAsWrapContent(tabPosition: Int) {
        val layout = (this.getChildAt(0) as LinearLayout).getChildAt(tabPosition) as LinearLayout
        val layoutParams = layout.layoutParams as LinearLayout.LayoutParams
        layoutParams.weight = 0f
        layoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT
        layout.layoutParams = layoutParams
    }


}