package com.example.article.screens.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.article.MainActivity
import com.example.article.R
import com.example.article.presenter.StartPresenter
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter

class StartFragment : MvpAppCompatFragment(), StartView {

    @InjectPresenter
    lateinit var startPresenter:StartPresenter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun replaceMainFragment() {
//        (activity as MainActivity).navController.navigate(R.id.action_startFragment_to_mainFragment)
        val action = StartFragmentDirections.actionStartFragmentToMainFragment()
        view?.let { Navigation.findNavController(it).navigate(action) }
    }
}