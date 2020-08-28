package info.sanaebadi.githubBrowser.application

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import java.security.AccessControlContext
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }
}