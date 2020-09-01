package info.sanaebadi.githubapi

import dagger.Module
import dagger.Provides
import info.sanaebadi.githubapi.GithubApiModule
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

@Module
object OkHttpConfigModule {

    @Provides
    @JvmStatic
    fun provideOkHttpConfigurator() = object : GithubApiModule.OkHttpConfigurator {
        override fun configure(clientBuilder: OkHttpClient.Builder) {
            clientBuilder.callTimeout(10, TimeUnit.SECONDS)
        }
    }
}