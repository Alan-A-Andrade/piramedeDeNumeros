public class App {
    public static void main(String[] args) throws Exception {
        

      int value = 9;

      for (int i = 1; i <= value; i++) {
        
        String lineOutput = ""+i;

        for (int j = 1; j < i; j++) {

          lineOutput += i;
          
        }
        
        System.out.println(lineOutput);

      }
    }
}
