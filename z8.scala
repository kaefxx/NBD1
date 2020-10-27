object z8 {
  def main(args: Array[String]): Unit = {
    val numbers = List(0, 0, 0, 7, 8, 47, 8, 5, 0, 2, 65, 4, 8, 74, 9, 6);

    def removeZerosRecur(index: Int): List[Int] = {
      if (index >= 0) {
        if (numbers(index) == 0) {
          removeZerosRecur(index - 1)
        } else {
          removeZerosRecur(index - 1).appended(numbers(index))
        };
      } else {
        List();
      }
    }

    println(removeZerosRecur(numbers.length - 1));
  }
}
