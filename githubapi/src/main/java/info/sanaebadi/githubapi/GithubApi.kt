package info.sanaebadi.githubapi


interface GithubApi {
    suspend fun getTopRepositories(): TopReposSearchResult
}


