package info.sanaebadi.repository

import com.google.common.truth.Truth.assertThat
import info.sanaebadi.githubapi.model.RepoApiModel
import info.sanaebadi.githubapi.model.UserApiModel
import info.sanaebadi.testingapp.githubapi.FakeGithubApi
import kotlinx.coroutines.runBlocking
import org.junit.Before
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

class AppRepositoryTest {

    private lateinit var appRepository: AppRepository
    private val fakeGithubApi = FakeGithubApi().apply { repos = listOf(fakeREpoApiModel) }

    @Before
    fun setUp() {
        appRepository = AppRepository(fakeGithubApi)
    }

    @Test
    suspend fun successfulQuery() {
        val topRepos = runBlocking { appRepository.getTopRepos() }

        assertThat(topRepos.size).isEqualTo(1)
        assertThat(topRepos[0]).isEqualTo(fakeREpoApiModel)
    }
}

