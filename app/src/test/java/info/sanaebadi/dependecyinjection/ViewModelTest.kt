package info.sanaebadi.dependecyinjection

import org.junit.Before
import org.junit.Test

class ViewModelTest {
    private lateinit var viewModel: ViewModel

    @Before
    fun setUp() {
        viewModel = ViewModel(FakeCounter())
    }

    @Test
    fun countUpdateCallback() {
        var lastEmittedCount = 0
        viewModel.countUpdateCallback = { count -> lastEmittedCount = count }
        viewModel.addClicked()

        assert(lastEmittedCount == 1)
    }


}

class FakeCounter : Counter {
    private var count = 0
    override fun getCount(): Int = count

    override fun increment() {
        count++
    }

    override fun decrement() {
        count--
    }
}