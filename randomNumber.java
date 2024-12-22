import java.util.Random;

public class main {

		public static void main(String[] args) {
			Random rand = new Random();
		       for(int i=0;i<5;i++)
		       {
			      System.out.println("%04d%n", rand.nextInt(10000));
		       }	       
		
		}
}

