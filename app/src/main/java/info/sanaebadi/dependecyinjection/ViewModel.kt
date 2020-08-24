package info.sanaebadi.dependecyinjection

class ViewModel {
    private val counter: Counter = SingleStepCounter()

    fun addClicked() {
        counter.increment()
    }

    fun subtractClicked() {
        counter.decrement()
    }

}


