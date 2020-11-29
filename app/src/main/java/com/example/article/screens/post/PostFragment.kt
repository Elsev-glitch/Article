package com.example.article.screens.post

import android.os.Bundle
import android.view.*
import androidx.navigation.ActivityNavigatorExtras
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.article.MainActivity
import com.example.article.R
import com.example.article.data.entity.PostItem
import com.example.article.presenter.PostPresenter
import kotlinx.android.synthetic.main.fragment_post.*
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter

class PostFragment : MvpAppCompatFragment(), PostView {
    @InjectPresenter
    lateinit var postPresenter: PostPresenter

    val args: PostFragmentArgs by navArgs()
    @ProvidePresenter
    fun providePostPresenter():PostPresenter{
//        return PostPresenter(arguments?.getSerializable("post") as PostItem)
        return PostPresenter(args.argumentPost)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setHasOptionsMenu(true)

        if ((activity as MainActivity).toolbarImage.visibility == View.VISIBLE){
            (activity as MainActivity).toolbarImage.visibility = View.GONE
        }
        (activity as MainActivity).title = getString(R.string.post)

        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        (activity as MainActivity).supportActionBar?.setDisplayShowHomeEnabled(true)

//        (activity as MainActivity).toolbar.setNavigationOnClickListener(View.OnClickListener {
//            val action = PostFragmentDirections.actionPostFragmentToMainFragment()
//            view?.let { it1 -> Navigation.findNavController(it1).navigate(action) }
//            (activity as MainActivity).onBackPressed()
//        })

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home-> {
                (activity as MainActivity).onBackPressed()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun showPost(post: PostItem) {
        title_post.text = post.title
        body_post.text = post.body
    }


}