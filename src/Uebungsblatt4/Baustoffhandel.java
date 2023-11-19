package Uebungsblatt4;

public class Baustoffhandel {
	
	public enum Kundentyp {
	        PRIVAT, GEWERBE
	    }
	
	public class Kunde {
		
		// Attribute
		private String name;
		private String adresse;
		private Kundentyp kundentype;
		private double umsatzVorjahr;
		
		// Konstruktor
		public Kunde (String name, String adresse, Kundentyp kundentype, double umsatzVorjahr){
			this.name = name;
			this.adresse = adresse;
			this.kundentype = kundentype;
			this.umsatzVorjahr = umsatzVorjahr;
			
		}
		
		// Getter und Setter (Methoden zum Lesen und Ändern der Attribute)
		public String getName () {
			return name;
		}
		
		public void setName (String name) {
			this.name = name;
		}
		
		public String getAdresse() {
			return adresse;
		}
		
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		
		public Kundentyp getKundentype () {
			return kundentype;
		}
		
		public void setKundentype (Kundentyp kundentype) {
			this.kundentype = kundentype;
		}
		
		public double getUmsatzVorjahr () {
			return umsatzVorjahr;
		}
		
		public void setUmsatzVorjahr (double umsatzVorjahr) {
			this.umsatzVorjahr = umsatzVorjahr;
		}
	}
	
	public class Artikel {
		
		//Atributte
		 private int artikelNummer ;
		 private String beschreibung;
		 private boolean lieferbarkeit;
		 
		 //Konstruktor
		 public Artikel (int artikelNummer, String beschreibung, boolean lieferbarkeit) {
			 this.artikelNummer = artikelNummer;
			 this.beschreibung = beschreibung;
			 this.lieferbarkeit = lieferbarkeit;
		 }
		 
			public int getArtikelNummer () {
				return artikelNummer;
			}
			
			public void setArtikelNummer (int artikelNummer) {
				this.artikelNummer = artikelNummer;
			}
			
			public String getBeschreibung () {
				return beschreibung;
			}
			
			public void setBeschreibung(String beschreibung) {
				this.beschreibung = beschreibung;
			}
			
			public boolean getLieferbarkeit() {
				return lieferbarkeit;
			}
			
			public void setBeschreibung(boolean lieferbarkeit) {
				this.lieferbarkeit = lieferbarkeit;
			}
	
	
	public class GewerblicherKunde extends Kunde {
		public GewerblicherKunde(String name, String adresse, double umsatzVorjahr) {
            super(name, adresse, Kundentyp.GEWERBE, umsatzVorjahr);
        }
	}
	
	public double Rabatt() {
		
		double umsatz = getUmsatzVorjahr();
		
		if (umsatz <= 3000) {
            return 0.02;
        } else if (umsatz <= 10000) {
            return 0.05;
        } else if (umsatz <= 30000) {
            return 0.1;
        } else {
            return 0.2;
        }
		
	}

	private double getUmsatzVorjahr() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
}
	
}
