It is used to create one and only one instance of a class<br>
Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.<br>
<br>
1. To make only one instance we have to make our constructor private<br>
so that other objects don't use new for making objects<br>
<br>
2. Create a static method for object creation <br>
<br>
you can see simple Singleton.java file above <br>
<br>
there are some cons like<br>
client knows too much details <br>
and it needs some special handling in multithreading environment<br>
<br>
like we can use synchronised for static method <br>
or we can use static  initialization <br>
but for static initialization if we don't need object we are still creating it<br>
and synchronized is expensive<br>

So solution to that we can use double check method like <br>
<br>
<br>
public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){<br>
    &nbsp;if(instance == null){<br>
    &nbsp;   &nbsp; // here we are synchronizing only when needed and this is only one time when we create instance<br>
    &nbsp;    &nbsp;synchronized (ThreadSafeSingleton.class) {<br>
    &nbsp;        &nbsp;if(instance == null){<br>
    &nbsp;       &nbsp;   &nbsp;  instance = new ThreadSafeSingleton();<br>
    &nbsp;       &nbsp; }<br>
    &nbsp;    &nbsp;}<br>
    &nbsp;}<br>
    &nbsp;return instance;<br>
} <br>
<br>
<br>

<a href="https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples">here is an awesome link for singleton pattern</a><br>

it includes a lot of varieties of singleton pattern<br>