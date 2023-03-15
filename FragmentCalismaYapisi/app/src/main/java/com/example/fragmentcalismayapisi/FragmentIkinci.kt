package com.example.fragmentcalismayapisi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentcalismayapisi.databinding.Fragmentbirinci1Binding
import com.example.fragmentcalismayapisi.databinding.FragmentikinciBinding

class FragmentIkinci :Fragment(){
    private  var _tasarim: FragmentikinciBinding? = null
    private val tasarim get() = _tasarim!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _tasarim = FragmentikinciBinding.inflate(inflater,container,false)
        _tasarim!!.buttonYap.setOnClickListener {
            _tasarim!!.textViewCikti.text = "merhaba"
        }
        val view = tasarim.root
        return view
    }
}