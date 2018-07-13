package my

Closure hello = {
    println message
}

class Hello {
    String message = "Hello delegate!"
}

hello.delegate = new Hello()
hello()