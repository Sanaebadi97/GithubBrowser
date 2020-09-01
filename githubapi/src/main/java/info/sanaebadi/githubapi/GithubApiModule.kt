package info.sanaebadi.githubapi

import dagger.Binds
import dagger.Module
import dagger.Provides
import okhttp3.Call
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
object GithubApiModule {

    @Provides
    @JvmStatic
    @Singleton

    fun provideOkhttp(): Call.Factory {
        return OkHttpClient.Builder()
            .build()
    }

    @Binds
    fun bindGithubApi(mockGithubApi: MockGithubApi): GithubApi
}
