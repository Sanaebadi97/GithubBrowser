package info.sanaebadi.githubBrowser.application

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import info.sanaebadi.githubapi.GithubApiModule
import info.sanaebadi.repository.AppRepository
import javax.inject.Singleton

@Singleton
@Component(modules = [GithubApiModule::class])
interface ApplicationComponent {

    fun appRepository(): AppRepository

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }
}