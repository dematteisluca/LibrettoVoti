package it.polito.tdp.libretto;


import java.time.LocalDate;
import java.util.List;

public class TestiLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Libretto l = new Libretto();
   l.add(new Voto(18, "Analisi I", LocalDate.of(2017,  1,  15))); 
   l.add(new Voto(20, "Fisica II", LocalDate.of(2017,  1,  15)));
   l.add(new Voto(30, "Informatica", LocalDate.of(2017,  1,  15))); 
   l.add(new Voto(24, "Economia", LocalDate.of(2017,  1,  15))); 
   l.add(new Voto(24, "Geometria", LocalDate.of(2017,  1,  15))); 
   l.add(new Voto(26, "Sistemi di produzione", LocalDate.of(2017,  1,  15))); 
   l.add(new Voto(28, "Sistemi elettrici", LocalDate.of(2017,  1,  15))); 
   l.add(new Voto(20, "Fisica I", LocalDate.of(2017,  1,  15))); 
   l.add(new Voto(24, "Pgp", LocalDate.of(2017,  1,  15))); 
   l.add(new Voto(24, "Basi di dati", LocalDate.of(2017,  1,  15))); 
   
   //Punto2
   List<Voto> venticinque = l.cercaVoti(25);
   for (Voto v : venticinque) {
	   System.out.println(v.stampa());
   }
   //Punto3
   System.out.println(l.CercaCorso("Economia"));
	
	
	//Punto4 
	
	
	
	
    Voto giusto= new Voto(18, "Geometria", LocalDate.now());
    Voto sbagliato= new Voto(24, "Geometria", LocalDate.now());
    Voto mancante= new Voto(25, "Merendine", LocalDate.now());
    
    System.out.format("il voto %s é %s\n",
    		giusto.toString(), l.VotoGiaPresente(giusto));
    
    System.out.format("il voto %s é %s\n",
    		sbagliato.toString(), l.VotoGiaPresente(sbagliato));
    System.out.format("il voto %s é %s\n",
    		mancante.toString(), l.VotoGiaPresente(mancante));
    System.out.format("il voto %s é in conflitto%s\n",
    		giusto.toString(), l.VotoConflitto(giusto));
    
    System.out.format("il voto %s é in conflitto%s\n",
    		sbagliato.toString(), l.VotoConflitto(sbagliato));
    System.out.format("il voto %s é in conflitto%s\n",
    		mancante.toString(), l.VotoConflitto(mancante));
    
    System.out.println(l.add(giusto));
    System.out.println (l.add(sbagliato));
    System.out.println(l.add(mancante));
    
    System.out.println(l.toString());
    
    System.out.println("*** Migliora il libretto***");
    Libretto migliore= l.LibrettoMigliorato();
    
    System.out.println(l.toString());
    System.out.println(migliore.toString());
    
    migliore.cancellaVotiScarsi();
    System.out.println(migliore.toString());
    

	}
    
}
