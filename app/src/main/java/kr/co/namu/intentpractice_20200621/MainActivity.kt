package kr.co.namu.intentpractice_20200621

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstActivityBtn.setOnClickListener {
//            Intent 객체 생성 => 비행기 티켓 발권
            val myIntent = Intent(this, FirstActivity::class.java)

//            실제 인텐트 사용 => 비행기 탑승 (출발)
            startActivity(myIntent)

        }

//        Ctrl + Alt + L (윈도우)
//        Cmd + option + L (맥)  => 들여쓰기 자동 정리

        goToSecondBtn.setOnClickListener {

            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)

        }

        goToThirdBtn.setOnClickListener {

//            적혀있는 메세지가 뭔지 받아서 (1) => 화면이동시 전달 (2)

//            메세지 내용을 변수에 기록
            val inputMessage = messageEdt.text.toString()

//            일단 화면 이동 코드부터 작성
            val myIntent = Intent(this, ThirdActivity::class.java)
//            인텐트에 추가 데이터 첨부 : 이름표 / 실제값 쌍으로 첨부.
            myIntent.putExtra("message", inputMessage)
            startActivity(myIntent)

        }


    }
}