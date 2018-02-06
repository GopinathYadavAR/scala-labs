package example

object InvestmentValuation   {

  def main(args: Array[String]) {
    println("Make some offers here)

    val offerBitCoin = getOffer(Crypto("Bitcoin", 1000.0))
    println("Offering " + offerBitCoin + " for BitCoin")
    val offerRealEstate = getOffer(RealEstate("House", 1000000.0, 2000.0))
    println("Offering " + offerRealEstate + " for House")
    val offerMutualFund = getOffer(MutualFund("SP500", 2000.0, "lowrisk"))
    println("Offering " + offerMutualFund + " for Mutual Fund")

  }

   // TOOD: Complete this: def getOffer(investment: Investment): Double = investment match {
   //}

}
