package com.example.class_work

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.class_work.databinding.FragmentFourthBinding


class FourthFragment : Fragment() {
    private lateinit var binding: FragmentFourthBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFourthBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataAccept()
    }

    private fun dataAccept() {
        val bundle = arguments
        if (bundle != null) {
            binding.nameFinal.text = bundle.getString("name")
            binding.surnameFinal.text = bundle.getString("surname")
            binding.ageFinal.text = bundle.getString("age")
            binding.sexFinal.text = bundle.getString("sex")
            binding.schoolFinal.text = bundle.getString("school")
            binding.workFinal.text = bundle.getString("work")
        }
    }
}

