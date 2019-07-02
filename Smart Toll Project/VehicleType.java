import java.util.*;
class Main {
  public static void main(String[] args) {

		String info[] = 
		{"M1 (Gormanston – Monasterboice)*Motorbike|1.00",
		"M1 (Gormanston – Monasterboice)*Car|1.90",
		"M1 (Gormanston – Monasterboice)*Bus|3.40",
		"M1 (Gormanston – Monasterboice)*LGV|3.40",
		"M1 (Gormanston – Monasterboice)*HGV/(2/3 axles)|4.80",
		"M1 (Gormanston – Monasterboice)*HGV (>3 axles)|6.10",
			
		"M3 Clonee – Kells (Clonee-Dunshauglin)*Motorbike|1.00",
		"M3 Clonee – Kells (Clonee-Dunshauglin)*Car|1.90",
		"M3 Clonee – Kells (Clonee-Dunshauglin)*Bus|3.40",
		"M3 Clonee – Kells (Clonee-Dunshauglin)*LGV|3.40",
		"M3 Clonee – Kells (Clonee-Dunshauglin)*HGV (2/3 axles)|4.80",
		"M3 Clonee – Kells (Clonee-Dunshauglin)*HGV (>3 axles)|6.10",

		"M3 Clonee – Kells (Navan-Kells)*Motorbike|0.70",
		"M3 Clonee – Kells (Navan-Kells)*Car|1.40",
		"M3 Clonee – Kells (Navan-Kells)*Bus|2.20",
		"M3 Clonee – Kells (Navan-Kells)*LGV|2.20",
		"M3 Clonee – Kells (Navan-Kells)*HGV (2/3 axles)|2.90",
		"M3 Clonee – Kells (Navan-Kells)*HGV (>3 axles)|3.60",

		"M4 Kilcock - Enfield - Kinnegad*Motorbike|1.50",
		"M4 Kilcock - Enfield - Kinnegad*Car|2.90",
		"M4 Kilcock - Enfield - Kinnegad*Bus|4.40",
		"M4 Kilcock - Enfield - Kinnegad*LGV|4.40",
		"M4 Kilcock - Enfield - Kinnegad*HGV (2/3 axles)|5.80",
		"M4 Kilcock - Enfield - Kinnegad*HGV (>3 axles)|7.10",

		"N6 Galway - Ballinasloe*Motorbike|1.00",
		"N6 Galway - Ballinasloe*Car|1.90",
		"N6 Galway - Ballinasloe*Bus|3.40",
		"N6 Galway - Ballinasloe*LGV|3.40",
		"N6 Galway - Ballinasloe*HGV (2/3 axles)|4.80",
		"N6 Galway - Ballinasloe*HGV (>3 axles)|6.10",

		"M7/M8 Portlaoise-Castletown/Cullahill*Motorbike|1.00",
		"M7/M8 Portlaoise-Castletown/Cullahill*Car|1.90",
		"M7/M8 Portlaoise-Castletown/Cullahill*Bus|3.40",
		"M7/M8 Portlaoise-Castletown/Cullahill*LGV|3.40",
		"M7/M8 Portlaoise-Castletown/Cullahill*HGV (2/3 axles)|4.80",
		"M7/M8 Portlaoise-Castletown/Cullahill*HGV (>3 axles)|6.10",

		"N8 Rathcormac*Motorbike|1.00",
		"N8 Rathcormac*Car|1.90",
		"N8 Rathcormac*Bus|3.40",
		"N8 Rathcormac*LGV|3.40",
		"N8 Rathcormac*HGV (2/3 axles)|4.80",
		"N8 Rathcormac*HGV (>3 axles)|6.10",

		"Limerick Tunnel*Motorbike|1.00",
		"Limerick Tunnel*Car|1.90",
		"Limerick Tunnel*Bus|3.40",
		"Limerick Tunnel*LGV|3.40",
		"Limerick Tunnel*HGV (2/3 axles)|4.80",
		"Limerick Tunnel*HGV (>3 axles)|6.10",

		"N24 Waterford City Bypass*Motorbike|1.00",
		"N24 Waterford City Bypass*Car|1.90",
		"N24 Waterford City Bypass*Bus|3.40",
		"N24 Waterford City Bypass*LGV|3.40",
		"N24 Waterford City Bypass*HGV (2/3 axles)|4.80",
		"N24 Waterford City Bypass*HGV (>3 axles)|6.10",

		"Dublin Tunnel*Motorbike|10",
		"Dublin Tunnel*Car|10",
		"Dublin Tunnel*Bus|10",
		"Dublin Tunnel*LGV|10", //Time of day correspond
		"Dublin Tunnel*HGV (2/3 axles)|0",
		"Dublin Tunnel*HGV (>3 axles)|0", //Exempt from tolls 

		"Dublin Tunnel*Motorbike|3",
		"Dublin Tunnel*Car|3",
		"Dublin Tunnel*Bus|3",
		"Dublin Tunnel*LGV|3", 
		"Dublin Tunnel*HGV (2/3 axles)|0",
		"Dublin Tunnel*HGV (>3 axles)|0", 

		"M50 Barrier-free with electronic toll*Motorbike|3.10",
		"M50 Barrier-free with electronic toll*Car|3.10",
		"M50 Barrier-free with electronic toll*Bus|4.00",
		"M50 Barrier-free with electronic toll*LGV|5.30",
		"M50 Barrier-free with electronic toll*HGV (2/3 axles)|6.30",
		"M50 Barrier-free with electronic toll*HGV (>3 axles)|6.30",

		"The East Link Toll Bridge*Motorbike|0",
		"The East Link Toll Bridge*Car|1.40",
		"The East Link Toll Bridge*Bus|2.10",
		"The East Link Toll Bridge*LGV|2.10",
		"The East Link Toll Bridge*HGV (2/3 axles)|3.50",
		"The East Link Toll Bridge*HGV (>3 axles)|4.25",
};

String infoShuffle[] = new String[650];
Random rand = new Random();
		for(int i=0; i<650; i++)
		{
			int randomInfo = rand.nextInt(info.length);
			infoShuffle[i] = info[randomInfo]; //Shuffled array of info
			//System.out.println(infoShuffle[i]); 
		}
		for(int j=0; j<250; j++)
		{
			//System.out.println(infoShuffle[j]);
			
			String toll = infoShuffle[j].substring(0, infoShuffle[j].indexOf("*"));
			String vehicle = infoShuffle[j].substring(infoShuffle[j].indexOf("*")+1, infoShuffle[j].indexOf("|"));
			String price = infoShuffle[j].substring(infoShuffle[j].indexOf("|") +1);

			System.out.println(toll);
			System.out.println(vehicle);
			System.out.println(price);
			
		}
	}
}

