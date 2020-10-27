object z7 {
  def main(args: Array[String]): Unit = {
    val products = Map("Jabłko" -> 3.0, "Wiśnie" -> 5.0, "Frytki" -> 10.0);
    println(products.get("Cytryna").isDefined);
    println(products.get("Jabłko").isDefined);
  }
}
