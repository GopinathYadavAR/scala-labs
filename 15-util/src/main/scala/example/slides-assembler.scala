// Slide assembler
// To run, do 'scala slides-assembler.scala
import scala.io.Source
import sys.process._
import scala.language.postfixOps
import java.io.File

println("Slides assembler")

if (args.size == 0) {
  println("Expected input: <list file>")
  println("In the list file, each listed file is copied to the output")
  println("If there is a second name in the line, the file is copied to this second name")
  println("Blank lines and # comments are allowed")
  System.exit(0)
}
println("Using list files:" + args(0))

val output_dir = "assembly.out"

"rm -fr " + output_dir !

"mkdir -p " + output_dir !

val filename = args(0)
println("copyings files from " + filename + " into dir " + output_dir)
var count = 0
for (line <- Source.fromFile(filename).getLines) {
  if (!line.startsWith("#") && !line.trim.isEmpty) {
    println(line)
    count = count + 1
    f"$count%1.5f"
    val tokens = line.split(" ")
    val target = new File(tokens(0)).getName()
    tokens.size match {

      case 1 => "cp " + tokens(0) + " " + output_dir + "/" + f"$count%02d" + "__" + target !

      case 2 => "cp " + tokens(0) + " " + output_dir + "/" + f"$count%02d" + "__" + tokens(1) !

      case default => println("tokens.size=" + tokens.size + " This line sucks: " + line)
    }
  }
}
println("Copied (or tried to) " + count + " files")
println("Files count in " + output_dir + ": " +new File(output_dir).list.size)