package info.sanaebadi.githubapi

import retrofit2.http.GET


interface GithubApi {
    @GET("search/repositories?q=language:kotlin&order=desc&sort=stars")
    suspend fun getTopRepositories(): TopReposSearchResult
}


