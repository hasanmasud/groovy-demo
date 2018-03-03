package online.smartcompute.groovydemo

public class A003_AopDemo {

	static main(String []args){
		def masud = new People()
		masud.metaClass.invokeMethod = {String name , arguments ->
			println "running before..."
			def method = People.metaClass.getMetaMethod(name, 100)
			def result = method.invoke(delegate, arguments)
			println "running after..."
			return result
		}
		masud.run(100)
	}
}

class People{
	def run(km){
		println("running $km kms")
	}
}