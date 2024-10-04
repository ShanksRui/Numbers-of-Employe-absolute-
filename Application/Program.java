package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import Entities.Employe;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "C:\\Users\\jessy\\OneDrive\\Documentos\\java.txt";
		 
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
		 Set<Employe> set = new HashSet<>();
		 String next;
		 while((next = br.readLine()) != null) {
			 if(!next.isEmpty()) {
			 String[] list = next.split(",");
			 String name = list[0];
			 Double money = Double.parseDouble(list[1]);
			 set.add(new Employe(name, money));
			 }else if(next.isEmpty()) {
				 System.out.println("list is empty");
			 }
		 }
		 System.out.println("Quantity Employes:"+set.size());	    
	   }catch(IOException e) { 
		System.out.println("Error"+ e.getMessage());
	   }
  }
}
