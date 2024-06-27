package com.example.hw_01_m7.ui.fragment.viewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hw_01_m7.ui.fragment.cameraFragment.CameraFragment
import com.example.hw_01_m7.ui.fragment.doorFrament.DoorFragment


class ViewPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    private val fragments = listOf(
        CameraFragment(), DoorFragment()
    )
    override fun getItemCount() = fragments.size

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CameraFragment()
            1 -> DoorFragment()
            else -> CameraFragment()
        }
    }
}