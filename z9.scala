object z9 {
  def main(args: Array[String]): Unit = {
    val numbers = List(7, 8, 47, 8, 5, 2, 65, 4, 8, 74, 9, 6);

    def increase(numbers: List[Int]): List[Int] = {
      return numbers.map(number => number+1);
    }

    println(increase(numbers));
  }
}
