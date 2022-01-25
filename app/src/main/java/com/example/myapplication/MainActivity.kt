package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    private val viewModel: MyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       viewModel.requestLogin("csj", "csj19921029")
        viewModel.mutableLiveData.observe(this){

            Log.e(TAG, "onCreate: ${it}" )

        }
    }
}