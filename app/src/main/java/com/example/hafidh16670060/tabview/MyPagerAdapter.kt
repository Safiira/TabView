package com.example.hafidh16670060.tabview

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


class MyPagerAdapter (fm: FragmentManager):FragmentPagerAdapter(fm){
    private val pages = listOf(
        tab1(),
        tab2(),
        tab3(),
        tab4()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Profil"
            1 -> "Teman"
            2 -> "UPGRIS"
            else -> "Informatika"
        }
    }
}