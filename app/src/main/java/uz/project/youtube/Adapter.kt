package uz.project.youtube

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.project.youtube.Models.Model
import uz.project.youtube.Models.SearchClass
import uz.project.youtube.Models.ShortVideoClass
import uz.project.youtube.Models.VideoClass
import uz.project.youtube.databinding.SearchBarItemBinding
import uz.project.youtube.databinding.ShortVideoItemBinding
import uz.project.youtube.databinding.VideoItemBinding

class Adapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var models = listOf<Model>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    companion object {
        const val VIDEO = 0
        const val SHORTS = 1
        const val SEARCH = 2
    }


    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> SEARCH
            1 -> VIDEO
            2 -> SHORTS
            else -> VIDEO
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        return when (viewType) {
            SHORTS -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.short_video_item, parent, false)
                val binding = ShortVideoItemBinding.bind(view)
                ShortsViewHolder(binding)
            }
            SEARCH -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.search_bar_item, parent, false)
                val binding = SearchBarItemBinding.bind(view)
                SearchViewHolder(binding)
            }
            else -> {
                val itemView =
                    LayoutInflater.from(parent.context).inflate(R.layout.video_item, parent, false)
                val binding = VideoItemBinding.bind(itemView)
                VideoViewHolder(binding)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (position) {
            0 -> {
                (holder as SearchViewHolder).bind(models[position] as SearchClass)
            }
            2 -> {
                (holder as ShortsViewHolder).bind(models[position] as ShortVideoClass)
            }
            else -> {
                (holder as VideoViewHolder).bind(models[position] as VideoClass)
            }
        }
    }

    override fun getItemCount(): Int = models.size

}