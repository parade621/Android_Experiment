package com.parade621.dogglers.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.parade621.dogglers.R
import com.parade621.dogglers.data.DataSource
import com.parade621.dogglers.databinding.FragmentGridBinding
import com.parade621.dogglers.model.Dog
import com.parade621.dogglers.ui.adapter.DogCardAdapter

class GridFragment : Fragment() {

    private var _binding: FragmentGridBinding?=null
    private val binding get() = _binding!!
    private lateinit var dogCardAdapter: DogCardAdapter
    private lateinit var items:List<Dog>


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGridBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        items = DataSource.dogs
        setupRecyclerView()
    }

    private fun setupRecyclerView(){
        dogCardAdapter = DogCardAdapter(items)
        binding.gridRecyclerView.apply{
            setHasFixedSize(true)
            layoutManager=
                GridLayoutManager(requireContext(),2)
            adapter=dogCardAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}