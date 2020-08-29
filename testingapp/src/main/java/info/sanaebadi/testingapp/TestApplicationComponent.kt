package info.sanaebadi.testingapp

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import info.sanaebadi.appcomponent.ApplicationComponent
import info.sanaebadi.testingapp.githubapi.FakeGithubApi
import info.sanaebadi.testingapp.githubapi.TestGithubApiModule
import javax.inject.Singleton

@Singleton
@Component(modules = [TestGithubApiModule::class])
interface TestApplicationComponent : ApplicationComponent {

    fun githubApi():FakeGithubApi

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance context: Context): TestApplicationComponent
    }
}