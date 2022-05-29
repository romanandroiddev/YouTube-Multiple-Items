package uz.project.youtube

import androidx.recyclerview.widget.RecyclerView
import uz.project.youtube.Models.SearchClass
import uz.project.youtube.databinding.SearchBarItemBinding

class SearchViewHolder(private val binding: SearchBarItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(searchClass: SearchClass) {
        binding.imgProfile.setImageResource(searchClass.img)
    }
}