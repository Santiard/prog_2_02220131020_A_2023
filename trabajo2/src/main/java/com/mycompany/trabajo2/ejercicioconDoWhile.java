
package com.mycompany.trabajo2;

import java.util.Scanner;



public class ejercicioconDoWhile {

    
    
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
        int indice;
        indice=0;
        int indice2;
        indice2=0;
        do{
            
            do{
                
                char letra1=palabra1.charAt(indice);
                char letra2=palabra2.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra1+ " se puede cruzar con la palabra "+palabra2+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra1+" y la "+letra2+" de la palabra "+palabra2 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra2.length());
            indice++;
        }while( indice<palabra1.length());
        
        System.out.println("-------------------------------------------- \n");    
        
            do{
            
            do{
                
                char letra1=palabra1.charAt(indice);
                char letra2=palabra3.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra1+ " se puede cruzar con la palabra "+palabra3+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra1+" y la "+letra2+" de la palabra "+palabra3 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra3.length());
            indice++;
        }while( indice<palabra1.length());
        
        System.out.println("-------------------------------------------- \n"); 
        


            do{
            
            do{
                
                char letra1=palabra1.charAt(indice);
                char letra2=palabra4.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra1+ " se puede cruzar con la palabra "+palabra4+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra1+" y la "+letra2+" de la palabra "+palabra4 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra4.length());
            indice++;
        }while( indice<palabra1.length());
        
        System.out.println("-------------------------------------------- \n"); 
            do{
            
            do{
                
                char letra1=palabra1.charAt(indice);
                char letra2=palabra5.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra1+ " se puede cruzar con la palabra "+palabra5+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra1+" y la "+letra2+" de la palabra "+palabra5 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra5.length());
            indice++;
        }while( indice<palabra1.length());
        
        System.out.println("-------------------------------------------- \n"); 
            
          do{
            
            do{
                
                char letra1=palabra1.charAt(indice);
                char letra2=palabra5.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra1+ " se puede cruzar con la palabra "+palabra5+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra1+" y la "+letra2+" de la palabra "+palabra5 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra5.length());
            indice++;
        }while( indice<palabra1.length());
        
        System.out.println("-------------------------------------------- \n"); 
          do{
            
            do{
                
                char letra1=palabra2.charAt(indice);
                char letra2=palabra1.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra2+ " se puede cruzar con la palabra "+palabra1+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra2+" y la "+letra2+" de la palabra "+palabra1 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra1.length());
            indice++;
        }while( indice<palabra2.length());
        
        System.out.println("-------------------------------------------- \n"); 
           
          do{
            
            do{
                
                char letra1=palabra2.charAt(indice);
                char letra2=palabra3.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra2+ " se puede cruzar con la palabra "+palabra3+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra2+" y la "+letra2+" de la palabra "+palabra3 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra3.length());
            indice++;
        }while( indice<palabra2.length());
        
        System.out.println("-------------------------------------------- \n"); 
         
          do{
            
            do{
                
                char letra1=palabra2.charAt(indice);
                char letra2=palabra4.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra2+ " se puede cruzar con la palabra "+palabra4+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra2+" y la "+letra2+" de la palabra "+palabra4 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra1.length());
            indice++;
        }while( indice<palabra2.length());
        
        System.out.println("-------------------------------------------- \n"); 
          do{
            
            do{
                
                char letra1=palabra2.charAt(indice);
                char letra2=palabra5.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra2+ " se puede cruzar con la palabra "+palabra5+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra2+" y la "+letra2+" de la palabra "+palabra5 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra5.length());
            indice++;
        }while( indice<palabra2.length());
        
        System.out.println("-------------------------------------------- \n"); 
          do{
            
            do{
                
                char letra1=palabra3.charAt(indice);
                char letra2=palabra1.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra3+ " se puede cruzar con la palabra "+palabra1+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra3+" y la "+letra2+" de la palabra "+palabra1 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra1.length());
            indice++;
        }while( indice<palabra3.length());
        
        System.out.println("-------------------------------------------- \n"); 
          do{
            
            do{
                
                char letra1=palabra3.charAt(indice);
                char letra2=palabra2.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra3+ " se puede cruzar con la palabra "+palabra2+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra3+" y la "+letra2+" de la palabra "+palabra2 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra2.length());
            indice++;
        }while( indice<palabra3.length());
        
