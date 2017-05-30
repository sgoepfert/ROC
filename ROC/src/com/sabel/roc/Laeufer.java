package com.sabel.roc;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Laeufer implements Serializable {
	private int platzierung;
	@Id
	private int startNummer;
	private String name;
	private int gebJahr;
	private String altersKlasse;
	private String verein;
	private String laufZeit;
	
	
	public Laeufer() {
		// TODO Auto-generated constructor stub
	}
	
	public int getPlatzierung() {
		return platzierung;
	}
	public void setPlatzierung(int platzierung) {
		this.platzierung = platzierung;
	}
	public int getStartNummer() {
		return startNummer;
	}
	public void setStartNummer(int startNummer) {
		this.startNummer = startNummer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGebJahr() {
		return gebJahr;
	}
	public void setGebJahr(int gebJahr) {
		this.gebJahr = gebJahr;
	}
	public String getAltersKlasse() {
		return altersKlasse;
	}
	public void setAltersKlasse(String altersKlasse) {
		this.altersKlasse = altersKlasse;
	}
	public String getVerein() {
		return verein;
	}
	public void setVerein(String verein) {
		this.verein = verein;
	}
	public String getLaufZeit() {
		return laufZeit;
	}
	public void setLaufZeit(String laufZeit) {
		this.laufZeit = laufZeit;
	}

	@Override
	public String toString() {
		return "Laeufer [platzierung=" + platzierung + ", startNummer=" + startNummer + ", name=" + name + ", gebJahr="
				+ gebJahr + ", altersKlasse=" + altersKlasse + ", verein=" + verein + ", laufZeit=" + laufZeit + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((altersKlasse == null) ? 0 : altersKlasse.hashCode());
		result = prime * result + gebJahr;
		result = prime * result + ((laufZeit == null) ? 0 : laufZeit.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + platzierung;
		result = prime * result + startNummer;
		result = prime * result + ((verein == null) ? 0 : verein.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laeufer other = (Laeufer) obj;
		if (altersKlasse == null) {
			if (other.altersKlasse != null)
				return false;
		} else if (!altersKlasse.equals(other.altersKlasse))
			return false;
		if (gebJahr != other.gebJahr)
			return false;
		if (laufZeit == null) {
			if (other.laufZeit != null)
				return false;
		} else if (!laufZeit.equals(other.laufZeit))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (platzierung != other.platzierung)
			return false;
		if (startNummer != other.startNummer)
			return false;
		if (verein == null) {
			if (other.verein != null)
				return false;
		} else if (!verein.equals(other.verein))
			return false;
		return true;
	}
}
