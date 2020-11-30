package com.example.ujicoba

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class fragment_second : Fragment() {
    // TODO: Rename and change types of parameters
    private var viewmodel2: viewmodel? = null
    private var txtName: TextView? = null
//inisialisasi data
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewmodel2 = ViewModelProviders.
            of(requireActivity()).   get(viewmodel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?     ): View? {
        return inflater.inflate(R.layout.fragment_second,
            container, false)     }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {         super.onViewCreated(view, savedInstanceState)
        txtName = view.findViewById(R.id.textViewName)
        viewmodel2!!.name.observe(requireActivity(),
            Observer { s -> txtName!!.text = s })
    }

    companion object {
        fun newInstance(): fragment_second {
            return fragment_second()         }
    }

}
