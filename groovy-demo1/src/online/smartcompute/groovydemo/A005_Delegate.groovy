package online.smartcompute.groovydemo

class A005_Delegate {

	static main(String [] args){

		def greet = {name -> println "${toUpperCase()} $name" }

		for(salutation in ["hello", "howdy"]){
			greet.delegate = salutation
			greet('Masud')
		}
	}
}
