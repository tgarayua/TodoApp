package com.example.todoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todoapp.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!
    //    private val viewModel by activityViewModels<>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) = FragmentRegisterBinding.inflate(
        inflater, container, false
    ).also { _binding = it }.root
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun initViews() = with(binding) {
        btnBack.setOnClickListener {
            findNavController().navigate(RegisterFragmentDirections.goToLoginFragment())
        }
    }
}