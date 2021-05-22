package com.hyun222.tistory.com

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class userAdapter ( val context: Context, val userList: ArrayList<user>) : BaseAdapter()
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View = LayoutInflater.from(context).inflate(R.layout.custom, null)

        val profile = view.findViewById<ImageView>(R.id.iv_dog)
        val name = view.findViewById<TextView>(R.id.tv_name)
        val age = view.findViewById<TextView>(R.id.tv_age)
        val greet = view.findViewById<TextView>(R.id.tv_greet)

        val user = userList[position]

        profile.setImageResource(user.profile)

        name.text = user.name
        age.text = user.age
        greet.text = user.greeting

        return view
    }

    override fun getCount(): Int {
        return userList.size
    }

    override fun getItem(position: Int): Any {
        return userList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

}