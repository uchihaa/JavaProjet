import java.util.ArrayList;

import Aero.Aeroport;
import GestionAvion.Avion;
import GestionAvion.Etat;
import GestionGare.Hall;
import GestionGare.ParkingC;
import GestionGare.ParkingHC;
import GestionGare.Porte;
import GestionGare.Zone;
import GestionGare.ZoneG;
import GestionGare.ZoneP;
import Outils.Horaire;


public class Main {

	 public static void main(String[] args){
		 
		 /*Variables*/
		 
		 /*Cr�ation Hall*/
		 Hall hall1 = new Hall("1");
		 Hall hall2 = new Hall("2");
		 Hall hall3 = new Hall("3");
		 Hall hall4 = new Hall("4");
		 
		 /*Cr�ation Portes*/
		 Porte porte1 = new Porte("10A");
		 Porte porte2 = new Porte("10B");
		 Porte porte3 = new Porte("10C");
		 Porte porte4 = new Porte("20");
		 Porte porte5 = new Porte("21");
		 Porte porte6 = new Porte("22");
		 Porte porte7 = new Porte("23");
		 Porte porte8 = new Porte("24");
		 Porte porte9 = new Porte("30");
		 Porte porte10 = new Porte("31");
		 Porte porte11 = new Porte("32");
		 Porte porte12 = new Porte("33");
		 Porte porte13 = new Porte("40");
		 Porte porte14 = new Porte("41");
		 Porte porte15 = new Porte("42");
		 Porte porte16 = new Porte("43");
		 
		 /*Cr�ation Parking*/
		 ParkingC parking1 = new ParkingC(porte1, "P1");
		 ParkingC parking2 = new ParkingC(porte2, "P2");
		 ParkingC parking3 = new ParkingC(porte3, "P4");
		 ParkingC parking4 = new ParkingC(porte4, "R1");
		 ParkingC parking5 = new ParkingC(porte5, "R2");
		 ParkingC parking6 = new ParkingC(porte6, "S4");
		 ParkingC parking7 = new ParkingC(porte7, "S5");
		 ParkingC parking8 = new ParkingC(porte8, "T3");
		 ParkingC parking9 = new ParkingC(porte9, "T7");
		 ParkingC parking10 = new ParkingC(porte10, "U4");
		 ParkingC parking11 = new ParkingC(porte11, "V6");
		 ParkingC parking12 = new ParkingC(porte12, "V7");
		 ParkingHC parking13 = new ParkingHC(porte13, "M1");
		 ParkingHC parking14 = new ParkingHC(porte14, "M2");
		 ParkingHC parking15 = new ParkingHC(porte15, "M3");
		 ParkingHC parking16 = new ParkingHC(porte16, "M4");
		 
		 /*Cr�ation des Zones*/
		 Zone zoneM = new Zone("Mike");
		 ZoneP zoneP = new ZoneP("Papa");
		 ZoneP zoneR = new ZoneP("Romeo");
		 ZoneP zoneS = new ZoneP("Sierra");
		 ZoneP zoneT = new ZoneP("Tango");
		 ZoneP zoneU = new ZoneP("Uniform");
		 ZoneG zoneV = new ZoneG("Victor");
		 
		 /*Cr�ation des listes*/
		 
		 /*Liste Porte*/
		 ArrayList<Porte> listeHall1 = new ArrayList<Porte>();
		 ArrayList<Porte> listeHall2 = new ArrayList<Porte>();
		 ArrayList<Porte> listeHall3 = new ArrayList<Porte>();
		 ArrayList<Porte> listeHall4 = new ArrayList<Porte>();
		 listeHall1.add(porte1); listeHall1.add(porte2); listeHall1.add(porte3);
		 listeHall2.add(porte4); listeHall2.add(porte5); listeHall2.add(porte6); listeHall2.add(porte7); listeHall2.add(porte8);
		 listeHall3.add(porte9); listeHall3.add(porte10); listeHall3.add(porte11); listeHall3.add(porte12);
		 listeHall4.add(porte13); listeHall4.add(porte14); listeHall4.add(porte15); listeHall4.add(porte16);
		 
		 /*Liste Parking*/
		 ArrayList listeMike = new ArrayList();
		 ArrayList listePapa = new ArrayList();
		 ArrayList listeRomeo = new ArrayList();
		 ArrayList listeSierra = new ArrayList();
		 ArrayList listeTango = new ArrayList();
		 ArrayList listeUniform = new ArrayList();
		 ArrayList listeVictor = new ArrayList();
		 listeMike.add(parking13); listeMike.add(parking14); listeMike.add(parking15); listeMike.add(parking16);
		 listePapa.add(parking1);  listePapa.add(parking2);  listePapa.add(parking3);
		 listeRomeo.add(parking4);  listeRomeo.add(parking5);
		 listeSierra.add(parking6);  listeSierra.add(parking7);
		 listeTango.add(parking8);  listeTango.add(parking9);
		 listeUniform.add(parking10);
		 listeVictor.add(parking11);  listeVictor.add(parking12);
		 
		 /*Liste Hall*/
		 ArrayList<Hall> listeDesHalls = new ArrayList<Hall>();
		 listeDesHalls.add(hall1); listeDesHalls.add(hall2); listeDesHalls.add(hall3); listeDesHalls.add(hall4);
		 
		 /*Liste Zone*/
		 ArrayList<Zone> listeDesZones = new ArrayList<Zone>();
		 listeDesZones.add(zoneM); listeDesZones.add(zoneP); listeDesZones.add(zoneR); listeDesZones.add(zoneS);
		 listeDesZones.add(zoneT); listeDesZones.add(zoneU); listeDesZones.add(zoneV); 
		 
		 /*Affectation des listes*/
		 /*Hall - Portes*/
		 hall1.setListe(listeHall1);
		 hall2.setListe(listeHall2);
		 hall3.setListe(listeHall3);
		 hall4.setListe(listeHall4);
		 
		 /*Zone - Parking*/
		 zoneM.setListe(listeMike);
		 zoneP.setListeP(listePapa);
		 zoneR.setListeP(listeRomeo);
		 zoneS.setListeP(listeSierra);
		 zoneT.setListeP(listeTango);
		 zoneU.setListeP(listeUniform);
		 zoneV.setListeG(listeVictor);
		 
		 /*Cr�ation A�roport*/
		 Aeroport orly = new Aeroport("Orly");
		 orly.setListeHall(listeDesHalls);
		 orly.setListeZone(listeDesZones);
		 
		 
		 /*Avion */
		 Avion a1 = new Avion("55", "gaou", true);
		 Horaire h1 = new Horaire(13, 10);
		 Etat e1 = null;
		 Vol v1 = new Vol("66", a1, "Toulouse", h1, e1);
		 
		 //Sejour s1 = new Sejour()
	 }
	
}
