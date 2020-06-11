Details of solid principles is here and code is just above.

<p>
<h4>The purpose of SOLID Design Principles</h4>
1.To make code maintainable 
2.To make it easier to quickly extend the system to new functionality without breaking the existing one
3.To make code easier to read and understand. thus spend less time to figure what it does and more time actually developing the solution

<p>


<h3>Single Responsibility Principle</h3>
Everything has its own place and everything should be in its place
A class should have one and only one reason to change
<br>
1. A class should only be responsible for one thing
2. Find one reason reason to change and take everything else out of class
3.Very precise name for many small classes  > generic name for large classes
        like employee payroll,employee leave we know where to find them and make changes but on the other hand employee whole class it would be a mess


so in above text manipulator.java we can separate text printing class
to make a single responsibility

<p>

<h3>Open/Close Principles</h3>
An entity should be open for extension but closed for modification
<br>
1.Extend functionality by adding new code instead of changing existing code
2.Seperate the behaviour, so the system can easily be extended, but never be broken.
3.Goal: to get a point where you can never break the core of your system.

example would be open source libraries you only code around them use their interfaces but never change it and at some point 
after it got used by many people it reached stable

if you change in one class it effect other behaviour like mode of payment you changed it or want more type 
payment then you add function in payment class and in main you change again for accessing methods 
generally we use Factory pattern for this kind of cases
