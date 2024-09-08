# effective-java

This repo is for documentation and tutorial base on Effective Java book 3rd edition by Joshua Bloch.

## Item1:
Consider static factory methods instead of constructors

### Advantages:
1. Unlike constructors, they have names
2. They are not required to create a new object each time they are invoked, which allows immutable classes to use pre-constructed instances, or to cache instances.
3. Static factory methods can return any object of the subtype of their return class.
4. The output of Static factory methods can vary from call to call, depending on the input parameters (eg EnumSet).
5. The class of the returned object need not to exist when the class containing the method is written (eg JDBC API).

### Limitations:
1. The main limitation of providing only static factory methods is that classes without public or protected constructors cannot be subclassed.
2. A second shortcoming of static factory methods is that they are hard for programmers to find.

