import java.util.*;
class Main {
  public static void main(String[] args) {
    String tagProviders[] = {"Direct Route", "Easy Trip", "eFlow", "Toll Tag"};
		Random rand = new Random();
		for(int i=0; i<650; i++)
		{
			int randomTag = rand.nextInt(tagProviders.length);
			System.out.println(tagProviders[randomTag]);
		}

  }
}
