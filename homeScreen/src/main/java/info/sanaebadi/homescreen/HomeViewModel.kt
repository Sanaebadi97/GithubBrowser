package info.sanaebadi.homescreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import info.sanaebadi.di.scope.ScreenScope
import info.sanaebadi.homescreen.list.RepoItem
import info.sanaebadi.repository.AppRepository
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@ScreenScope
class HomeViewModel @Inject constructor(
    private val appRepository: AppRepository
) : ViewModel() {

    private val _viewState = MutableLiveData<HomeViewState>(HomeViewStateLoading)
    val viewStateUpdates: LiveData<HomeViewState> = _viewState

    init {
        val topRepos = runBlocking { appRepository.getTopRepos() }
        _viewState.value = HomeViewStateLoaded(
            repos = topRepos.map {
                RepoItem(
                    name = it.name,
                    description = it.description ?: "",
                    starsCount = it.stargazersCount,
                    forkCount = it.forksCount
                )
            }
        )
    }
}