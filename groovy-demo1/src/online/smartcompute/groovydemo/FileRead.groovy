package online.smartcompute.groovydemo

class FileRead {

    public static main(String[] args) {
        println("Hello World")
        def number = 0;
        new File("C:\\Users\\masud\\masudhasan\\mywork\\MyGitHubRepository\\GroovyDemo1\\src\\online\\smartcompute\\groovydemo\\data.txt").eachLine({ line -> println(line) })

        def classess = [String, File, List]
        for (claz in classess) {
            println(claz.package.name)
        }
    }
}
