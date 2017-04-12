
package example;

import java.io.FileReader;
import com.opencsv.*;
import java.io.IOException;
import java.util.*;
import org.apache.commons.lang.WordUtils;

public class Hello {
    public static void main(String[] args) {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
		  	try{
				  	CSVReader reader = new CSVReader(new FileReader("data.csv"));
				  	List<String[]> myEntries = reader.readAll();
				  	int monmax = 0;
				  	int myval=0;
				  	for(String tab[]: myEntries){
				  		for(String val: tab){
				  			myval=Integer.parseInt(val);
				  			System.out.println(myval);
							if(myval>monmax) monmax=myval;
				  		}
				  	}
				  	System.out.println("MON MAX : "+monmax);
				  }catch(IOException e){System.out.println("Fichier non trouvé");}
    }
}
        
