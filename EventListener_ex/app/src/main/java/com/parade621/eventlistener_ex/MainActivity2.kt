package com.parade621.eventlistener_ex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import androidx.databinding.DataBindingUtil
import com.parade621.eventlistener_ex.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity(),CompoundButton.OnCheckedChangeListener {
    lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,  R.layout.activity_main2)

        binding.checkbox.setOnCheckedChangeListener(this)
    }

    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        Log.d("ListnerImplementWay2", "액티비티 자체에 인터페이스를 구현현")
        val intent= Intent(this@MainActivity2, MainActivity3::class.java)
        startActivity(intent)
        finish()
    }
}