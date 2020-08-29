package info.sanaebadi.testingapp.githubapi

import dagger.Binds
import dagger.Module
import info.sanaebadi.githubapi.GithubApi

@Module
interface TestGithubApiModule{

    @Binds
    fun bindGithubApi(fakeGithubApi: FakeGithubApi) :GithubApi

}