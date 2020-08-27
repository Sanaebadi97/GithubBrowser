package info.sanaebadi.dependecyinjection

class  ViewModel(  private val counter: Counter){

    var countUpdateCallback: ((Int) -> Unit)? = null
        set(value) {
            field = value
            value?.invoke(counter.getCount())
        }


    fun addClicked() {
        counter.increment()
        countUpdateCallback?.invoke(counter.getCount())
    }

    fun subtractClicked() {
        counter.decrement()
        countUpdateCallback?.invoke(counter.getCount())
    }

}


