package info.sanaebadi.githubapi

import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import okhttp3.Call
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
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

    @Provides
    @JvmStatic
    @Singleton
    fun provideMoshi(): Moshi {
        return Moshi.Builder()
            .build()
    }

    @Provides
    @JvmStatic
    @Singleton
    fun provideRetrofit(
        moshi: Moshi,
        callFactory: Call.Factory
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .callFactory(callFactory)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }




}
