package online.smartcompute.groovydemo

public class A002_Meta {

	static main(String [] args){

		def sam = new Person()

		def methodName = "run"
		def method = sam.metaClass.getMetaMethod(methodName, 1022)
		method.invoke(sam, 10)

		sam.invokeMethod(methodName, 10)
		sam."$methodName"(10)
	}
}

class Person{
	def run(km){
		println("runnig $km kms")
	}
}
