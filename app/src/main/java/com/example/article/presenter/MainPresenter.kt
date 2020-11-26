package com.example.article.presenter

import com.example.article.data.network.PostApiFactory
import com.example.article.data.repository.PostRepository
import com.example.article.screens.main.MainView
import kotlinx.coroutines.async
import moxy.InjectViewState
import moxy.MvpPresenter
import moxy.presenterScope

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    private val repository:PostRepository = PostRepository(PostApiFactory.postApi)

    override fun onFirstViewAttach() {
        presenterScope.async {
            val posts = repository.getPosts()
            posts?.let { viewState.showPosts(it) }
        }
    }
}