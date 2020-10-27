object z10 {
  def main(args: Array[String]): Unit = {
    val numbers = List(-234, 54, 432, 5, 23, 5, 2, 87, 34, 11, 12, -4, -32, -54);

    def process(numbers: List[Int]): List[Int] = {
      return numbers.filter(number => number >= -5 && number <= 12).map(number => number.abs);
    }

    println(process(numbers));
  }
}
