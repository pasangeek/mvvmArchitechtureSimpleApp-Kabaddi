package com.example.mvvm_architecture_example

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mvvm_architecture_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val  viewModel:ScoreViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

       // val scoreA: TextView = findViewById(R.id.textViewTeamA)
        val scoreB : TextView = findViewById(R.id.textViewTeamB)

       // val buttonA :Button = findViewById(R.id.button_A)
binding.viewModel= viewModel

       binding.buttonA.setOnClickListener {

            viewModel.incrementScore(true)
            binding.textViewTeamA.text = viewModel.scoreA.toString()


        }

    }
}