package com.example.class_work

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.class_work.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        click()
    }

    private fun click() {
        binding.thirdButton.setOnClickListener {
            dataSend()
        }
    }

    private fun dataSend() {
        if (!binding.school.text.toString().isNullOrEmpty() && !binding.work.text.toString()
                .isNullOrEmpty()
        ) {
            val bundle = arguments
            bundle?.putString("school", binding.school.text.toString())
            bundle?.putString("work", binding.work.text.toString())
            findNavController().navigate(R.id.action_thirdFragment3_to_fourthFragment3, bundle)
        } else {
            Toast.makeText(requireContext(), "введите данные", Toast.LENGTH_SHORT).show()
        }
    }
}