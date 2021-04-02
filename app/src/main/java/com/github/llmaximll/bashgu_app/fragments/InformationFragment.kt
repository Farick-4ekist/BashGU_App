package com.github.llmaximll.bashgu_app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.llmaximll.bashgu_app.R

class InformationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_information, container, false)



        return view
    }

    companion object {
        fun newInstance(): InformationFragment {
            return InformationFragment()
        }
    }
}