import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int[] input = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt).toArray();

    if(input[0] == input[1]){
    System.out.print("==");
    } else if(input[0] > input[1]){
    System.out.print(">");
        
    }else {
    System.out.print("<");
        
    }

  }
}
