import scala.annotation.tailrec

object z3 {
  def main(args: Array[String]): Unit = {
    val days = Array("poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela");
    @tailrec
    def tailRec(index: Int, result: String): String = {
      if (index == days.length) {
        return result;
      } else {
        return tailRec(index + 1, result + ", " + days(index));
      }
    }

    println(tailRec(1, days(0)));
  }
}
