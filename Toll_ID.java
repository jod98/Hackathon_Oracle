import java.util.*;
class Main {
  public static void main(String[] args) {
    String tolls[] = {"M50 Barrier-free with electronic toll", "M1 (Gormanston – Monasterboice)", "M3 (Clonee – Kells)", "M4 (Kilcock – Enfield – Kinnegad)", "N6 (Galway – Ballinasloe)", "M7/M8 (Portlaoise – Castletown/Portlaoise – Cullahill)", "N8 (Rathcormac – Fermoy Bypass)", "N25 (Waterford City Bypass)", "East-Link Bridge", "Dublin Tunnel", "Limerick Tunnel"};

		Random rand = new Random();
		for(int i=0; i<650; i++)
		{
			int randomToll = rand.nextInt(tolls.length);
			System.out.println(tolls[randomToll]);
		}
  }
}