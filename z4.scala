object z4 {
  def main(args: Array[String]): Unit = {
    val days = Array("poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela");

    println(days.foldLeft("")((s1, s2) => (if (s1 == "") s2 else s1 + ", " + s2)));
    println(days.foldRight("")((s1, s2) => (if(s2 == "") s1 else s1 + ", " + s2)));
    println(days.foldLeft("")((s1, s2) => (if(s2.charAt(0) == 'p') {if (s1 == "") s2 else s1 + ", " + s2} else s1)));
  }
}
