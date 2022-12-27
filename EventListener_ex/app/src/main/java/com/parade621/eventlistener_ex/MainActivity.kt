package com.parade621.eventlistener_ex

import android.content.Intent
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import androidx.databinding.DataBindingUtil
import com.parade621.eventlistener_ex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,  R.layout.activity_main)

        binding.checkbox.setOnCheckedChangeListener(object:CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                Log.d("ListnerImplementWay1", "인터페이스를 구현한 object클래스를 이벤트 핸들러로 사용")
                val intent= Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }
        })
    }
}