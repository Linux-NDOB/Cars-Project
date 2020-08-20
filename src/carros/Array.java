
        package carros;

        
        import javax.swing.JOptionPane;
        import javax.swing.ImageIcon;

        public class Array {

        public Pojo Vector[];
    
        public int getSearchLicensePlate(int matricula){
        int i;
        for(i=0; i<Vector.length; i++){
            if(Vector[i].getMatricula() == matricula)
                return i;
        }
        return -1;
        }
        
        
        
        Array(){
            
        
        final ImageIcon icon = new ImageIcon(Array.class.getResource("Box.png"));
        
        
        Object a = JOptionPane.showInputDialog(
        null, "Please insert\n"+
        "the Vector Length", "Consesionary",
        JOptionPane.INFORMATION_MESSAGE, icon,null,"");
        
        int x=Integer.parseInt((String) a); 
       
        Vector = new Pojo[x];
  
        int i;
        for(i=0; i<Vector.length; i++)
            Vector[i] = new Pojo( -1, " ", -1, -1, false );
        
        
        Object TipMarca[] = {"Audi","Bugatti","Cadillac","Dodge",
                            "Ferrary","Honda","Toyota"};
        
        Object TipEstado[] = {"Sold","Available for sale"};
        int matricula, modelo,pos;
        float precio;
        String marca;
        boolean Estado = false;
        
        for(i=0; i<Vector.length; i++){
        do{ 
            
        matricula=Integer.parseInt(JOptionPane.showInputDialog(
        "Enter the license\n"+
        "plate in the position  "+i+": "));
        pos=getSearchLicensePlate(matricula);
               
        if(pos>=0)
        JOptionPane.showMessageDialog(null, 
        "License Plate in use, try again!");      
        } 
        while(pos>=0);
            
        Object opcionMarca = JOptionPane.showInputDialog(null,"¿Which is the Brand? \n"
        +"Here are 7 brands availabe","Cars list ",
        JOptionPane.QUESTION_MESSAGE,null,TipMarca, TipMarca[0]);
        marca = opcionMarca.toString();
             
        modelo = Integer.parseInt(JOptionPane.showInputDialog(
                    "Enter the car\n"
                    +" Model please: "));
      
        precio = Float.parseFloat(JOptionPane.showInputDialog(
                    "Enter the car\n"
                   +"price please"));
               
        Object opcionEstado  = JOptionPane.showInputDialog(
        null,"State [Sold / Available for Sale]: ",
        "Car disponibility",
        JOptionPane.QUESTION_MESSAGE,null,TipEstado, TipEstado[0]);
        
        if(opcionEstado.toString().equals("Sold")){
        Estado=true;
        }
        else if(opcionEstado.toString().equals("Available for Sale")){
        Estado=false;
        
       
        }    
        Vector[i].setMatricula(matricula);
        
        Vector[i].setMarca(marca);
             
        Vector[i].setModelo(modelo);
            
        Vector[i].setPrecio(precio);
           
        Vector[i].setEstado(Estado);
           }    
        }
    
        public void getShowInformation(){
        int i;
        for(i=0; i<Vector.length; i++)
            Vector[i].getInfo();
        }
     
        public void setOrdenateBubble(){
        int i, j;
        Pojo Tem=null;
        
        for(i=0; i<Vector.length; i++){    
        for(j=0; j<(Vector.length - 1); j++){
        if( Vector[j].getMatricula() > Vector[j+1].getMatricula() ){
                    
        Tem = new Pojo( Vector[j].getMatricula(), 
        Vector[j].getMarca(), Vector[j].getModelo(),
        Vector[j].getPrecio(), Vector[j].isEstado());
                  
        Vector[j].setMatricula(Vector[j+1].getMatricula());
        Vector[j].setMarca(Vector[j+1].getMarca());
        Vector[j].setModelo(Vector[j+1].getModelo());
        Vector[j].setPrecio(Vector[j+1].getPrecio());
        Vector[j].setEstado(Vector[j+1].isEstado());
                    
        Vector[j+1].setMatricula(Tem.getMatricula());
        Vector[j+1].setMarca(Tem.getMarca());
        Vector[j+1].setModelo(Tem.getModelo());
        Vector[j+1].setPrecio(Tem.getModelo());
        Vector[j+1].setEstado(Tem.isEstado());
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Vector sorted in Asc order!");
        }
      
      
      
      
        public void SencuencialBrand() {
        
        JOptionPane.showMessageDialog(null, "Now you will can search a car by Brand.");
        //HTML//JOptionPane.showMessageDialog(null, 
        //"<html><font face='Montserrat' size='12' color='Blue'>Now you will can search a car by Brand");
        //CSS//JOptionPane.showMessageDialog(this, 
        //"<html><h1 style='font-family: Calibri; font-size: 36pt;'>Hello");
        String Brand;
        Object TypBrand[] = {"Audi","Bugatti","Cadillac","Dodge","Ferrary",
                              "Honda","Toyota"};
       
        Object optionBrand = JOptionPane.showInputDialog(null," ¿Which is the car Brand? \n"
                                                         +"Here are 17 brands availabe",
                                                          "Cars list ",
        JOptionPane.QUESTION_MESSAGE,null,TypBrand, TypBrand[0]);
        Brand = optionBrand.toString();
            
        if(optionBrand.equals("Audi")){
        ImageIcon Audi = new ImageIcon(Array.class.getResource("Audi.jpg"));
           
        JOptionPane.showMessageDialog(
        null,"","CAR IMAGE",JOptionPane.INFORMATION_MESSAGE,Audi);
        
        }
        else if(optionBrand.toString().equals("Bugatti")){
              
        ImageIcon Bugatti = new ImageIcon(Array.class.getResource("Bugatti.jpg"));
           
        JOptionPane.showMessageDialog(
        null,"","CAR IMAGE",JOptionPane.INFORMATION_MESSAGE,Bugatti);
            
        }
        else if(optionBrand.toString().equals("Cadillac")){
              
        ImageIcon Cadillac = new ImageIcon(Array.class.getResource("Cadillac.jpg"));
           
        JOptionPane.showMessageDialog(
        null,"","CAR IMAGE",JOptionPane.INFORMATION_MESSAGE,Cadillac);
            
        }else if(optionBrand.toString().equals("Dodge")){
              
        ImageIcon Dodge = new ImageIcon(Array.class.getResource("Dodge.jpg"));
           
        JOptionPane.showMessageDialog(
        null,"","CAR IMAGE",JOptionPane.INFORMATION_MESSAGE,Dodge);
            
        }else if(optionBrand.toString().equals("Ferrary")){
              
        ImageIcon Ferrary = new ImageIcon(Array.class.getResource("Ferrary.jpg"));
           
        JOptionPane.showMessageDialog(
        null,"","CAR IMAGE",JOptionPane.INFORMATION_MESSAGE,Ferrary);
            
        }else if(optionBrand.toString().equals("Honda")){
              
        ImageIcon Honda = new ImageIcon(Array.class.getResource("Honda.png"));
           
        JOptionPane.showMessageDialog(
        null,"","CAR IMAGE",JOptionPane.INFORMATION_MESSAGE,Honda);
            
        }else if(optionBrand.toString().equals("Toyota")){
              
        ImageIcon Toyota = new ImageIcon(Array.class.getResource("Toyota.jpg"));
           
        JOptionPane.showMessageDialog(
        null,"","CAR IMAGE",JOptionPane.INFORMATION_MESSAGE,Toyota);
            
        }
        
        for (int i = 0; i < Vector.length; i++) {
        if(Vector[i].getMarca().equals(Brand)){
                                              
                                               JOptionPane.showMessageDialog(null, (i + 1) + " Car Selected "+ Brand 
                                               + "\nLicense PLate: " + Vector[i].getMatricula()
                                               + "\nBrand: " + Vector[i].getMarca()
                                               + "\nModel: " + Vector[i].getModelo()
                                               + "\nPrice: " + Vector[i].getPrecio()
                                               + "\nEstate:" + Vector[i].isEstado() );
                                                                                        }  
        
        
        if(Vector[i+1].getMarca().equals(Brand)) {
                                                 JOptionPane.showMessageDialog(null, (i +2) +" Car Selected: "+ Brand
                                                 + "\nLicense PLate: " + Vector[i+1].getMatricula()
                                                 + "\nBrand: " + Vector[i+1].getMarca()
                                                 + "\nModel: " + Vector[i+1].getModelo()
                                                 + "\nPrice: " + Vector[i+1].getPrecio()
                                                 + "\nEstate:" + Vector[i+1].isEstado());
                
                
        if(Vector[i+2].getMarca().equals(Brand)) {
                                                 JOptionPane.showMessageDialog(null, (i +3) +" Car Selected: "+ Brand
                                                 + "\nLicense PLate: " + Vector[i+2].getMatricula()
                                                 + "\nBrand: " + Vector[i+2].getMarca()
                                                 + "\nModel: " + Vector[i+2].getModelo()
                                                 + "\nPrice: " + Vector[i+2].getPrecio()
                                                 + "\nEstate:" + Vector[i+2].isEstado());
                
                
        if(Vector[i+3].getMarca().equals(Brand)) {
                                                 JOptionPane.showMessageDialog(null, (i +4) +" Car Selected: "+ Brand
                                                 + "\nLicense PLate: " + Vector[i+3].getMatricula()
                                                 + "\nBrand: " + Vector[i+3].getMarca()
                                                 + "\nModel: " + Vector[i+3].getModelo()
                                                 + "\nPrice: " + Vector[i+3].getPrecio()
                                                 + "\nEstate:" + Vector[i+3].isEstado());
                                                 
                                                 
        if(Vector[i+4].getMarca().equals(Brand)) {
                                                 JOptionPane.showMessageDialog(null, (i +5) +" Car Selected: "+ Brand
                                                 + "\nLicense PLate: " + Vector[i+4].getMatricula()
                                                 + "\nBrand: " + Vector[i+4].getMarca()
                                                 + "\nModel: " + Vector[i+4].getModelo()
                                                 + "\nPrice: " + Vector[i+4].getPrecio()
                                                 + "\nEstate:" + Vector[i+4].isEstado());
                                                 
                                                 
        if(Vector[i+5].getMarca().equals(Brand)) {
                                                 JOptionPane.showMessageDialog(null, (i +6) +" Car Selected: "+ Brand
                                                 + "\nLicense PLate: " + Vector[i+5].getMatricula()
                                                 + "\nBrand: " + Vector[i+5].getMarca()
                                                 + "\nModel: " + Vector[i+5].getModelo()
                                                 + "\nPrice: " + Vector[i+5].getPrecio()
                                                 + "\nEstate:" + Vector[i+5].isEstado());
                                                 
                                                 
        if(Vector[i+6].getMarca().equals(Brand)) {
                                                 JOptionPane.showMessageDialog(null, (i +7) +" Car Selected: "+ Brand
                                                 + "\nLicense PLate: " + Vector[i+6].getMatricula()
                                                 + "\nBrand: " + Vector[i+6].getMarca()
                                                 + "\nModel: " + Vector[i+6].getModelo()
                                                 + "\nPrice: " + Vector[i+6].getPrecio()
                                                 + "\nEstate:" + Vector[i+6].isEstado());
                                                 
                                                 
        if(Vector[i+7].getMarca().equals(Brand)) {
                                                 JOptionPane.showMessageDialog(null, (i +8) +" Car Selected: "+ Brand
                                                 + "\nLicense PLate: " + Vector[i+7].getMatricula()
                                                 + "\nBrand: " + Vector[i+7].getMarca()
                                                 + "\nModel: " + Vector[i+7].getModelo()
                                                 + "\nPrice: " + Vector[i+7].getPrecio()
                                                 + "\nEstate:" + Vector[i+7].isEstado());
                                                 
                                                 
        if(Vector[i+8].getMarca().equals(Brand)) {
                                                 JOptionPane.showMessageDialog(null, (i +9) +" Car Selected: "+ Brand
                                                 + "\nLicense PLate: " + Vector[i+8].getMatricula()
                                                 + "\nBrand: " + Vector[i+8].getMarca()
                                                 + "\nModel: " + Vector[i+8].getModelo()
                                                 + "\nPrice: " + Vector[i+8].getPrecio()
                                                 + "\nEstate:" + Vector[i+8].isEstado());
                                                 
                                                 
        if(Vector[i+9].getMarca().equals(Brand)) {
                                                 JOptionPane.showMessageDialog(null, (i +10) +" Car Selected: "+ Brand
                                                 + "\nLicense PLate: " + Vector[i+9].getMatricula()
                                                 + "\nBrand: " + Vector[i+9].getMarca()
                                                 + "\nModel: " + Vector[i+9].getModelo()
                                                 + "\nPrice: " + Vector[i+9].getPrecio()
                                                 + "\nEstate:" + Vector[i+9].isEstado());
        if(Vector[i+10].getMarca().equals(Brand)) {
                                                 JOptionPane.showMessageDialog(null, (i +11) +" Car Selected: "+ Brand
                                                 + "\nLicense PLate: " + Vector[i+10].getMatricula()
                                                 + "\nBrand: " + Vector[i+10].getMarca()
                                                 + "\nModel: " + Vector[i+10].getModelo()
                                                 + "\nPrice: " + Vector[i+10].getPrecio()
                                                 + "\nEstate:" + Vector[i+10].isEstado());
        if(Vector[i+11].getMarca().equals(Brand)) {
                                                 JOptionPane.showMessageDialog(null, (i +12) +" Car Selected: "+ Brand
                                                 + "\nLicense PLate: " + Vector[i+11].getMatricula()
                                                 + "\nBrand: " + Vector[i+11].getMarca()
                                                 + "\nModel: " + Vector[i+11].getModelo()
                                                 + "\nPrice: " + Vector[i+11].getPrecio()
                                                 + "\nEstate:" + Vector[i+11].isEstado());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Sorry Brand not found\n"
                + "i not registered");
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        public int getBinarySearch(int LicensePlate){
        
        int n = Vector.length;
        int Center,inf=0,sup=n-1;
        while(inf<=sup){
        Center =(sup+inf)/2;
        if(Vector[Center].getMatricula() == LicensePlate )
                return Center;
        else if(LicensePlate < Vector[Center].getMatricula())
            {
                sup=Center-1;
            }
        else {
                inf=Center+1;
             }
                       }
        return -1;
        }
    
        public void getShowBinarySearch(){
        int LicensePlate = Integer.parseInt(JOptionPane.showInputDialog(
                null,"PLease enter the License PLate to search"));
        int pos=getBinarySearch(LicensePlate);
        if(pos==-1)
            JOptionPane.showMessageDialog(null, 
            "There is not a car registered with this License PLate!");
        else{
            Vector[pos].getInfo();
            }
                                         }
    
        public void quickSort(int Begin, int End) {
        if(Begin>=End) return ;
        float pivote = Vector[Begin].getPrecio();
        int izq = Begin+1;
        int der = End;
        Pojo Tem=null;
        while(izq<=der) {   
        while(izq<=End && Vector[izq].getPrecio()> pivote) izq++;
        while(der>Begin && Vector[der].getPrecio()<=pivote) der--;
            
        if(izq<der)
        {
        Tem = new Pojo( Vector[izq].getMatricula(), 
        Vector[izq].getMarca(), Vector[izq].getModelo(),
        Vector[izq].getPrecio(), Vector[izq].isEstado() );
                
        Vector[izq].setMatricula(Vector[der].getMatricula());
        Vector[izq].setMarca(Vector[der].getMarca());
        Vector[izq].setModelo(Vector[der].getModelo());
        Vector[izq].setPrecio(Vector[der].getPrecio());
        Vector[izq].setEstado(Vector[der].isEstado());
         
        Vector[der].setMatricula(Tem.getMatricula());
        Vector[der].setMarca(Tem.getMarca());
        Vector[der].setModelo(Tem.getModelo());
        Vector[der].setPrecio(Tem.getPrecio());
        Vector[der].setEstado(Tem.isEstado());
           }
        }
        
        if(der>Begin) {
        Tem = new Pojo( Vector[Begin].getMatricula(), 
        Vector[Begin].getMarca(), Vector[Begin].getModelo(),
        Vector[Begin].getPrecio(), Vector[Begin].isEstado());
        
        Vector[Begin].setMatricula(Vector[der].getMatricula());
        Vector[Begin].setMarca(Vector[der].getMarca());
        Vector[Begin].setModelo(Vector[der].getModelo());
        Vector[Begin].setPrecio(Vector[der].getPrecio());
        Vector[Begin].setEstado(Vector[der].isEstado());
            
        Vector[der].setMatricula(Tem.getMatricula());
        Vector[der].setMarca(Tem.getMarca());
        Vector[der].setModelo(Tem.getModelo());
        Vector[der].setPrecio(Tem.getPrecio());
        Vector[der].setEstado(Tem.isEstado());
        }
        quickSort(Begin, der-1);
        quickSort(der+1, End);
        }
    
    
        public int minorPosition(int Start){
        int i; 
        int posMenorID; 
        String miinorPrice; 
        posMenorID = Start;
        
        miinorPrice = Vector[Start].getMarca();
        
        for (i=Start+1; i<Vector.length; i++){
         
        if (Vector[i].getMarca().compareTo(miinorPrice)< 0){ 
         miinorPrice = Vector[i].getMarca(); 
         posMenorID = i;
            }
        }
       
        return posMenorID;
        }
    
        public void setSortSelection(){ 
        
        Pojo Tem=null;
        int i, posMenor;
        
        for (i=0; i<Vector.length; i++){
            posMenor = minorPosition(i);
        
            if(posMenor!=i){
                
                Tem = new Pojo( Vector[i].getMatricula(), 
                Vector[i].getMarca(), Vector[i].getModelo(),
                Vector[i].getPrecio(), Vector[i].isEstado()
                );
               
                Vector[i].setMatricula(Vector[posMenor].getMatricula());
                Vector[i].setMarca(Vector[posMenor].getMarca());
                Vector[i].setModelo(Vector[posMenor].getModelo());
                Vector[i].setPrecio(Vector[posMenor].getPrecio());
                Vector[i].setEstado(Vector[posMenor].isEstado());
                
                Vector[posMenor].setMatricula(Tem.getMatricula());
                Vector[posMenor].setMarca(Tem.getMarca());
                Vector[posMenor].setModelo(Tem.getModelo());
                Vector[posMenor].setPrecio(Tem.getPrecio());
                Vector[posMenor].setEstado(Tem.isEstado());
            }
        } 
        JOptionPane.showMessageDialog(null, "Vector sorted in  Asc order!");
        }
     
        public void shellSort( ){
        int salto, i;
        boolean Changes;
        Pojo Tem=null;
        for(salto=Vector.length/2; salto!=0; salto/=2){
        Changes=true;
        while(Changes){ 
        Changes=false;
        for(i=salto; i<Vector.length; i++) 
        if(Vector[i-salto].getMarca().compareTo(Vector[i].getMarca()) <0){ 
       
        Tem = new Pojo( Vector[i].getMatricula(), 
        Vector[i].getMarca(), Vector[i].getModelo(),
        Vector[i].getPrecio(), Vector[i].isEstado());
                    
        Vector[i].setMatricula(Vector[i-salto].getMatricula());
        Vector[i].setMarca(Vector[i-salto].getMarca());
        Vector[i].setModelo(Vector[i-salto].getModelo());
        Vector[i].setPrecio(Vector[i-salto].getPrecio());
        Vector[i].setEstado(Vector[i-salto].isEstado());
                    
                    
        Vector[i-salto].setMatricula(Tem.getMatricula());
        Vector[i-salto].setMarca(Tem.getMarca());
        Vector[i-salto].setModelo(Tem.getModelo());
        Vector[i-salto].setPrecio(Tem.getPrecio());
        Vector[i-salto].setEstado(Tem.isEstado());
                    
        Changes=true; 
                     }
                  }
              }
           }
        
        }

 