##############################
map/filter/reduce
Streams
intermediary vs final operations
consuming operations :  forEach() and peek()
mapping operations :  map() and flatMap()
filter operation : filter()
reductions operations :
    Aggregations : reduce(), max(), min()...
    Mutable reductions : Collect, Collectors...
################################
Functional interface is an interface with single abstract method
Types of Lamdbas
package java.util.function;
1 - Supplier  : Takes no object returns one 
2 - Consumer  : Takes one object returns nothing
3 - Predicate : Filters data
4 - Function  : Takes object returns objects
----------------------------------------------
Map/Filter/Reduce algorithm

Stream - 
    It's an object on which one can define an operation
    It doesn't hold any data
    Should not change the data it processes
    Able to process data in <<one pass>> map/filter/reduce
    Optimized from algorithm point of view

It can efficiently process the data large/small
Efficiently - 
    Data can be automatically processed in parallel, to leverage multicore CPUs
    Pipelined, to avoid unnecessary intermediates
    
We can write static methods in Java and this is another way of creating streams
Stream doesn't hold any data

MAP -  map() returns a Stream

---------------------
STREAMS -  It is an object which contains the collection stream it doesn't holds data and doesn't process unlestt terminal method like
            forEach,Collect or Aggregate methods sum,max called
Functional interfaces, which contains only abstract method but can have multiple default methods
    Predicate 
    Consumer
    Function  etc.
map,flatmap,reduce and filter are operations to be performed on Stream , which can take one of the defined Functional interface as input
    map - creates another stream object
    flatmap -> map to the object
    reduce ->  performs operations on stream  using identity element
LAMBDA - takes operation as parameter. mainly used to remove anonymous classses for Functional interfaces like Runnable
METHOD REFERENCE - allows lambda to call methods directly on names 
OPTIONAL - it is used when we dont want to return null, if present you can call another action on it

