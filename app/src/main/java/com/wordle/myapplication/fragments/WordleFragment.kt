package com.wordle.myapplication.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wordle.myapplication.R
import com.wordle.myapplication.viewmodels.WordleViewModel

class WordleFragment : Fragment() {

    companion object {
        fun newInstance() = WordleFragment()
    }

    private lateinit var viewModel: WordleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_wordle, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WordleViewModel::class.java)
        // TODO: Use the ViewModel
    }

}