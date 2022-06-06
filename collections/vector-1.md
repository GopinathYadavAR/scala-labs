<link rel='stylesheet' href='../assets/css/main.css'/>

# Collections : Vector

## Vectors

* Vector is indexed and immutable
* Because of indexing, we can access elements very quickly, both in the beginning and at the end
* Making any changes to Vector will result in a new Vector

## Start Scala REPL

```bash
# if you are using SDK man, be sure to initialize it 
$   source "$HOME/.sdkman/bin/sdkman-init.sh"
```

```bash
$   scala
```

Try the following statements in REPL environment

## Vectors

```scala
> val v1 = Vector (10,20,30,40)
v1: scala.collection.immutable.Vector[Int] = Vector(10, 20, 30, 40)

// access an element
> v1(3)

// drop an element, results in a new vector
> val v2 = v1.drop(2)

// v1 still unchanged
> v1
```

## Append / Prepend

```scala
// prepend
> val v3 = 0 +: v1
val v3: scala.collection.immutable.Vector[Int] = Vector(0, 10, 20, 30, 40)


// append
> val v4 = v1 :+ 50
val v4: scala.collection.immutable.Vector[Int] = Vector(10, 20, 30, 40, 50)
```

## Iterate over Vectors

```scala
for (x <- v1) {
    println (x)
}
```