        System.out.println("-------------------------------------------- \n");
        do{
            
            do{
                
                char letra1=palabra3.charAt(indice);
                char letra2=palabra4.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra3+ " se puede cruzar con la palabra "+palabra4+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra3+" y la "+letra2+" de la palabra "+palabra4 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra4.length());
            indice++;
        }while( indice<palabra3.length());
        
        System.out.println("-------------------------------------------- \n");
          do{
            
            do{
                
                char letra1=palabra3.charAt(indice);
                char letra2=palabra5.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra3+ " se puede cruzar con la palabra "+palabra5+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra3+" y la "+letra2+" de la palabra "+palabra5 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra5.length());
            indice++;
        }while( indice<palabra3.length());
        
        System.out.println("-------------------------------------------- \n");
          do{
            
            do{
                
                char letra1=palabra4.charAt(indice);
                char letra2=palabra1.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra4+ " se puede cruzar con la palabra "+palabra1+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra4+" y la "+letra2+" de la palabra "+palabra1 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra1.length());
            indice++;
        }while( indice<palabra4.length());
        
        System.out.println("-------------------------------------------- \n");
         do{
            
            do{
                
                char letra1=palabra4.charAt(indice);
                char letra2=palabra2.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra4+ " se puede cruzar con la palabra "+palabra2+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra4+" y la "+letra2+" de la palabra "+palabra2 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra2.length());
            indice++;
        }while( indice<palabra4.length());
        
        System.out.println("-------------------------------------------- \n");
         do{
            
            do{
                
                char letra1=palabra4.charAt(indice);
                char letra2=palabra3.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra4+ " se puede cruzar con la palabra "+palabra3+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra4+" y la "+letra2+" de la palabra "+palabra3 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra3.length());
            indice++;
        }while( indice<palabra4.length());
        
        System.out.println("-------------------------------------------- \n");
          do{
            
            do{
                
                char letra1=palabra4.charAt(indice);
                char letra2=palabra5.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra4+ " se puede cruzar con la palabra "+palabra5+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra4+" y la "+letra2+" de la palabra "+palabra5 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra5.length());
            indice++;
        }while( indice<palabra4.length());
        
        System.out.println("-------------------------------------------- \n");
          
          do{
            
            do{
                
                char letra1=palabra5.charAt(indice);
                char letra2=palabra1.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra5+ " se puede cruzar con la palabra "+palabra1+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra5+" y la "+letra2+" de la palabra "+palabra1 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra1.length());
            indice++;
        }while( indice<palabra5.length());
        
        System.out.println("-------------------------------------------- \n");
          
        do{
            
            do{
                
                char letra1=palabra5.charAt(indice);
                char letra2=palabra2.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra5+ " se puede cruzar con la palabra "+palabra2+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra5+" y la "+letra2+" de la palabra "+palabra2 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra2.length());
            indice++;
        }while( indice<palabra5.length());
        
        System.out.println("-------------------------------------------- \n");
        do{
            
            do{
                
                char letra1=palabra5.charAt(indice);
                char letra2=palabra3.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra5+ " se puede cruzar con la palabra "+palabra3+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra5+" y la "+letra2+" de la palabra "+palabra3 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra3.length());
            indice++;
        }while( indice<palabra5.length());
        
        System.out.println("-------------------------------------------- \n");
        do{
            
            do{
                
                char letra1=palabra5.charAt(indice);
                char letra2=palabra4.charAt(indice2);
                if(letra1 == letra2){
                    
                System.out.println("La palabra " +palabra5+ " se puede cruzar con la palabra "+palabra4+" en la letra " +letra1+"(pisicion"+(indice+1)   +")"  +" de "+palabra5+" y la "+letra2+" de la palabra "+palabra4 +"(pisicion"+(indice2+1)  );

                primerparlisto=true;
                break;
                }
                indice2++;
            } while(indice2<palabra4.length());
            indice++;
        }while( indice<palabra5.length());
        
        System.out.println("-------------------------------------------- \n");
        
        
        
        
    }
}
