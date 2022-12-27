package com.parade621.eventlistener_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.parade621.eventlistener_ex.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    lateinit var binding:ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main4)

        binding.checkbox.setOnCheckedChangeListener { compoundButton, b ->
            Log.d("ListnerImplementWay4", "SAM기법으로 구현")
        }
    }
}