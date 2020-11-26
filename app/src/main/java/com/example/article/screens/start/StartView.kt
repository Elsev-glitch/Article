package com.example.article.screens.start

import moxy.MvpView
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType

interface StartView : MvpView {
    @StateStrategyType(OneExecutionStateStrategy::class)
    fun replaceMainFragment()
}