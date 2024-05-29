package com.example.mymbti_tester

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class viewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 4 // 4개 페이지 사용
    }

    override fun createFragment(position: Int): Fragment {
        return questionFragment.newInstance(position)
    }
}