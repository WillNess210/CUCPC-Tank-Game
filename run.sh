clear
javac $(find -name "*.java" -not -path "./bots/*")
java Main bots/SampleJavaBot bots/SampleJavaBot
find -name "*.class" -not -path "./bots/*" -delete
