package com.example.navigationcompenent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigationcompenent.databinding.FragmentAnasayfaBinding
import com.example.navigationcompenent.databinding.FragmentOyunEkraniBinding

class OyunEkraniFragment : Fragment() {

    private var _binding: FragmentOyunEkraniBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOyunEkraniBinding.inflate(inflater,container,false)
        val bundle:OyunEkraniFragmentArgs by navArgs()
        val kisiNo =bundle.kisiNesne.kisiNo
        val kisiAdi =bundle.kisiNesne.kisiAdi

        Toast.makeText(activity, kisiAdi.toString() + kisiNo.toString(), Toast.LENGTH_LONG).show()

        val view = binding.root
        binding.buttonBitir.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.oyunSonucFragment)
        }
        return view
    }

}