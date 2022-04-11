package com.example.myapplicationss.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplicationss.model.Pojo
import com.example.myapplicationss.repository.ListRepo

class ListViewModel : ViewModel() {

    public var list: MutableLiveData<List<Pojo>> = MutableLiveData()
    var repo :ListRepo?=null
    fun list(): LiveData<List<Pojo>> {
        return  list
    }
    fun post(){
        list.postValue(repo!!.getEmployeeList())
    }


}