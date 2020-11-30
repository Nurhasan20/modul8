package com.example.ujicoba

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.textfield.TextInputEditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

//inisialisasi
class First : Fragment() {
    // TODO: Rename and change types of parameters
    private var viewmodel2 : viewmodel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewmodel2 =  ViewModelProviders.of(requireActivity()).
            get(viewmodel::class.java)     }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?     ): View? {
        return inflater.inflate(R.layout.fragment_first,
            container, false)     }

    override fun onViewCreated(view: View,    savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameEditText = view.findViewById<TextInputEditText>(R.id.textInputTextName)
        nameEditText.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int) {

                }

                override fun onTextChanged(charSequence: CharSequence,
                                           i: Int, i1: Int, i2: Int) {
                    viewmodel2!!.setName(charSequence.toString())             }

                override fun afterTextChanged(editable: Editable) {

                }
            })
    }

    companion object {
        fun newInstance(): First
        {             return First()
        }
    }
}
