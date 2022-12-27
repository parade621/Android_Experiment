package com.parade621.eventlistener_ex

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.DataBindingUtil
import com.parade621.eventlistener_ex.databinding.ActivityMain3Binding


class MyEventHandler(val context:Context) : CompoundButton.OnCheckedChangeListener{
    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        Log.d("ListnerImplementWay3", "이벤트 핸들러를 별도의 클래스로 만들어 처리")
        val intent= Intent(context, MainActivity4::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
        context.startActivity(intent)

    }
}


class MainActivity3 : AppCompatActivity() {
    lateinit var binding:ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main3)

        binding.checkbox.setOnCheckedChangeListener(MyEventHandler(this))
    }
}