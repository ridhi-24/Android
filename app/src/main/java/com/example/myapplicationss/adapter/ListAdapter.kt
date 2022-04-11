package com.example.myapplicationss.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationss.R
import com.example.myapplicationss.model.Pojo

class ListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var list: List<Pojo>? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ViewHolder {
        val context = parent.context
        val inflater =LayoutInflater.from(context)
        val contactview =inflater.inflate(R.layout.list,parent,false)
        return ViewHolder(contactview)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val list :Pojo=list!!.get(position)
// will set the data


    }

    override fun getItemCount(): Int {
        if(list!=null){
            return  list!!.size

        }else{
            return  0
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textview = itemView.findViewById<TextView>(R.id.text)
        val image = itemView.findViewById<ImageView>(R.id.image)
    }

}