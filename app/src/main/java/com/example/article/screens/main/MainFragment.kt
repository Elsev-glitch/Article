package com.example.article.screens.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.article.MainActivity
import com.example.article.POST
import com.example.article.R
import com.example.article.data.entity.PostItem
import com.example.article.presenter.MainPresenter
import kotlinx.android.synthetic.main.fragment_main.*
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter

class MainFragment : MvpAppCompatFragment(), MainView {
    @InjectPresenter
    lateinit var mainPresenter: MainPresenter
    private lateinit var recycleView: RecyclerView

    //    private lateinit var adapter: MainAdapter
    private val adapter = PostAdapter({onClick(it)})
    private var list: ArrayList<PostItem>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_main, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recycleView = recycle_view
//        adapter = MainAdapter({onClick(it)})
        recycleView.adapter = adapter

        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)
        (activity as MainActivity).supportActionBar?.setDisplayShowHomeEnabled(false)

        if ((activity as MainActivity).toolbarImage.visibility == View.GONE) {
            (activity as MainActivity).toolbarImage.visibility = View.VISIBLE
        }
    }

    override fun showPosts(postItemList: MutableList<PostItem>) {
//        adapter.newList(postItemList)
        adapter.submitList(postItemList)
    }

    fun onClick(post: PostItem) {
//        val bundle = Bundle()
//        bundle.putSerializable(POST, post)
//        (activity as MainActivity).navController.navigate(
//            R.id.action_mainFragment_to_postFragment,
//            bundle
//        )
        val action = MainFragmentDirections.actionMainFragmentToPostFragment(post)
        view?.let { Navigation.findNavController(it).navigate(action) }
    }
}