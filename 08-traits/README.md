<link rel='stylesheet' href='../assets/css/main.css'/>

# Traits

We will continue building on the shapes concept.

Take a look at these 3 files:
- Triangle.scala
- Square.scala
- Shape.scala

`Shape.scala` is a new file defining the trait.

## Step 1: Implement `Shape` in `Triangle`

Modify `Triangle` as follows

```scala
class Triangle(a: Int, b: Int, c:Int ) extends Shape {
    ...

    // and implement the sides function
    // this is from Shape
    override def sides(): Int = 3
}
```

## Step 2 - Main

In Main, create a new `Triangle`.

And print out `sides()`

## Step 3 - Square

Implement the trait in `Square`  class.

Print out the sides for square