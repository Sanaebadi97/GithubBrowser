package info.sanaebadi.dependecyinjection

class SingleStepCounter : Counter {

    private var count: Int = 0

    override fun getCount() = count

    override fun increment() {
        count++
    }

    override fun decrement() {
       count--
    }

}