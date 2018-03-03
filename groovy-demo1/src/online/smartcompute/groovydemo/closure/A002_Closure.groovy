package online.smartcompute.groovydemo.closure
/**
 * closure example
 * 
 * @author masud
 *
 */
public class A002_Closure {

	static main(String []args){

		Mailer.send {
			to 'masud'
			from 'vikas'
			subject 'code sucks'
			body '...'
		}
	}
}

class Mailer{

	def to(to){
		println "to : $to"
	}
	def from(from){
		println "from : $from"
	}
	def subject(sub){
		println "subject : $sub"
	}
	def body(body){
		println "body : $body"
	}

	static send(closure){
		Mailer mailer = new Mailer()
		mailer.with closure
	}
}
