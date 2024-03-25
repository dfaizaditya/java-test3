import java.util.Scanner;
import java.util.ArrayList;

public class App {
  
  public static void main(String[] args) {
    // Read input from the user
    String[] lines = getStdin();
    
    for (int i = 0, l = lines.length; i < l; i++) {
      // Process each line and generate the output
      String output = String.format("hello %s", lines[i]);
      // Print the output to standard output
      System.out.println(output);
    }
  }

  private static String[] getStdin() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> lines = new ArrayList<>();
    while (scanner.hasNext()) {
      lines.add(scanner.nextLine());
    }
    return lines.toArray(new String[lines.size()]);
  }
}
