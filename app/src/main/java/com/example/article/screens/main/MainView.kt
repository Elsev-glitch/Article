package com.example.article.screens.main

import com.example.article.data.entity.PostItem
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType

interface MainView : MvpView {
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showPosts(postItemList: MutableList<PostItem>)
//    fun showPosts(postItemList: List<PostItem>)
}