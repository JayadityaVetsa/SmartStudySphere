package com.example.myapplication

import android.media.MediaPlayer.OnSubtitleDataListener

data class QuizModel(
    val id: String,
    val title: String,
    val subtitle: String,
    val time: String,
){
    constructor(): this("", "", "", "")
}
