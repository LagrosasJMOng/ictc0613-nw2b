/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lagrosasact04b;
import java.util.Scanner;

/**
 *
 * @author rein
 */
public class LAGROSASACT04B {
    private static String slot[] ={"","",""};
     private static String emp = "Empty)  ";
    
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
           Menu(); 
        
    }
    
    public static void Menu(){
         System.out.print(" *Implementation of Array Operations using Java* \n");
          System.out.print("\n");
          if (slot[0].isEmpty()){System.out.print("(slot1 = "+ emp);  }else { System.out.print("(slot1 = "+ slot[0]+ ")  " );   }
                if (slot[1].isEmpty()){System.out.print("(slot2 = "+ emp);  }else { System.out.print("(slot2 = "+ slot[1]+ ")  "  );   }
                if (slot[2].isEmpty()){System.out.print("(slot3 = "+ emp);  }else { System.out.print("(slot3 = "+ slot[2]+ ")  " );   }
                System.out.print("\n\n");
          System.out.print("\n1.Insert a value");
             System.out.print("\n2.Delete a value");
             System.out.print("\n3.Transverse array");
             System.out.print("\n4.Exit\n\n\n\n\n\n\n\n");
     System.out.print(">> ");
         
        switch(sc.nextInt()){
            case 1: 
//inserting value
                int out = 0;
               do{System.out.println("\n\n\n\n\n\n\n\n\n\n");
                if (slot[0].isEmpty()){System.out.print("(slot1 = "+ emp);  }else { System.out.print("(slot1 = "+ slot[0]+ ")  " );   }
                if (slot[1].isEmpty()){System.out.print("(slot2 = "+ emp);  }else { System.out.print("(slot2 = "+ slot[1]+ ")  "  );   }
                if (slot[2].isEmpty()){System.out.print("(slot3 = "+ emp);  }else { System.out.print("(slot3 = "+ slot[2]+ ")  " );   }
                  System.out.println("\n\n\n\n\n\n\n");
                System.out.print("\n\n Enter Slot no:");
              
        
                int slotn = sc.nextInt();
                if (slotn > 3){System.err.print("Invalid Input!!!");
                System.out.print("\n\n Enter Slot no:");
                slotn = sc.nextInt();
                }
                if (slotn == 1){System.out.print("Enter text for slot1 >> ");
                slot[0] = sc.next();
                      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");}
                if (slotn == 2){System.out.print("Enter text for slot2 >> ");
                slot[1] = sc.next();      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");}
                if (slotn == 3){System.out.print("Enter text for slot3 >> ");
                slot[2] = sc.next();      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");}
                if (slot[0].isEmpty()){System.out.print("(slot1 = "+ emp);  }else { System.out.print("(slot1 = "+ slot[0] + ")  " );   }
                if (slot[1].isEmpty()){System.out.print("(slot2 = "+ emp);  }else { System.out.print("(slot2 = "+ slot[1]+ ")  "  );   }
                if (slot[2].isEmpty()){System.out.print("(slot3 = "+ emp);  }else { System.out.print("(slot3 = "+ slot[2] + ")  " );}
                    System.out.println("\n\nDo you want to Insert a Value again? Yes = 0   No = 1");
                    System.out.println("\n\n\n\n");
                    System.out.print(">>");
                    out = sc.nextInt();
                
               }while (out ==0);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                         Menu();
                break;

            case 2:
 //deleting value
  System.out.println("Which slot you want to delete? ");
                  if (slot[0].isEmpty()){System.out.print("(slot1 = "+ emp);  }else { System.out.print("(slot1 = "+ slot[0] + ")  " );   }
                if (slot[1].isEmpty()){System.out.print("(slot2 = "+ emp);  }else { System.out.print("(slot2 = "+ slot[1]+ ")  "  );   }
                if (slot[2].isEmpty()){System.out.print("(slot3 = "+ emp);  }else { System.out.print("(slot3 = "+ slot[2] + ")  " );}
                  System.out.println("\n\n\n");  
     System.out.print(">>");
 int slotdel = sc.nextInt();
  if (slotdel ==1){slot[0]="";}
  if (slotdel ==2){slot[1]="";}
  if (slotdel ==3){slot[2]="";}
  
                Menu();
                break;   
                
            case 3: 
 //Transversing array
                System.out.println("CONTENTS OF ARRAY: ");
                   for(int i=0; i<slot.length; i++) {
         System.out.print(slot[i] + ", ");}
                   if (slot[0].isEmpty()&&slot[1].isEmpty()&&slot[2].isEmpty()){
                   System.err.println("ARRAY IS EMPTY!!!!"); 
                   }
                 System.out.println("\n\n\n");
                 Menu();
                break;
                
            case 4: 
 //EXIT
                
                break;
                
            default:
                System.err.println("INVALID INPUT!!!");
                break;
        }
    }
}