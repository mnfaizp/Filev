package com.example.filev.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.filev.SectionPagerAdapter
import com.example.filev.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)

        val sectionPagerAdapter = SectionPagerAdapter(this, supportFragmentManager)
        activityHomeBinding.viewPager.adapter = sectionPagerAdapter
        activityHomeBinding.tab.setupWithViewPager(activityHomeBinding.viewPager)

        supportActionBar?.elevation = 0f
    }
}