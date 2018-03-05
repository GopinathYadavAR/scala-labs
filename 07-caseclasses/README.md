# Case Classes Lab

### STEP 1: Consider on the definition of investments with case classes below

    abstract class Investment
    case class RealEstate(name: String, value: Double, monthly: Double)
    case class Crypto(name: String, amount: Double)
    case class MutualFund(name: String, amount: Double, yieldType: String)
    case class Portfolio(name: String, investment: Investment)

### STEP 2: Start with the getOffer implementation that does not do anything

    def getOffer(investment: Investment): Double = investment match {
      case RealEstate(name, value, monthly) =>
        println("Considering a real estate investment into " + name)
        value + 12 * monthly
      case Crypto(name, amount) =>
        println("Be careful with " + amount + " of " + name)
        amount * 5000
      case _ =>
        println("I will consider any investment")
        1
    }

### STEP 3: Now, write your own definition of getOffer that would produce an offer, in dollars, which you are willing to pay for a given investment opportunity. Guidelines

1. For real estate, offer its value plus the three years of rental income
1. For Bitcoin, offer 1/10 of the value of the current exchange rate
1. For a MutualFund, offer 90% of the value for the low risk yieldType and 80% of the value
for high-risk yieldType.
1. Include investment formula for a Portfolio.
1. Add a unit test.