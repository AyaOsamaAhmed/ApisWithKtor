package com.aya.apiswithktor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.aya.apiswithktor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel =ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.search("burger")
        viewModel.list.observe(this, Observer {
            val  data = it as List<SearchResponse.BusinessResponse>

            binding.adapter = AdapterListBusiness(data)

        })

    }
}