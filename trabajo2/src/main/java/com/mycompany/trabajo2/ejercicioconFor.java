
package com.mycompany.trabajo2;

import java.util.Scanner;



public class ejercicioconFor {

    
    
    public static void main(String[] args) {
        
        String palabra1;
        String palabra2;
        String palabra3;
        String palabra4;
        String palabra5;
    
        
        Scanner lectura=new Scanner(System.in);
        
        System.out.println("Ingrese 5  palabras");
        System.out.println("Palabra numero 1: \n" );
        palabra1=lectura.next();
        System.out.println("Palabra numero 2: \n" );
        palabra2=lectura.next();
        System.out.println("Palabra numero 3: \n" );
        palabra3=lectura.next();
        System.out.println("Palabra numero 4: \n" );
        palabra4=lectura.next();
        System.out.println("Palabra numero 5: \n" );
        palabra5=lectura.next();
        
        
        
        boolean primerparlisto;
        int posicion1;
        boolean segundoparlisto;
        int posicion2;

        for(int i=0; i<palabra1.length();i++){
            
            for(int j=0; j<palabra2.length();j++){
                
                char letra1=palabra1.charAt(i);
                char letra2=palabra2.charAt(j);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra1+ " se puede cruzar con la palabra "+palabra2+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra1+" y la "+letra2+" de la palabra "+palabra2 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }
        
        System.out.println("-------------------------------------------- \n");    
        
            for(int i=0; i<palabra1.length();i++){
            
            for(int j=0; j<palabra3.length();j++){
                
                char letra1=palabra1.charAt(i);
                char letra3=palabra3.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra1+ " se puede cruzar con la palabra "+palabra3+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra1+" y la "+letra3+" de la palabra "+palabra3 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }

            for(int i=0; i<palabra1.length();i++){
            
            for(int j=0; j<palabra4.length();j++){
                
                char letra1=palabra1.charAt(i);
                char letra3=palabra4.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra1+ " se puede cruzar con la palabra "+palabra3+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra1+" y la "+letra3+" de la palabra "+palabra3 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }
            for(int i=0; i<palabra1.length();i++){
            
            for(int j=0; j<palabra5.length();j++){
                
                char letra1=palabra1.charAt(i);
                char letra3=palabra5.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra1+ " se puede cruzar con la palabra "+palabra3+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra1+" y la "+letra3+" de la palabra "+palabra3 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }
            
          for(int i=0; i<palabra2.length();i++){
            
            for(int j=0; j<palabra1.length();j++){
                
                char letra1=palabra2.charAt(i);
                char letra3=palabra1.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra2+ " se puede cruzar con la palabra "+palabra3+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra2+" y la "+letra3+" de la palabra "+palabra3 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }
          
           
          for(int i=0; i<palabra2.length();i++){
            
            for(int j=0; j<palabra3.length();j++){
                
                char letra1=palabra2.charAt(i);
                char letra3=palabra3.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra2+ " se puede cruzar con la palabra "+palabra3+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra2+" y la "+letra3+" de la palabra "+palabra3 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }
         
          for(int i=0; i<palabra2.length();i++){
            
            for(int j=0; j<palabra4.length();j++){
                
                char letra1=palabra2.charAt(i);
                char letra3=palabra4.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra2+ " se puede cruzar con la palabra "+palabra4+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra2+" y la "+letra3+" de la palabra "+palabra4 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }
          for(int i=0; i<palabra2.length();i++){
            
            for(int j=0; j<palabra5.length();j++){
                
                char letra1=palabra2.charAt(i);
                char letra3=palabra5.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra2+ " se puede cruzar con la palabra "+palabra5+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra2+" y la "+letra3+" de la palabra "+palabra5 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }  
          for(int i=0; i<palabra3.length();i++){
            
            for(int j=0; j<palabra1.length();j++){
                
                char letra1=palabra3.charAt(i);
                char letra3=palabra1.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra3+ " se puede cruzar con la palabra "+palabra1+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra3+" y la "+letra3+" de la palabra "+palabra1 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }
          for(int i=0; i<palabra3.length();i++){
            
            for(int j=0; j<palabra2.length();j++){
                
                char letra1=palabra3.charAt(i);
                char letra3=palabra2.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra3+ " se puede cruzar con la palabra "+palabra2+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra3+" y la "+letra3+" de la palabra "+palabra2 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        } 
        for(int i=0; i<palabra3.length();i++){
            
            for(int j=0; j<palabra4.length();j++){
                
                char letra1=palabra3.charAt(i);
                char letra3=palabra4.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra3+ " se puede cruzar con la palabra "+palabra4+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra3+" y la "+letra3+" de la palabra "+palabra4 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }  
          for(int i=0; i<palabra3.length();i++){
            
            for(int j=0; j<palabra5.length();j++){
                
                char letra1=palabra3.charAt(i);
                char letra3=palabra5.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra3+ " se puede cruzar con la palabra "+palabra5+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra3+" y la "+letra3+" de la palabra "+palabra5 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }
          for(int i=0; i<palabra4.length();i++){
            
            for(int j=0; j<palabra1.length();j++){
                
                char letra1=palabra4.charAt(i);
                char letra3=palabra1.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra4+ " se puede cruzar con la palabra "+palabra1+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra4+" y la "+letra3+" de la palabra "+palabra1 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }
         for(int i=0; i<palabra4.length();i++){
            
            for(int j=0; j<palabra2.length();j++){
                
                char letra1=palabra4.charAt(i);
                char letra3=palabra2.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra4+ " se puede cruzar con la palabra "+palabra2+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra4+" y la "+letra3+" de la palabra "+palabra2 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }
         for(int i=0; i<palabra4.length();i++){
            
            for(int j=0; j<palabra3.length();j++){
                
                char letra1=palabra4.charAt(i);
                char letra3=palabra3.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra4+ " se puede cruzar con la palabra "+palabra3+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra4+" y la "+letra3+" de la palabra "+palabra3 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        } 
          for(int i=0; i<palabra4.length();i++){
            
            for(int j=0; j<palabra5.length();j++){
                
                char letra1=palabra4.charAt(i);
                char letra3=palabra5.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra4+ " se puede cruzar con la palabra "+palabra5+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra4+" y la "+letra3+" de la palabra "+palabra5 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }
          
          for(int i=0; i<palabra5.length();i++){
            
            for(int j=0; j<palabra1.length();j++){
                
                char letra1=palabra5.charAt(i);
                char letra3=palabra1.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra5+ " se puede cruzar con la palabra "+palabra1+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra5+" y la "+letra3+" de la palabra "+palabra1 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }
          
        for(int i=0; i<palabra5.length();i++){
            
            for(int j=0; j<palabra2.length();j++){
                
                char letra1=palabra5.charAt(i);
                char letra3=palabra2.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra5+ " se puede cruzar con la palabra "+palabra2+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra5+" y la "+letra3+" de la palabra "+palabra2 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }  
        for(int i=0; i<palabra5.length();i++){
            
            for(int j=0; j<palabra3.length();j++){
                
                char letra1=palabra5.charAt(i);
                char letra3=palabra3.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra5+ " se puede cruzar con la palabra "+palabra3+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra5+" y la "+letra3+" de la palabra "+palabra3 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }   
        for(int i=0; i<palabra5.length();i++){
            
            for(int j=0; j<palabra4.length();j++){
                
                char letra1=palabra5.charAt(i);
                char letra3=palabra4.charAt(j);
                if(letra1 == letra3){
                    
                System.out.println("La palabra " +palabra5+ " se puede cruzar con la palabra "+palabra4+" en la letra " +letra1+"(pisicion"+(i+1)   +")"  +" de "+palabra5+" y la "+letra3+" de la palabra "+palabra4 +"(pisicion"+(j+1)  );

                primerparlisto=true;
                break;
                }
            }  
        }  
        
        
        
        
    }
}
