package online.smartcompute.groovydemo.closure
/**
 * curry example
 * @author masud
 *
 */
class A003_Closure {

	static main(String [] args){

		def log =  {level , date , msg ->
			println "$level $date $msg"
		}

		def today = new Date()
		log 'warning',today,'starting...'
		log 'warning',today,'ending...'

		def logWarningToday = log.curry('warning',today)
		logWarningToday 'starting...'
		logWarningToday 'ending...'
	}
}
