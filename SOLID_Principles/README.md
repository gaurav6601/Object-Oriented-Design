Details of solid principles is here and code is just above.

<p>
<h4>The purpose of SOLID Design Principles</h4>
1.To make code maintainable <br>
2.To make it easier to quickly extend the system to new functionality without breaking the existing one<br>
3.To make code easier to read and understand. thus spend less time to figure what it does and more time actually developing the solution<br>

<p>


<h3>Single Responsibility Principle</h3>
Everything has its own place and everything should be in its place<br>
A class should have one and only one reason to change<br>
<br>
1. A class should only be responsible for one thing<br>
2. Find one reason reason to change and take everything else out of class<br>
3.Very precise name for many small classes  > generic name for large classes<br>
        like employee payroll,employee leave we know where to find them and make changes but on the other hand employee whole class it would be a mess<br>


so in above text manipulator.java we can separate text printing class<br>
to make a single responsibility<br>

<p>
<br>
<h3>Open/Close Principles</h3>
An entity should be open for extension but closed for modification<br>
<br>
1.Extend functionality by adding new code instead of changing existing code<br>
2.Seperate the behaviour, so the system can easily be extended, but never be broken.<br>
3.Goal: to get a point where you can never break the core of your system.<br>

example would be open source libraries you only code around them use their interfaces but never change it and at some point <br>
after it got used by many people it reached stable<br>
<br>
if you change in one class it effect other behaviour like mode of payment you changed it or want more type <br>
payment then you add function in payment class and in main(client side) you change again for accessing methods <br>
generally we use Factory pattern for this kind of cases<br>


<h3>Liskov Substitution principle</h3>

Any derived class should be able to substitute its parent class without consumer knowing it <br>
Every class that implements an interface must be able to substitute any reference through the code that implements the same interface <br>
Every part of the code should get expected result no matter what instance of class you sent to it, given it implements the same interface <br>

<img src="../src/liskov.jpg"></img>

Basically it tells us when to use inheritance or when to not <br>

lets look at example of rectangle and square we know that square is a rectangle <br>
which means we have a is a relation so we can sub child square to rectangle <br>


