package com.example.ujicoba

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders


class fragmentthird : Fragment() {
    // TODO: Rename and change types of parameters
    private var  viewmodel2: viewmodel? = null
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
        return inflater.inflate(R.layout.fragment_tiga,
            container, false)     }
    companion object {

        fun newInstance(): fragmentthird{
            return fragmentthird()         }
    }
}
