package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.viewpager.databinding.ActivityMainBinding
import com.example.viewpager.fragment.BaseFragment
import com.example.viewpager.fragment.ChatFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setFragment(BaseFragment())

    }

    private fun setFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.container,fragment)
            commit()
        }
    }
}