package com.tpa.HelepDoc.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.tpa.HelepDoc.chatFragments.ChatFragment
import com.tpa.HelepDoc.chatFragments.DoctorFragment
import com.tpa.HelepDoc.models.Doctor

class ChatAdapter(val fragmentManager:FragmentManager, val fragmentList: ArrayList<Fragment>, val titles: ArrayList<String>): FragmentStatePagerAdapter(fragmentManager) {


    override fun getItem(position: Int): Fragment {
        return fragmentList[position]

    }

    override fun getCount(): Int {
        return fragmentList.size
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }
}