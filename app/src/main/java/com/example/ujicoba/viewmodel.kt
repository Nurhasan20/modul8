package com.example.ujicoba

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//inisialisasi tipe data
class viewmodel : ViewModel(){
    private val mName = MutableLiveData<String>()
    val name : LiveData<String>
        get() = mName

    fun setName(name:String){
        mName.value = name
    }
}
