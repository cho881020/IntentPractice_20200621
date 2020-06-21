package kr.co.namu.intentpractice_20200621

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

// SecondActivity로 새화면 추가
// 메인화면에서 "두번째 화면으로 이동" 문구를 가진 버튼 추가
// 누르면 SecondActivity로 이동

// SecondActivity에 닫기 버튼 배치
// 누르면 => 기존화면으로 복귀

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        closeBtn.setOnClickListener {

//            메인 화면으로 돌아가기 => 새 화면 호출 X, 지금 화면 종료

//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)

            finish()

        }
    }
}