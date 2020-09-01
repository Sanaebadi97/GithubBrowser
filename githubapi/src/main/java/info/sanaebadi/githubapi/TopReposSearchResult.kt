package info.sanaebadi.githubapi

import com.squareup.moshi.JsonClass
import info.sanaebadi.githubapi.model.RepoApiModel

@JsonClass(generateAdapter = true)
data class TopReposSearchResult(val items:List<RepoApiModel>)