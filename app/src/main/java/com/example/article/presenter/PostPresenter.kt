package com.example.article.presenter

import com.example.article.data.entity.PostItem
import com.example.article.screens.post.PostView
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class PostPresenter(var post: PostItem) : MvpPresenter<PostView>(){
    override fun onFirstViewAttach(){
        viewState.showPost(post)
    }
}