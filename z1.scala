object z1 {
  def main(args: Array[String]): Unit = {

    val days = Array("poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela");

    def forDays(days: Array[String]) {
      var concat = days(0);
      var i = 1;
      for (i <- 1 until days.length) {
        concat += ", ";
        concat += days(i);
      }
      println(concat);
    }

    def whileDays(days: Array[String]) {
      var i = 1;
      var concat = days(0);
      while (i < days.length) {
        concat += ", ";
        concat += days(i);
        i+=1;
      }
      println(concat);
    }
    //1a
    forDays(days);
    //1b
    forDays(days.filter(name => name.charAt(0) == 'p'));
    //1c
    whileDays(days);
  }
}
