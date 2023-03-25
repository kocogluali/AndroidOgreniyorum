package com.example.navigationcompenent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcompenent.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private var _binding:FragmentAnasayfaBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAnasayfaBinding.inflate(inflater,container,false)
        val view = binding.root
        binding.buttonGiris.setOnClickListener {
            val kisiler = Kisiler(1,"alikemal koçoğlu")
            val gecis = AnasayfaFragmentDirections.oyunEkraniGecis(kisiler)
            Navigation.findNavController(it).navigate(gecis)
        }
        return view

    }

}