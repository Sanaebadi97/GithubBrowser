package info.sanaebadi.githubBrowser.application

import android.app.Application
import info.sanaebadi.appcomponent.DaggerApplicationComponent
import info.sanaebadi.appdeps.ApplicationDeps
import info.sanaebadi.appdeps.HasApplicationDeps

class GithubBrowserApp : Application() , HasApplicationDeps {

    private val appComponent by lazy {
        DaggerApplicationComponent.factory().create(this)
    }

    override fun getApplicationDeps(): ApplicationDeps {
     return appComponent
    }
}