package com.example.myapplicationss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationss.adapter.ListAdapter
import com.example.myapplicationss.viewmodel.ListViewModel

class MainActivity : AppCompatActivity() {
     var  viewmodel :ListViewModel?=null
    var adapter : ListAdapter?=null
    init {
        var list :RecyclerView?=null
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewmodel!!.list.observe(this){
            adapter =ListAdapter()
            adapter!!.list =it
            adapter!!.notifyDataSetChanged()
        }

        //recycler view adapter set
        viewmodel!!.post()
    }
}