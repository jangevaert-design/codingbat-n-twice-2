public class NTwice2 {
  public String nTwice(String str, int n) {
    int len = str.length();

    return str.substring(0, n) + str.substring(len - n, len);
  }
}
