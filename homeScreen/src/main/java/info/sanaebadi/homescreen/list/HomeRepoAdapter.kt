package info.sanaebadi.homescreen.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import info.sanaebadi.homescreen.databinding.RepoItemBinding

class HomeRepoAdapter : RecyclerView.Adapter<HomeRepoAdapter.RepoItemViewHolder>() {

    private val data: MutableList<RepoItem> = mutableListOf()
    fun setRepoItems(repoItem: List<RepoItem>) {
        data.clear()
        data.addAll(repoItem)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoItemViewHolder {
        val binding = RepoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RepoItemViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: RepoItemViewHolder, position: Int) {
        holder.bind(data[position])
    }


    class RepoItemViewHolder(private val binding: RepoItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(repoItem: RepoItem) {
            binding.repoName.text = repoItem.name
            binding.repoDescription.text = repoItem.description
            binding.starsCount.text = "${repoItem.starsCount}"
            binding.forkCount.text = "${repoItem.forkCount}"
        }

    }


}