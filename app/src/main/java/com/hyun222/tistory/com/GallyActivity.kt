package com.hyun222.tistory.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gally.*
import kotlinx.android.synthetic.main.activity_main.*

class GallyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gally)

        if (intent.hasExtra("user_id")){
            tv_welcomeID.text = intent.getStringExtra("user_id") + "님 환영합니다!"
        }

        btn_next.setOnClickListener{
            iv_profile.setImageResource(R.drawable.bbangdol2)
        }

        btn_add.setOnClickListener{
            val intent = Intent(this, ListActivity::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체 생성.
            startActivity(intent) //intent에 저장되어있는 액티비티 쪽으로 이동한다.
        }
    }
}