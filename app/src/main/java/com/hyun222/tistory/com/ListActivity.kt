package com.hyun222.tistory.com

import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    var userList = arrayListOf<user>(
        user(R.drawable.bbangdol, "빵돌이", "2살", "빵돌이에용가리!"),
        user(R.drawable.yeontan, "연탄이", "2살", "연탄냥"),
        user(R.drawable.hodoo, "호두", "1살", "찍!"),
        user(R.drawable.shintang, "신탕", "6살", "보씨 아니에요"),
        user(R.drawable.kong, "콩이", "3살", "강낭콩"),
        user(R.drawable.gom, "곰이", "5살", "고옴")
    )

    override fun onCreate(savedInstanceState: Bundle?) { //액티비티 시작지
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

//        val item = arrayOf("말티즈","스피츠","푸들","시츄","말미잘")
//        //context는 한 액티비티의 모든 정보를 담고 있다.
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

        val Adapter = userAdapter(this, userList)
        listView.adapter = Adapter

        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                val selectItem = parent.getItemAtPosition(position) as user
                Toast.makeText(this, selectItem.greeting, Toast.LENGTH_SHORT).show()
            }


    }
}

