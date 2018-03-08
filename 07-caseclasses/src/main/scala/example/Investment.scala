package example

sealed abstract class Investment
case class RealEstate(name: String, value: Double, monthly: Double)
case class Crypto(name: String, amount: Double)
case class MutualFund(name: String, amount: Double, yieldType: String)
case class Portfolio(name: String, investment: Investment)