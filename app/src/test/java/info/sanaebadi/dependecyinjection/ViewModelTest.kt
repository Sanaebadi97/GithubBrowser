package info.sanaebadi.dependecyinjection

import android.view.View
import org.junit.Before
import org.junit.Test

class ViewModelTest {
    private lateinit var viewModel: ViewModel

    @Before
    fun setUp() {
        viewModel = ViewModel()
    }

    @Test
    fun countUpdateCallback() {
        var lastEmittedCount = 0
        viewModel.countUpdateCallback = { count -> lastEmittedCount = count }
        viewModel.addClicked()

        assert(lastEmittedCount == 1 )
    }
}