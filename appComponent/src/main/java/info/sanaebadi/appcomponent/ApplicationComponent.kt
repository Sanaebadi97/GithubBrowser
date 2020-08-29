package info.sanaebadi.appcomponent

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import info.sanaebadi.appdeps.ApplicationDeps
import info.sanaebadi.githubapi.GithubApiModule
import javax.inject.Singleton

@Singleton
@Component(modules = [GithubApiModule::class])
interface ApplicationComponent : ApplicationDeps {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }
}