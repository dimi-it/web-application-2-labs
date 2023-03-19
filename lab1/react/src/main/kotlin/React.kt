class Reactor<T>() {

    // Your compute cell's addCallback method must return an object
    // that implements the Subscription interface.
    interface ISubscription {
        fun cancel()
    }

    inner class Subscription : ISubscription{
        override fun cancel() {
            TODO("Not yet implemented")
        }

    }

    inner class InputCell(var value: Int){

    }

    inner class ComputeCell(vararg input: InputCell, function: (input: List<InputCell>) -> Unit){

    }
}
