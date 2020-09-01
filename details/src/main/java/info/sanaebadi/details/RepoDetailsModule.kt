package info.sanaebadi.details

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import info.sanaebadi.di.viewModel.ViewModelKey

@Module
interface RepoDetailsModule {

    @Binds
    @ViewModelKey(RepoDetailsViewModel::class)
    fun bindRepoDetailsViewModel(repoDetailsViewModel: RepoDetailsViewModel): ViewModel
}