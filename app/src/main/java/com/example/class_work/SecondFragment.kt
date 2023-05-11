package com.example.class_work

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.class_work.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        click()
    }

    private fun click() {
        binding.secondButton.setOnClickListener {
            dataSend()
        }
    }

    private fun dataSend() {
        if (!binding.age.text.toString().isNullOrEmpty() && !binding.sex.text.toString()
                .isNullOrEmpty()
        ) {
            val bundle = arguments
            bundle?.putString("age", binding.age.text.toString())
            bundle?.putString("sex", binding.sex.text.toString())
            findNavController().navigate(R.id.action_secondFragment2_to_thirdFragment3, bundle)
        } else {
            Toast.makeText(requireContext(), "введите данные", Toast.LENGTH_SHORT).show()
        }
    }
}


