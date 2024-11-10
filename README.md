# Java 9-23 playground

The goal of this project is test new features of Java across releases implemented in very simple examples.
Examples are simple but I would like to add it in some real apps problems as I not a fan o Foo examples. :)

There is also annotations refers to particular functionalities for examples : 

````
@Java10_var
@Java12_Collectors
````

### What still to cover

### Java 9

#### Default interfaces with private methods

Done by example of backwards compatible API extension example.  

### Java 10

#### var

Used in multiple examples like untappd controller and many others.

### Java 11

##### Optional empty

Done by simple test example.

#### var in lambdas

Done inside NilaUntappdController. 

### Java 12

##### Collector 

* done by simple collect demo.

### Java 13

##### Switch statements

Covered by craft beer grouper example with types of beers.

##### Text Blocks

Covered by quite dummy example of mocking server (Wiremock inspired:) as great example of text block usage would be text for json.

### Java 14

#### Records

Done with beer stats application for one of the POJOs (the 2nd one kept intentionally using Lombok).
There is also mocking server test (mainly for text blocks) with ObjectMapper to POJO via records.

### Java 15

#### Sealed Classes

Done with TeamMember in players demo to restrict implementation for real players not other team members like coach.

### Java 16

#### Pattern Matching Type Checks

Done by players example in Java 15 as we are using type check variable.

### Java 17

#### Pattern Matching for switch Expressions

Done with football stats with concept of switch providing key stat of particular position.
This is a concept of some general widget data providing key stats per position on some general view.

### Java 22

#### Constructor statement before super
