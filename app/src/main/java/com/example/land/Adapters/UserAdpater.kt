package com.example.land.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.land.R
import com.example.land.Model.User

class UserAdpater(val context: Context,val UserList:ArrayList<User> ): BaseAdapter(){
    override fun getCount(): Int {
    return UserList.size
    }

    override fun getItem(position: Int): Any {
    return UserList[position]
    }

    override fun getItemId(position: Int): Long {
    return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
    val view: View= LayoutInflater.from(context).inflate(R.layout.list_item_user, null)//view 붙이기
        val profile = view.findViewById<ImageView>(R.id.roopImage)
        val name = view.findViewById<TextView>(R.id.tv_name)
        val price = view.findViewById<TextView>(R.id.price)
        val floor = view.findViewById<TextView>(R.id.floor)

        val user =UserList[position]
        profile.setImageResource(user.profile)
        name.text = user.name
        price.text = user.price.toString()
        floor.text = user.floor.toString()


        return view

    }


}