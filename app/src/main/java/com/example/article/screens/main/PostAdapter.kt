package com.example.article.screens.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.article.R
import com.example.article.data.entity.PostItem
import kotlinx.android.synthetic.main.main_item.view.*

class PostAdapter() : ListAdapter<PostItem, PostAdapter.PostViewHolder>(DiffCallBack()) {

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: PostItem) = with(itemView) {
            title.text = item.title

            setOnClickListener {
                MainFragment.onClick(item)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.main_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}


class DiffCallBack : DiffUtil.ItemCallback<PostItem>() {
    override fun areItemsTheSame(oldItem: PostItem, newItem: PostItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: PostItem, newItem: PostItem): Boolean {
        return oldItem == newItem
    }

}