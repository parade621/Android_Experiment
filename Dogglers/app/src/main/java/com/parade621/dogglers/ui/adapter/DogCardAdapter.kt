package com.parade621.dogglers.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.parade621.dogglers.databinding.RvItemBinding
import com.parade621.dogglers.model.Dog

class DogCardAdapter(private val items:List<Dog>):RecyclerView.Adapter<DogCardViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        return DogCardViewHolder(
            RvItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}