package com.example.myfriendapp

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import androidx.appcompat.widget.ScrollingTabContainerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_friends_item.*

class MyFriendAdapter(
    private val context: Context,
    private val items: ArrayList<MyFriend>):
        RecyclerView.Adapter<MyFriendAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.my_friends_item, parent, false))

    override fun onBindViewHolder(holder: MyFriendAdapter.ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
       }
    override fun getItemCount(): Int = items.size

    class ViewHolder(override val containerView: View):
            RecyclerView.ViewHolder(containerView), LayoutContainer {
                fun bindItem(item: MyFriend){
                    txtFriendName.text= item.nama
                    txtFriendEmail.text = item.email
                    txtFriendTelp.text = item.telp
             }
    }
}