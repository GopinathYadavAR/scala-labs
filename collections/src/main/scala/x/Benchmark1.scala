package x

// adopted with thanks from : https://www.baeldung.com/scala/vector-benefits

import scala.util.Random

object Benchmark1 {
    def main(args: Array[String]) {
        val numElements = 50000
        val vec:Vector[Int] = (1 to numElements).toVector
        val lst:List[Int] = (1 to numElements).toList

        // TODO-1 : Go ahead and run this benchmark

        // TODO-2: to create an array : (1 to numElements).toArray
        // TODO-3: to create an arrayBuffer : (1 to numElements).toBuffer

        println (s"List: time for ${numElements} random access is %,.2f ms".format(randomAccessSeq(lst, numElements)))
        println (s"Vector: time for ${numElements} random access is %,.2f ms".format(randomAccessSeq(vec, numElements)))
  }

  def randomAccessSeq(seq:Seq[Int], it:Int): (Double) ={
    val begin = System.currentTimeMillis
    for (j <- 0 until it) {
        val idx = Random.nextInt(it)
        val elem = seq(idx)
    }
    val elapsedTime = System.currentTimeMillis - begin
    return (elapsedTime)
}
}
