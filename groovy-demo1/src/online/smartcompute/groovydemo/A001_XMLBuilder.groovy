package online.smartcompute.groovydemo

public class A001_XMLBuilder {

	static main(String [] args){
		def lans = ["c++" : "microsoft","java" : "oracle"]
		def bldr = new groovy.xml.MarkupBuilder()
		bldr.languages{
			lans.forEach{k,v ->
				language(name : k){ trademark(v) }
			}
		}
		def book = new BookBean()
		book.setTitle("Groovy in Action")
		println(book.getTitle())
		[1, 2, 3].each({item -> print(item)})
		def xr=1..3
		for(each in xr){
			print(each)
		}
		println((1+2+3*4).toString())

		println(1.plus(2).multiply(3).toString())

		String var1 = "ssss"

		println var1
	}
}


class BookBean{
	String title
}


