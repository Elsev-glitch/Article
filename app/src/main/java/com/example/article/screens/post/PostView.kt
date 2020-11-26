package com.example.article.screens.post

import com.example.article.data.entity.PostItem
import moxy.MvpView
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(OneExecutionStateStrategy::class)
interface PostView : MvpView{
    fun showPost(post:PostItem)
}