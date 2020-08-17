## Usage
Put sequence of numbers followed by a letter and press enter.

## How it works

Having the list introduced, we want to know:
- how many elements are in the list - calling the size() method
- how many distinct elements are in the list - calling the size() method on a TreeSet initialized with input list.
- what is the biggest value in the list - calling the first() method on an already initialized TreeSet (supposing that an input could be really big, it is better to operate on a smaller collection, which is TreeSet)
- what is the smallest value in the list - calling last() method analogically.