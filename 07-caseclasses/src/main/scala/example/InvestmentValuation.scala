package example


object InvestmentValuation   {
  val crypto = Crypto("name", 20.0)

  def main(args: Array[String]) {
    println("Make some offers here")

    val offerBitCoin = getOffer(Crypto("Bitcoin", 1000.0))
    println("Offering " + offerBitCoin + " for BitCoin")
    val offerRealEstate = getOffer(RealEstate("House", 1000000.0, 2000.0))
    println("Offering " + offerRealEstate + " for House")
    val offerMutualFund = getOffer(MutualFund("SP500", 2000.0, "lowrisk"))
    println("Offering " + offerMutualFund + " for Mutual Fund")

  }

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
}
