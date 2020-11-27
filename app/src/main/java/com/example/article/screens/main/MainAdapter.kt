package com.example.article.screens.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.article.R
import com.example.article.data.entity.PostItem
import kotlinx.android.synthetic.main.main_item.view.*

//class MainAdapter(private var onClick: (post: PostItem) -> Unit) :
//    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
//
//    var postList = emptyList<PostItem>()
//
//    class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        val title: TextView = view.title
//        val text: TextView = view.text
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_item, parent, false)
//        return MainViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
//        holder.title.text = postList[position].title
////        holder.text.text = postList[position].body
//    }
//
//    override fun getItemCount(): Int = postList.size
//
//    override fun onViewAttachedToWindow(holder: MainViewHolder) {
//        super.onViewAttachedToWindow(holder)
//        holder.itemView.setOnClickListener {
//            onClick(postList[holder.adapterPosition])
//        }
//    }
//
//    override fun onViewDetachedFromWindow(holder: MainViewHolder) {
//        super.onViewDetachedFromWindow(holder)
//        holder.itemView.setOnClickListener(null)
//    }
//
//    fun newList(list: List<PostItem>) {
//        postList = list
//        notifyDataSetChanged()
//    }
//}