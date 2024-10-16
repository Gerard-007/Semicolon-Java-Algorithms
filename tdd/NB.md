#To compile test file
`javac -cp "junit-platform-console-standalone-1.11.0.jar" TestFile.java FileClass.java`

#To run the test file
`java -jar junit-platform-console-standalone-1.11.0.jar --class-path . --scan-classpath --include-classname TestFile`