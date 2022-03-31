package com.tcc.tenisdemesa.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.tcc.tenisdemesa.R

class FragmentHome : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.layout_fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.title = "Tennis Stats"
//        val toolbar = view.findViewById<Toolbar>(R.id.toolbar)
//        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)
//        toolbar.title = ""
//        toolbar.setNavigationOnClickListener {
//        }
    }
}