package info.sanaebadi.homescreen

import dagger.Component
import info.sanaebadi.appdeps.ApplicationDeps
import info.sanaebadi.appdeps.applicationDeps
import info.sanaebadi.di.component.getComponent
import info.sanaebadi.di.scope.ScreenScope

@ScreenScope
@Component(dependencies = [ApplicationDeps::class], modules = [HomeModule::class])
interface HomeComponent {
    fun inject(homeFragment: HomeFragment)

    @Component.Factory
    interface Factory {
        fun create(applicationDeps: ApplicationDeps): HomeComponent
    }
}


fun HomeFragment.inject() {
    getComponent {
        DaggerHomeComponent.factory()
            .create(requireContext().applicationDeps())
    }

        .inject(this)
}