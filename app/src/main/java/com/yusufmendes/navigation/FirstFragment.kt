package com.yusufmendes.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*


class FirstFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    //tanımlama tamamlandıktan sonra gorunumde yapılacaklar
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        goSecondFragment.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(40)
            //veri aktarımı islemleri
            //action.age=5
            Navigation.findNavController(it).navigate(action)
        }

    }

}