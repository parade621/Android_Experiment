package com.parade621.dogglers.ui.adapter

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.parade621.dogglers.databinding.RvItemBinding
import com.parade621.dogglers.model.Dog

class DogCardViewHolder (
    private val binding: RvItemBinding
        ):RecyclerView.ViewHolder(binding.root){

            fun bind(dog: Dog){
                itemView.apply {
                    binding.rvImageView.setImageResource(dog.image)
                    binding.tvName.text = dog.name
                    binding.tvAge.text = dog.age
                    binding.tvHobbies.text = dog.hobbies
                }
            }
}