import java.util.Optional;

public class OptionalOfNullableExample {

	public static void main(String[] args) {    
	      String[] str = new String[10];     
	      Optional<String> isNull = Optional.ofNullable(str[9]);    
	      System.out.println(isNull); //Optional.empty
	      System.out.println(isNull.isPresent());//false
	      if(isNull.isPresent()){     
	         //Getting the substring           
	         String str2 = str[9].substring(2, 5);          
	         //Displaying substring           
	         System.out.print("Substring is: "+ str2);       
	      }     
	      else{      
	         System.out.println("Cannot get the substring from an empty string");     
	      }          
	      isNull.ifPresent(s->System.out.println("Substring is: "+ str[9].substring(2, 5)));
	      
	      str[9] = "AgraIsCool";       
	      Optional<String> isNull2 = Optional.ofNullable(str[9]); 
	      System.out.println(isNull2); //Optional[AgraIsCool]
	      System.out.println(isNull2.isPresent());//true
	      if(isNull2.isPresent()){        
	         //Getting the substring            
	         String str2 = str[9].substring(2, 5);            
	         //Displaying substring           
	         System.out.println("Substring is: "+ str2);          
	      }         
	      else{         
	         System.out.println("Cannot get the substring from an empty string");         
	      }  
	      isNull2.ifPresent(s->System.out.println("Substring is: "+ str[9].substring(2, 5)));
	      
	   } 

}
