package online.smartcompute.groovydemo.closure

/**
 * 
 * @author masud
 *
 */
class A001_Closure {

	static main(String []args){

		def list = [1, 2, 3, 4]
		list.each {println it}

		def factor = 2
		list.each {println it * factor}

		def printIt = {println it * factor}
		list.each printIt

		foo(200,{println it})
		foo(300){println it}
		foo 400 , {println it}

		def greet = {name -> println "hello $name"}
		greet('masud')

		def greet1 = {name -> println "${toUpperCase()} $name"}
		for(sal in ['hello', 'hi']){
			greet1.delegate = sal
			greet1 "groovy"
		}
	}

	def static foo(value,closure){
		closure(value * 2)
	}
}
