package info.sanaebadi.repository

import info.sanaebadi.githubapi.GithubApi
import info.sanaebadi.githubapi.model.RepoApiModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppRepository @Inject constructor(
    private val githubApi: GithubApi
) {
    fun getTopRepos(): List<RepoApiModel> {
        return githubApi.getTopRepositories()
    }
}