package online.smartcompute.groovydemo

class A004_Closure {

	static main(String []args){
		def greet = {name -> println(name)}
		greet('Masud')
	}
}
