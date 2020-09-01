package info.sanaebadi.details

import androidx.lifecycle.ViewModel
import info.sanaebadi.di.scope.ScreenScope
import info.sanaebadi.repository.AppRepository
import javax.inject.Inject
import javax.inject.Named

@ScreenScope
class RepoDetailsViewModel @Inject constructor(
    @Named("repo_owner") private val repoOwner: String,
    @Named("repo_name") private val repoName: String,
    private val appRepository: AppRepository
) : ViewModel() {

}

