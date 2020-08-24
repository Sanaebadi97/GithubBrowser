package info.sanaebadi.dependecyinjection

class ViewModel {

    var countUpdateCallback: ((Int) -> Unit)? = null
        set(value) {
            field = value
            value?.invoke(counter.getCount())
        }

    private val counter: Counter = SingleStepCounter()

    fun addClicked() {
        counter.increment()
        countUpdateCallback?.invoke(counter.getCount())
    }

    fun subtractClicked() {
        counter.decrement()
        countUpdateCallback?.invoke(counter.getCount())
    }

}


