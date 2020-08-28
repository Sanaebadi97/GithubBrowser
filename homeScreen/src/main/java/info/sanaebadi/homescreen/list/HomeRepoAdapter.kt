package info.sanaebadi.homescreen.list

import androidx.recyclerview.widget.RecyclerView
import info.sanaebadi.homescreen.databinding.RepoItemBinding

class HomeRepoAdapter : RecyclerView.Adapter<> {

    class RepoItemViewHolder(private val binding: RepoItemBinding) :
        RecyclerView.ViewHolder(binding.root)

}