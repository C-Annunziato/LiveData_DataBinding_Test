package com.example.livedatatest

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

const val LOGTAG = "Log"

class MainViewModel : ViewModel() {


    private val _button1 = MutableLiveData<Int>(0)
    val button1: LiveData<Int> = _button1

    private val _inc = MutableLiveData<Int>()
    val inc: LiveData<Int> = _inc

//   fun setButton(value: Int){
//       _button1.value = value
//   }

    fun increase(int : Int){
         _inc.value = when(int){

             1 -> 100
             2 -> 200
             else -> 0
         }
        _button1.value = _button1.value?.plus(_inc.value!!)
    }




}