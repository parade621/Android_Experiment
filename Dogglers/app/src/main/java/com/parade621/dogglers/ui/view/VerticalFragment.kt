package com.parade621.dogglers.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.parade621.dogglers.R
import com.parade621.dogglers.data.DataSource
import com.parade621.dogglers.databinding.FragmentVerticalBinding
import com.parade621.dogglers.model.Dog
import com.parade621.dogglers.ui.adapter.DogCardAdapter

class VerticalFragment : Fragment() {
    private var _binding:FragmentVerticalBinding?=null
    private val binding get() = _binding!!
    private lateinit var dogCardAdapter: DogCardAdapter
    private lateinit var items:List<Dog>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentVerticalBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        items = DataSource.dogs
        setupRecyclerView()
    }

    private fun setupRecyclerView(){
        dogCardAdapter = DogCardAdapter(items)
        binding.verticalRv.apply{
            setHasFixedSize(true)
            layoutManager=
                LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL, false)
            adapter = dogCardAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
