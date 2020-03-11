import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;

class Solution {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 32768);
    PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    int T = Integer.parseInt(reader.readLine());

    for (int i = 1; i <= T; i++) {
      String n = reader.readLine();
      char[] a = new char[n.length()];
      char[] b = new char[n.length()];
      int sz = n.length();
      for (int j = 0; j < sz; j++) {
        if (n.charAt(j) == '4') {
          a[j] = '2';
          b[j] = '2';
        } else {
          a[j] = n.charAt(j);
          b[j] = '0';
        }
      }

      writer.println("Case #" + i + ": " + (new BigInteger(new String(a))) + " "
          + (new BigInteger(new String(b))));
    }
    writer.close();
  }
}
