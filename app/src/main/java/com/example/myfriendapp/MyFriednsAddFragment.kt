package com.example.myfriendapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.my_friend_add_fragment.*

class MyFriednsAddFragment : Fragment(){
    companion object{
        fun newInstance(): MyFriednsAddFragment{
            return MyFriednsAddFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.my_friend_add_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
    private fun initView(){
        btnSave.setOnClickListener{
            (activity as MainActivity).tampilMyFriendsAddFragment()}
    }
    override fun onDestroy(){
        super.onDestroy()
    }
}