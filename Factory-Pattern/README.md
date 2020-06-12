Factory Pattern<br>

A factory produces products and a software factory produces objects<br>

generally we do Obj ob = new Obj(); <br>
this make our Obj Class to depend upon concrete implementation of some class<br>


like i want to design Class for Kia Seltos <br>
<img src="../../src/Kia-Seltos.jpg"><br>

I would use KiaSeltos.java <br>
but if i want to make different variant <br>

I have to change my client code every time I release new Variant<br>

so I would use KiaSeltosFactory in which i would subclass KiaSeltos and make my own variant<br>
which is KiaSeltosFactory.java