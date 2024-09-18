package com.example.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class CafeAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    private val cafeDescriptions = listOf(
        "Starbucks is known for its coffee and pastries.",
        "Janji Jiwa offers a variety of coffee and tea drinks.",
        "Kopi Kenangan provides a unique coffee experience."
    )

    override fun getItemCount(): Int {
        return cafeDescriptions.size
    }

    override fun createFragment(position: Int): Fragment {
        // Membuat fragment baru dan meneruskan data deskripsi cafe
        return CafeDetailFragment().apply {
            arguments = Bundle().apply {
                putString(CafeDetailFragment.ARG_DESCRIPTION, cafeDescriptions[position])
            }
        }
    }
}