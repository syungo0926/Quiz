> javac -encoding utf8  -sourcepath src\main\java -d classes src/main/java/com/sample/**.java

> jar cvfm app.jar .\META-INF\MANIFEST.MF -C classes .

> java -jar app.jar
