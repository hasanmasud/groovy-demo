package online.smartcompute.groovydemo.closure

import groovy.transform.ThreadInterrupt

class A005_Closure {

	static main(String [] args){
		
		Thread.start('thread-001',{
			println Thread.currentThread().getName()
		})
		Thread.start('thread-002',{
			println Thread.currentThread().getName()
		})
		Thread.sleep(1000)

		println Thread.currentThread().getName()
	}
}
