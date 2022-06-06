<link rel='stylesheet' href='../assets/css/main.css'/>

# Collections : Array Buffer

## Array Buffers

* Mutable: so contents can be modified
* Resizable
* Indexed: so elements can be accessed effectively


## Start Scala REPL

```bash
# if you are using SDK man, be sure to initialize it 
$   source "$HOME/.sdkman/bin/sdkman-init.sh"
```

```bash
$   scala
```

Try the following statements in REPL environment

## Array Buffer

```scala
> val a = (1 to 10).toBuffer
val a: scala.collection.mutable.Buffer[Int] = ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// find the length
> a.length
Int: 10

// access elements
> a(5)
```

## Expand Array Buffer

```scala
// let's add a few more to the buffer
> a.appendAll ( (11 to 20))
> a
> a.length

// prepend
> a.prependAll ( Array (-1, -2, -3))
> a.length
```

