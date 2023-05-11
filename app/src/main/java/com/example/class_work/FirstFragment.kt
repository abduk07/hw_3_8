package com.example.class_work

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.class_work.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private val bundle = Bundle()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        click()
    }

    private fun click() {
        binding.firstButton.setOnClickListener {
            dataSend()
        }
    }


    private fun dataSend() {
        if (!binding.name.text.toString().isNullOrEmpty() && !binding.surname.text.toString()
                .isNullOrEmpty()
        ) {
            bundle.putString("name", binding.name.text.toString())
            bundle.putString("surname", binding.surname.text.toString())
            findNavController().navigate(R.id.action_firstFragment2_to_secondFragment2, bundle)
        } else {
            Toast.makeText(requireContext(), "введите данные", Toast.LENGTH_SHORT).show()
        }
    }
}