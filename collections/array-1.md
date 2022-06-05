<link rel='stylesheet' href='../assets/css/main.css'/>

# Collections 1

## Start Scala REPL

```bash
# if you are using SDK man, be sure to initialize it 
$   source "$HOME/.sdkman/bin/sdkman-init.sh"
```

```bash
$   scala
```

Try the following statements in REPL environment

## Arrays

Start with arrays

```scala

// array size has to be set in the beginining and can not be changed later
var a = new Array[Int](3) 
// Question: What are the initial values of array

// set some values
> a(0) = 10
> a
Array[Int] = Array(10, 0, 0)

// try to add to the array
a += 4
// Question: What is the result
```

## Iterate over array

```scala
> for(i<-a) {
     println(i)
  }
```

## Convert a Range into array

```scala
>  val a = (1 to 10).toArray
```

## Multi Dimensional Arrays

```scala
// rows , cols
> var a2 = Array.ofDim[Int](3,2)
> a2(0)
> a2(0)(1) = 10
```

## Array operations

Find a sum of all elements in array.  We will do it manually so we are familiar with array itereation

```scala
> val a = Array ([4, 3, 2, 7, 10, 6])


// loop through the array
> for (i <- a) {
    println (i)
}

// now sum it all up
> var sum = 0
> for (i <- a) {
    // TODO: add up 
    sum += ???
}
```

Now find the max value.

```scala
// initialize max
> max = ???

> for ( i <- a)  {
    if (i > max)
       // TODO 
       max = ???
}
```
