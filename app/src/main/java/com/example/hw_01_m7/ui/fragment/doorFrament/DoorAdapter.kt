package com.example.hw_01_m7.ui.fragment.doorFrament

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_01_m7.databinding.ItemDoorBinding


class DoorAdapter : ListAdapter<Doors, DoorAdapter.DoorViewHolder>(DoorItemCallback()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DoorViewHolder {
        return DoorViewHolder(
            ItemDoorBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DoorViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    class DoorViewHolder(private val binding: ItemDoorBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(door: Doors) {
            with(binding) {
                tvDoor.text = door.name
            }
        }
    }


    class DoorItemCallback : DiffUtil.ItemCallback<Doors>() {
        override fun areItemsTheSame(oldItem: Doors, newItem: Doors) = oldItem.id == newItem.id
        override fun areContentsTheSame(oldItem: Doors, newItem: Doors) = oldItem == newItem
    }
}