package com.hyun222.tistory.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gally.*

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
    }
}