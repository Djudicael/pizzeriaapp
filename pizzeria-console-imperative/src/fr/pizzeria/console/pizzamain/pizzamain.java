package fr.pizzeria.console.pizzamain;
import java.util.Arrays;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class pizzamain {

	public static void main(String[] args) {
		// menu du programme
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");
		
		
		//menu complet
		/*int [] index  ={0,1,2,4,5,6,7};
		
		String [] code  = {"PEP","MAR", "REI", "FRO","CAN","SAV","ORI","IND"};
		
		String [] nom  = {"Pépéroni","Margherita","La Reine","La 4 fromages","La cannibale","La savoyarde","L\'orientale","L\'indienne"};
		
		double [] prix  = {12.50,14.00,11.50,12.00,12.50,13.00,13.50,14.00};*/
		
		//pizza a deux entrees
		
		Object[][] pizzas ={{"PEP","Pépéroni", 12.50}, {"MAR","Margherita", 14.00}, {"REI","La reine", 11.50},
							{"FRO","la 4 fromage", 12.00}, {"CAN","La cannibale", 12.50}, {"SAV","La savoyarde", 13.00}, 
							{"ORI","L\'orientale", 13.50} ,{"IND","L\'indienne", 14.00}};
		
		System.out.println("***** Select your instruction here*****");

		Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
	
	
		switch (choix) {
		
		case (1) : 
			System.out.println("votre selection");
			
		//liste de pîzza 
		for(int i = 0; i < pizzas.length; i++)
		{    
		 
		    System.out.println(pizzas[i][0] +" "+ pizzas[i][1] + " "+pizzas[i][2]); 
		    System.out.println("\n"); 
		 
		}
		break;
		case (2) : 
			System.out.println("Menu 2. Ajouter une nouvelle pizza");
			System.out.println("veuiller saisir le code");
			String newcode = sc.next();
			
			System.out.println("veuillez saisir le nom sans espace");
			String newnom= sc.next();
			
			
			System.out.println("veuillez saisir le prix");
			double newprix=sc.nextDouble();
			//creation de la copie d'un tableau dans un autre tableau
			
			Object[][] newTab= Arrays.copyOf(pizzas, pizzas.length+1);
			newTab[pizzas.length]= new Object[]{newcode,newnom,newprix};
			pizzas= newTab;
			
			System.out.println("votre nouvelle pizza a été ajouté");
			
		
		break;
		case (3) : 
			System.out.println("Menu 3. Mettre à jour une pizza");
			System.out.println("voici la liste de pizza");
			//liste de pîzza 
			for(int i = 0; i < pizzas.length; i++)
			{    
			    System.out.println(pizzas[i][0] +" "+ pizzas[i][1] + " "+pizzas[i][2]); 
			}
			System.out.println("\n");
			
			System.out.println("Veuillez choisir la pizza à modifier");
			System.out.println("(99 pour abandonner).");
			int choix2 = sc.nextInt();
			
			while(choix2==0){
				System.out.println("Veuillez choisir la pizza à modifier");
				System.out.println("(99 pour abandonner).");
				
			}
			if(choix2==99){
				System.out.println("sortie");
			}
			else if( choix2 >0 && choix2<pizzas.length){
				System.out.println("entrez le code");
				String code3 =sc.next();
				System.out.println("entrez le nom de la pizza");
				String nom3 =sc.next();
				System.out.println("entrez le prix");
				String prix3 =sc.next();
				pizzas[choix2-1] = new Object[]{code3 ,nom3,prix3};
				
			}
			System.out.println("voici votre modification");
			for(int i = 0; i < pizzas.length; i++)
			{    
			    System.out.println(pizzas[i][0] +" "+ pizzas[i][1] + " "+pizzas[i][2]); 
			}
		
		break;
		case (4) : 
			System.out.println("Menu 4. Supprimer une pizza");
			System.out.println("voici la liste de pizza");
			//liste de pîzza 
			for(int i = 0; i < pizzas.length; i++)
			{    
			    System.out.println(pizzas[i][0] +" "+ pizzas[i][1] + " "+pizzas[i][2]); 
			}
			System.out.println("\n");
			
			System.out.println("Veuillez choisir la pizza à modifier");
			System.out.println("(99 pour abandonner).");
			int choix4 = sc.nextInt();
			
			while(choix4==0){
				System.out.println("Veuillez choisir la pizza à modifier");
				System.out.println("(99 pour abandonner).");
				
			}
			if(choix4==99){
				System.out.println("sortie");
			}
			else if( choix4 >=1 && choix4<pizzas.length){
				//Object[][] newTab1 =System.arraycopy(pizzas, pizzas[choix4], dest, destPos, length);
				
				
			}
			System.out.println("voici votre modification");
			for(int i = 0; i < pizzas.length; i++)
			{    
			    System.out.println(pizzas[i][0] +" "+ pizzas[i][1] + " "+pizzas[i][2]); 
			}
		break;
		case (99) :
			
		break;
		default: System.out.println("mauvais choix d\'instruction");
		}

}
}
