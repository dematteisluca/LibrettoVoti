package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti ;
	
	public Libretto() {
		this.voti = new ArrayList<Voto>() ;
	}
	
 /**
  * Aggiunge un nuovo voto al libretto
  * @param v {@link V
  */
		
	public boolean add(Voto v) {
		if (!this.VotoGiaPresente(v) && !this.VotoConflitto(v)) {
			voti.add(v);
			return true;
		} else {
			return false;
		}
	
		
	}
   
   public List<Voto> cercaVoti(int voto) {
	   List<Voto> result= new ArrayList<Voto>();
	   
	   for(Voto v: this.voti) {
		   if(v.getVoto()>=voto) {
			   result.add(v);
		   }
	   }
	   return result;
   }
	   
   public Voto CercaCorso(String nomeCorso) {
	   Voto voto= new Voto (0, nomeCorso, null);
	  int pos= this.voti.indexOf(voto) ; 
	  if (pos==-1)
	   return null;
	  else 
		  return this.voti.get(pos);
   }
	  public boolean VotoGiaPresente (Voto v) 
	  {
		  int pos= this.voti.indexOf(v);
		  if (pos==-1)
			  return false;
		  else
		  return ( v.getVoto() == this.voti.get(pos).getVoto());
		  
	  }
	  public boolean VotoConflitto (Voto v) 
	  {
		  int pos= this.voti.indexOf(v);
		  if (pos==-1)
			  return false;
		  else
		  return ( v.getVoto() == this.voti.get(pos).getVoto());
		  
   }
	  public String toString() {
		  return this.voti.toString();
	  }
	  public Libretto LibrettoMigliorato() {
		  Libretto nuovo= new Libretto();
		  for(Voto v: this.voti) {
			  nuovo.add(v.clone());
			  
		  }
		  for (Voto v: nuovo.voti) {
			  int punti = v.getVoto();
			  if (punti<24)
				  punti= punti +1;
			  else if (punti<=28)
				  punti = punti +1;
			  v.setVoto(punti);
		  }
		  return nuovo;
	  }
	  public void cancellaVotiScarsi() {
		  List cancellare = new ArrayList<Voto>();
		  for(Voto v: this.voti) {
			  if(v.getVoto()<24) {
				  cancellare.add(v);
			  }
		  }
		  this.voti.removeAll(cancellare);
	  }
}

