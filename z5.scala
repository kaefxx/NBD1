object z5 {
  def main(args: Array[String]): Unit = {
    val products = Map("Jabłko" -> 3.0, "Wiśnie" -> 5.0, "Frytki" -> 10.0);
    val mappedProducts = products.map{case (name, price) => (name, 0.9*price)};
    println(mappedProducts);
  }
}
