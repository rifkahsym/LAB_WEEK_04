package com.example.lab_week_04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.TextView

class CafeDetailFragment : Fragment() {

    companion object {
        const val ARG_DESCRIPTION = "ARG_DESCRIPTION"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Ambil data deskripsi dari argument fragment
        val description = arguments?.getString(ARG_DESCRIPTION) ?: ""

        // Tampilkan deskripsi di TextView
        val descriptionTextView = view.findViewById<TextView>(R.id.cafe_description)
        descriptionTextView.text = description
    }
}
