package com.example.mvvm_architecture_example

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel:ViewModel(){

    private val _scoreA = MutableLiveData <Int>(0)
    private val _scoreA2 = MutableLiveData <Int>(0)
   // var scoreA : Int = 0
    val scoreA  : LiveData<Int>
       get() = _scoreA
    val scoreA2 : LiveData<Int>
    get() = _scoreA2


    var scoreB : Int = 0
    fun incrementScore(isTeamA: Boolean) {
        if (isTeamA) {
          //  scoreA++
            _scoreA.value  = _scoreA.value!!+1
        }
        else {
            scoreB++
        }
    }
    fun incrementScore2(isTeamA: Boolean) {
        if (isTeamA) {
            //  scoreA++
            _scoreA.value  = _scoreA.value!!+2
        }
        else {
            scoreB+2
        }
    }



}