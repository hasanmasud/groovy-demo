package online.smartcompute.groovydemo.closure
/**
 * 
 * @author masud
 *
 */
class A004_Closure {

	static main(String []args){
		printInfo({ -> println 'foo' })
		printInfo({ e -> println e })
		printInfo({ String e -> println e })
		printInfo({ int i , double d ->
			println 'foo'
		})

		def langs = ['java' : 'oracle','c++' : 'microsoft']
		langs.each {entry -> println entry}

		langs.each {k,v -> println "$k  $v"}
	}


	static def printInfo(closure){
		print closure.maximumNumberOfParameters
		println closure.parameterTypes
	}
}
