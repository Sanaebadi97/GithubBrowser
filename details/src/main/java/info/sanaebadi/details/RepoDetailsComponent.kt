package info.sanaebadi.details

import dagger.Component
import info.sanaebadi.appdeps.ApplicationDeps
import info.sanaebadi.di.scope.ScreenScope

@ScreenScope
@Component(dependencies = [ApplicationDeps::class])
interface RepoDetailsComponent{

    fun inject(repoDetailsFragment: RepoDetailsFragment)

}