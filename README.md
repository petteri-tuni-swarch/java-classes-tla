# Java Classes TLA

Introduction to Java: class, abstract class, interface.

For more information:
* http://tutorials.jenkov.com/java/index.html

## Build

```
$ git clone xxx
$ cd xxx
$ mvn package

```

# Demo steps

## Sub package step1 - Java class
```
$ java -cp target/classes-1.0-SNAPSHOT.jar fi.ithou.javacore.classes.step1.App1
```
## Sub package step2 - abstract class
```
$ java -cp target/classes-1.0-SNAPSHOT.jar fi.ithou.javacore.classes.step2.App2
```
## Sub package step3 - interface
```
$ java -cp target/classes-1.0-SNAPSHOT.jar fi.ithou.javacore.classes.step3.App3
```
## Sub package step4 - implementing multiple interfaces
```
$ java -cp target/classes-1.0-SNAPSHOT.jar fi.ithou.javacore.classes.step4.App4
```

# Example of running all the examples

```
$ mvn clean package 

$ for id in 1 2 3 4; do java -cp target/classes-1.0-SNAPSHOT.jar fi.ithou.javacore.classes.step$id.App$id; echo "=============="; done
Hello. This is class fi.ithou.javacore.classes.step1.App1
Our garage:
Car object null
Car object Ford Ka
==============
Hello. This is class fi.ithou.javacore.classes.step2.App2
Java Abstract Class example
Our garage:
Car object Ford Granada # 9.7
Car object BMW i3 # 13.5
Car object T-Ford # 0.0
==============
Hello. This is class fi.ithou.javacore.classes.step3.App3
Java Interface (class type) example
Our garage:
Car object null
Car object Ford Ka
==============
Hello. This is class fi.ithou.javacore.classes.step4.App4
Java Abstract Class example
Our garage:
Car object Ford Ka - Contract: 3 year leasing
Car object Volvo S40 # 7.8
==============
```
