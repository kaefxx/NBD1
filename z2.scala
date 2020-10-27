object z2 {
  def main(args: Array[String]): Unit = {
    val days = Array("poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela");

    def recursiveDays(index: Int): String = {
      if (index > 0) {
        return (recursiveDays(index - 1) + ", " + days(index));
      } else {
        return days(index);
      }
    }

    def recursiveDaysBackwards(index: Int): String = {
      if (index < days.length - 1) {
        return (recursiveDaysBackwards(index + 1) + ", " + days(index));
      } else {
        return days(index);
      }
    }

    println(recursiveDays(days.length - 1));
    println(recursiveDaysBackwards(0));

  }
}
