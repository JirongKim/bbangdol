package com.hyun222.tistory.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //앱이 최초 실행되었을 때 수행하는 것.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //xml 화면 뷰를 연결하는 구문.

        btn_login.setOnClickListener {
            var id = et_id.text.toString()
            var pw = et_pw.text.toString()
            if (id == "dw1447" && pw == "wlgus123"){
                //tv_login.setText("OK");
                    Toast.makeText(this@MainActivity, "로그인 성공!",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, GallyActivity::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체 생성.
                intent.putExtra("user_id",et_id.text.toString()) // 사용자가 입력한 ID를 id변수로 전달.
                startActivity(intent) //intent에 저장되어있는 액티비티 쪽으로 이동한다.
                finish() // 자기자신 액티비티를 파괴한다.
            }
            else{
                //tv_login.setText("NO");
                Toast.makeText(this@MainActivity, "ID나 PW를 확인해주세용가리",Toast.LENGTH_SHORT).show()
            }
        }
    }
}