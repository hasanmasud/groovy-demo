package online.smartcompute.tutorialspoint

class A003_Example {

    def callMe() {

        def range1 = 1..10
        def range2 = 10..1
        def range3 = 'a'..'x'
        def range4 = 'x'..'a'

        range1.each { x -> print(x) }
        range2.each { x -> print(x) }
        range3.each { x -> print(x) }
        range4.each { x -> print(x) }


    }
}
