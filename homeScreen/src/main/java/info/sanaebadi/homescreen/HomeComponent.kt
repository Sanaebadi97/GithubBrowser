package info.sanaebadi.homescreen

import dagger.Component
import info.sanaebadi.appdeps.ApplicationDeps
import info.sanaebadi.appdeps.applicationDeps

@Component(dependencies = [ApplicationDeps::class], modules = [HomeModule::class])
interface HomeComponent {
    fun inject(homeFragment: HomeFragment)

    @Component.Factory
    interface Factory {
        fun create(applicationDeps: ApplicationDeps): HomeComponent
    }
}


fun HomeFragment.inject(){
    DaggerHomeComponent.factory()
        .create(requireContext().applicationDeps())
        .inject(this)
}