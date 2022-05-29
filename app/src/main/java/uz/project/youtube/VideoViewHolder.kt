package uz.project.youtube

import androidx.recyclerview.widget.RecyclerView
import uz.project.youtube.Models.VideoClass
import uz.project.youtube.databinding.VideoItemBinding

class VideoViewHolder(private val binding: VideoItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(videoClass: VideoClass) {
        binding.contentImage.setImageResource(videoClass.image)
        binding.tvTitle.text = videoClass.title
        binding.tvAuthorName.text = videoClass.subtitle
    }

}