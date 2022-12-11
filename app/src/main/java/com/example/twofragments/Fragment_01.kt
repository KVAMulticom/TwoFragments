package com.example.twofragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.twofragments.databinding.Fragment01Binding


class Fragment_01 : Fragment() {

    lateinit var binding: Fragment01Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
    //    return inflater.inflate(R.layout.fragment_01, container, false)
        binding = Fragment01Binding.inflate(inflater)
        return binding.root
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_fragment_01_to_fragment_02)
        }
    }

}
