package info.sanaebadi.homescreen

import info.sanaebadi.githubapi.GithubApi
import info.sanaebadi.githubapi.model.RepoApiModel
import info.sanaebadi.githubapi.model.UserApiModel
import info.sanaebadi.repository.AppRepository
import org.junit.Before


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

    private lateinit var viewModel: HomeViewModel
    private lateinit var viewStateValues: MutableList<HomeViewState>

    @Before
    fun setUp() {
        val appRepository = AppRepository(FakeGithubApi())
        viewStateValues = mutableListOf()
    }
}

private class FakeGithubApi : GithubApi {

    override fun getTopRepositories(): List<RepoApiModel> {
        return listOf(fakeREpoApiModel)
    }

}