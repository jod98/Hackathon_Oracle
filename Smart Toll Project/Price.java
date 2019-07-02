import java.util.*;
class Main {
  public static void main(String[] args) {
    String vehicles[] = {"Motorbike", "Car", "Bus", "LGV", "HGV (2/3 axles)", "HGV (>3 axles)"};

		Random rand = new Random();
		for(int i=0; i<650; i++)
		{
			int randomVehicle = rand.nextInt(vehicles.length);
			System.out.println(vehicles[randomVehicle]);
		}
  }
}
  }
}
