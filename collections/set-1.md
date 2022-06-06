<link rel='stylesheet' href='../assets/css/main.css'/>

# Collections : Set

## Sets

* Set doesn't maintain order of elements
* Set doesn't allow duplicates
* Set has both mutable and immutable implementations

## Start Scala REPL

```bash
# if you are using SDK man, be sure to initialize it 
$   source "$HOME/.sdkman/bin/sdkman-init.sh"
```

```bash
$   scala
```

Try the following statements in REPL environment

## Sets

```scala
// no dupes allowed
> val s1 =  Set (1,2,2,3,4)
val s1: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)

// access an element
> s1(3) // True - element exists
> s1(10) // False - element does NOT exist
```

## Mutable Set

```scala
> val s2 = scala.collection.mutable.Set(1,2,3,4)

// add a new element
> s2 += 5
> s2  // changed with 5 added

// remove
> s2.remove(3)
val res59: Boolean = true

> s2
val res60: scala.collection.mutable.Set[Int] = HashSet(1, 2, 4, 5)

// remove all elements from Set
> s2.clear()
scala.collection.mutable.Set[Int] = HashSet()

```