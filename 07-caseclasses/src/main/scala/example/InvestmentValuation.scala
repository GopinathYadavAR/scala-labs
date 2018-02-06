package example

object InvestmentValuation extends Goal with App {
  println(goal)
}

trait Goal {
  lazy val goal: String = "use case classes"
}
