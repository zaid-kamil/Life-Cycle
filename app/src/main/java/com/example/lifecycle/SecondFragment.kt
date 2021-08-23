package com.example.lifecycle

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lifecycle.databinding.FragmentSecondBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Timber.i("Fragment 2 onCreateView")
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
        Timber.i("Fragment 2 onViewCreated")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Timber.i("Fragment 2 onDestroy")

    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Timber.i("Fragment 2 onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("Fragment 2 onCreate")
    }

    override fun onStart() {
        super.onStart()
        Timber.i("Fragment 2 onStart")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("Fragment 2 onResume")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("Fragment 2 onPause")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("Fragment 2 onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("Fragment 2 onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Timber.i("Fragment 2 onDestroy")
    }
}