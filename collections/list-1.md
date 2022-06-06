<link rel='stylesheet' href='../assets/css/main.css'/>

# Collections : List

## Lists

* List is immutable (Linked list implementation)
* List can not be modified. When you add/delete elements a new list is created
* ProTip: Since List is a Linear Linked List implementation, accessing elements in the front are faster. Accessing elements at the end are relatively slower operation. Vector or ArrayBuffer are better options

## Start Scala REPL

```bash
# if you are using SDK man, be sure to initialize it 
$   source "$HOME/.sdkman/bin/sdkman-init.sh"
```

```bash
$   scala
```

Try the following statements in REPL environment

## Lists

```scala
> var a = (1 to 10).toList
> a.length

// access an element
> a(5)

// drop an element
> val b = a.drop(2)

// a still unchanged
> a
```

## Append / Prepend

```scala
// prepend
> val c = 0 +: a
val c: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// append
> val d = a :+ 11
val d: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
```

## Iterate over Lists

```scala
for (x <- a) {
    println (x)
}
```