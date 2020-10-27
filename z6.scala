object z6 {
  def main(args: Array[String]): Unit = {
    val tuple3 = ("1", 2, 3.0): Tuple3[String, Int, Double];
    def printTuple(tuple3:Tuple3[String, Int, Double]): Unit = {
      println(tuple3._1)
      println(tuple3._2)
      println(tuple3._3)
    }
    printTuple(tuple3);
  }
}
