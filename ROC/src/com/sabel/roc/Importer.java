package com.sabel.roc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Importer {
	public static void main(String[] args) throws IOException {
		LaeuferResource lr = new LaeuferResource();
		File file = new File("D:\\Sachsenkam_Manner.csv");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String zeile;
		while ((zeile = br.readLine()) != null) {
			String[] split = zeile.split(";");
			Laeufer laeufer = new Laeufer();
			laeufer.setPlatzierung(Integer.parseInt(split[0]));
			laeufer.setStartNummer(Integer.parseInt(split[1]));
			laeufer.setName(split[2]);
			laeufer.setGebJahr(Integer.parseInt(split[3]));
			laeufer.setAltersKlasse(split[4]);
			laeufer.setVerein(split[5]);
			laeufer.setLaufZeit(split[6]);
			lr.addLaeufer(laeufer);
		}
	}
}
