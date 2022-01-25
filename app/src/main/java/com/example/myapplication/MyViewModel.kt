package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MyViewModel:ViewModel() {
    val mutableLiveData=MutableLiveData<RespBean>()


    fun requestLogin( usrName:String,passWord:String){
        viewModelScope.launch {
            val login = RetrofitServiceManager.getApi().login(usrName, passWord)
            mutableLiveData.value=login
        }

    }
}