
    package carros;


    import java.awt.Font;
    import javax.swing.ImageIcon;
    import javax.swing.JOptionPane;
    import javax.swing.UIManager;
    import javax.swing.plaf.ColorUIResource;

    public class Tester {
    
    public static void main(String[] args) {
        
    try{  
    int Option,Exit;
        
    Array main=null;
    
    do { 
        
    UIManager.put("OptionPane.messageFont", new Font("Montserrat", Font.BOLD, 14));
    UIManager.put("OptionPane.buttonFont", new Font("Montserrat", Font.PLAIN, 12));  
    
    UIManager UI=new UIManager();
    UI.put("OptionPane.background",new ColorUIResource(225,225,225));
    UI.put("Panel.background",new ColorUIResource(225,225,225));
    ImageIcon Dealer = new ImageIcon(Array.class.getResource("Dealer.jpg"));
           
        JOptionPane.showMessageDialog(null,"","DEALER MESSAGE",JOptionPane.INFORMATION_MESSAGE,Dealer);
       
     
    Option=Integer.parseInt(JOptionPane.showInputDialog(
        
    "     ----------------Main Menu----------------\n"+"\n"+
                    
    "1. Create and Register Data  \n"+"\n"+
                    
    "2. Show Sorted Information ins asc order  \n"+"\n"+
                    
    "3. Search a car information by License Plate.  \n"+"\n"+
                    
    "4. Search a car information by brand.  \n"+"\n"+
                    
    "5. Generate a list of subjects according to "+"\n"
    +  "the price of vehicles from low to high.\n" +"\n"+
                    
    "6. Generate a list with the cars information "+"\n"
    +  "sorted alphabetically in ascending order\n"+"\n"+
                    
    "7. Generate a list with the cars information "+"\n"
    + "sorted by brand in descending order \n   " + " \n" +       
                    
    "8. Exit.\n"+"\n"+
            
    " Please enter an option : "));
            
                
    switch(Option){
    case 1:
                    
    try{
        
    main=new Array();
                        
    }catch(NegativeArraySizeException a){
                       
    JOptionPane.showMessageDialog(null, "DO NOT INSERT NEGATIVE NUMBERS "
                                 + "FOR THE ARRAY LENGHT");
                   
    }catch(NumberFormatException b){
                        
    JOptionPane.showMessageDialog(null, " DO NOT INSERT LETTERS,SIGNS \n"
                                  + " OR AN EXAGGERATED AMOUNT OF  \n"
                                  + " NUMBERS IN THE ARRAY PLEASE ");
    }catch(NullPointerException d){
                        
    d.printStackTrace();
                        
    JOptionPane.showMessageDialog(null, "Please insert a Brand ");
    }
                   
    break;
    
    case 2:
    if(main==null)
    JOptionPane.showMessageDialog(null, "Vector without data!");
    else{
    main.setOrdenateBubble();
    main.getShowInformation();
    }
    break;
    case 3:
                    
    if(main==null)
    JOptionPane.showMessageDialog(null, "Vector without data!");
    else{
    try{
    main.getShowBinarySearch();
    } catch(NumberFormatException b){
    JOptionPane.showMessageDialog(null, "DO NOT INSERT LETERS, SIGNS\n"
                                       + "OR EXAGGERATE AMOUNT OF NUMBERS \n"
                                       +" IN THE LICENSE PLATE PLEASE");
    }
    }
    break;
    case 4:
    if(main==null)
    JOptionPane.showMessageDialog(null, "Vector without data!");
    else{
    try{
    main.SencuencialBrand();
    }catch(ArrayIndexOutOfBoundsException c){
    JOptionPane.showMessageDialog(null,"YOU JUST CAN REGISTER UNTIL \n"
    + "TWELVE BRANDS BY CAR PLEASE REMEMBER THIS");
    }
    }
    break;
    case 5:
    if(main == null)
    JOptionPane.showMessageDialog(null, 
    "You must first create a vector and register data!");
    else{
    main.quickSort(0, main.Vector.length-1);
    main.getShowInformation();
    JOptionPane.showMessageDialog(null, "Vector sorted in descendant order!");
    }
                        
    break;
    case 6:
    if(main == null)
    JOptionPane.showMessageDialog(null, 
    "You must first create a vector and register data");
    else{
    main.setSortSelection();
    main.getShowInformation();
    JOptionPane.showMessageDialog(null, "Vector sorted in asc orden");
    }
    break;
                    
    case 7:
    if(main == null)
    JOptionPane.showMessageDialog(null, 
    "You must first create a vector and register data");
    else{
    main.shellSort();
    main.getShowInformation();
    JOptionPane.showMessageDialog(null, "Vector sorted in desc order");
                        }
    break;
                        
    case 8:
    Exit=JOptionPane.showConfirmDialog(null, "¿Do you want to exit from the Menu?");
    if (Exit==0) {
        ImageIcon Closing = new ImageIcon(Array.class.getResource("Closing.jpg"));
           
     JOptionPane.showMessageDialog(null,"","CLOSING...",JOptionPane.INFORMATION_MESSAGE,Closing);
     
    break;
                    }
    default:
                 
    JOptionPane.showMessageDialog(null, "Non valid option ");
                     
    break;
            
    }
                     
   
    }while (Option != 8);
    
    
    System.exit(0);
          
     
    } catch(NumberFormatException a){
        
    JOptionPane.showMessageDialog(null, "BE LOGIC PLEASE");
                      
                      
      }
     }
    }



    
        

    
