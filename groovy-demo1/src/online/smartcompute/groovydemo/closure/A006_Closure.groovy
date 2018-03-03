package online.smartcompute.groovydemo.closure

import groovy.json.internal.NumberValue

class A006_Closure {

	static main(String []args){
		println factorialRec(5)
	}

	static def factorialRec(number){
		if (number == 1)
			return 1
		else
			return number * factorialRec(number-1)
	}
}
