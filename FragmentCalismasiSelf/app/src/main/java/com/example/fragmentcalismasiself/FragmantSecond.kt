package com.example.fragmentcalismasiself

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentcalismasiself.databinding.FragmentsecondBinding

class FragmantSecond:Fragment() {
    private var _binding:FragmentsecondBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentsecondBinding.inflate(inflater,container,false)
        val view = binding.root
        _binding!!.buttonYap.setOnClickListener {
            _binding!!.textViewCikti.text="Second Fragment Running"
        }
        return view
    }
}