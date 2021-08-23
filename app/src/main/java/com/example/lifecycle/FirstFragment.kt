package com.example.lifecycle

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lifecycle.databinding.FragmentFirstBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        Timber.i("Fragment 1 onCreateView")
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        Timber.i("Fragment 1 onViewCreated")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Timber.i("Fragment 1 onDestroyView")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Timber.i("Fragment 1 onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("Fragment 1 onCreate")
    }

    override fun onStart() {
        super.onStart()
        Timber.i("Fragment 1 onStart")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("Fragment 1 onResume")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("Fragment 1 onPause")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("Fragment 1 onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("Fragment 1 onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Timber.i("Fragment 1 onDestroy")
    }
}