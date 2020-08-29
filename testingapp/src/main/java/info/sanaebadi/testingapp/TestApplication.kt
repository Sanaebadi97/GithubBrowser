package info.sanaebadi.testingapp

import android.app.Application
import info.sanaebadi.appdeps.ApplicationDeps
import info.sanaebadi.appdeps.HasApplicationDeps

class TestApplication : Application() , HasApplicationDeps {
    override fun getApplicationDeps(): ApplicationDeps {
    }

}