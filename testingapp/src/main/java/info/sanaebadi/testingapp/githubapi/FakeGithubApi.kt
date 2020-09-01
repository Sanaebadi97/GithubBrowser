package info.sanaebadi.testingapp.githubapi

import info.sanaebadi.githubapi.GithubApi
import info.sanaebadi.githubapi.TopReposSearchResult
import info.sanaebadi.githubapi.model.RepoApiModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FakeGithubApi @Inject constructor() : GithubApi {

    var repos = listOf<RepoApiModel>()

    override suspend fun getTopRepositories(): TopReposSearchResult {
        return TopReposSearchResult(repos)
    }

}