package example

import org.scalatest._

class InvestmentValuationSpec extends FlatSpec with Matchers {
  "The InvestmentValuation object" should "use case classes" in {
    InvestmentValuation.goal shouldEqual "use case classes"
  }
}
