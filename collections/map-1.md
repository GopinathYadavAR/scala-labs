<link rel='stylesheet' href='../assets/css/main.css'/>

# Collections : Map

## Maps

* Map stores key-value pairs
* No sorting order, and no duplicate keys

## Start Scala REPL

```bash
# if you are using SDK man, be sure to initialize it 
$   source "$HOME/.sdkman/bin/sdkman-init.sh"
```

```bash
$   scala
```

Try the following statements in REPL environment

## Maps

```scala
> val capitals = Map (
    "US" -> "Washington",
    "UK" -> "London",
    "France" -> "Paris"
)

capitals: scala.collection.immutable.Map[String,String] = Map(US -> Washington, 
UK -> London, France -> Paris)

// adding new keys won't work as the map is immutable
>  capitals("Japan") = "Tokyo"  // error

// no key found
> capitals("Canada")
java.util.NoSuchElementException: key not found: Canada

// check if key exists
> capitals.contains("US") //  Boolean = true
> capitals.contains("Canada") //  Boolean = false
```

## Mutable Map

```scala
> val capitals = scala.collection.mutable.Map[String, String]()
capitals: scala.collection.mutable.Map[String,String] = HashMap()

> capitals("US") = "Washington"
> capitals("UK") = "London"
> capitals

scala.collection.mutable.Map[String,String] = HashMap(UK -> London, US -> Washington)
```

## traversing a map

```scala
> for ((k,v) <- capitals) {
    println(s"key: $k, value: $v")
}
key: UK, value: London
key: US, value: Washington
```

