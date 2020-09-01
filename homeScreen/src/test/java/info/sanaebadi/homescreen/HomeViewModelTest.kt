package info.sanaebadi.homescreen

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.Truth.assertThat
import info.sanaebadi.githubapi.GithubApi
import info.sanaebadi.githubapi.model.RepoApiModel
import info.sanaebadi.githubapi.model.UserApiModel
import info.sanaebadi.homescreen.list.RepoItem
import info.sanaebadi.repository.AppRepository
import info.sanaebadi.testingapp.githubapi.FakeGithubApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.setMain
import org.junit.Before
import org.junit.Rule
import org.junit.Test


private val fakeREpoApiModel = RepoApiModel(
    id = 1L,
    name = "Mock Repo",
    description = "Mock Repo Description",
    owner = UserApiModel(id = 1L, login = "dagger"),
    stargazersCount = 1,
    forksCount = 4,
    contributorsUrl = "",
    createdDate = "1/1/2020",
    updatedDate = "2/2/2020"


)

class HomeViewModelTest {

    @get:Rule
    val taskExecutorRule = InstantTaskExecutorRule()
    private lateinit var viewModel: HomeViewModel
    private lateinit var viewStateValues: MutableList<HomeViewState>

    @Before
    fun setUp() {
        Dispatchers.setMain(Dispatchers.Unconfined)
        val appRepository =
            AppRepository(FakeGithubApi().apply { repos = listOf(fakeREpoApiModel) })
        viewStateValues = mutableListOf()

        viewModel = HomeViewModel(appRepository)
        viewModel.viewStateUpdates.observeForever { viewStateValues.add(it) }
    }

    @Test
    fun `loaded state contains repo models`() {
        assertThat(viewStateValues.size).isEqualTo(1)
        val expectedState = HomeViewStateLoaded(
            repos = listOf(
                RepoItem(
                    name = fakeREpoApiModel.name,
                    description = fakeREpoApiModel.description,
                    starsCount = fakeREpoApiModel.stargazersCount,
                    forkCount = fakeREpoApiModel.forksCount
                )
            )
        )
        assertThat(viewStateValues[0]).isEqualTo(expectedState)
    }
}

