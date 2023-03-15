package com.example.fragmentcalismasiself
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentcalismasiself.databinding.FragmentfirstBinding

class FragmentFirst :Fragment()
{
    private var _binding: FragmentfirstBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentfirstBinding.inflate(inflater,container,false)
        val view = binding.root
        _binding!!.buttonMesaj.setOnClickListener {
            Toast.makeText(activity,"hello is running",Toast.LENGTH_SHORT).show()
        }

        return view
    }
}