package com.example.article.presenter

import android.os.CountDownTimer
import com.example.article.screens.start.StartView
import moxy.InjectViewState
import moxy.MvpPresenter
@InjectViewState
class StartPresenter : MvpPresenter<StartView>() {
    override fun onFirstViewAttach() {
        object : CountDownTimer(1500, 1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                viewState.replaceMainFragment()
            }

        }.start()
    }
}