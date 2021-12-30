package com.example.simplearchitecture1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.simplearchitecture1.base.BaseActivity
import com.example.simplearchitecture1.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding,MainViewModel>(){

    override val layoutId = R.layout.activity_main
    override val viewModel : MainViewModel by viewModels()
    override fun init() {
        viewModel.getTeam()
    }

}