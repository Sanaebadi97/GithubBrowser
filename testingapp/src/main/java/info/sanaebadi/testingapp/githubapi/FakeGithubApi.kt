package info.sanaebadi.testingapp.githubapi

import info.sanaebadi.githubapi.GithubApi
import info.sanaebadi.githubapi.model.RepoApiModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FakeGithubApi @Inject constructor() : GithubApi {

    val repos = listOf<RepoApiModel>()

    override fun getTopRepositories(): List<RepoApiModel> {
        return repos
    }

}