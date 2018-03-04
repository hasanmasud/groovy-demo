package online.smartcompute.tutorialspoint

class A004_Closure {

    static main(String[] args) {
        def cols = { param -> print("hello ${param}") }
        cols.call()
    }
}
