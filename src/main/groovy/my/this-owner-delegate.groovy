package my

class MyClass {

    def outerClosure = {

        println("----------- outerClosure() ------------")
        println this.class.name
        println owner.class.name
        println delegate.class.name

        def nestedClosure = {
            println("----------- nestedClosure() ------------")
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }

        nestedClosure()
    }
}

def closure = new MyClass().outerClosure
closure()