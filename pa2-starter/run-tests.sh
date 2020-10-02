javac -cp lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:. cse12pa2student/*.java

java -cp lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore cse12pa2student.TestLists 2>&1 | grep -v "\tat"
