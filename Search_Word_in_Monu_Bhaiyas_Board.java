import java.util.*;

public class Main 
{

    public static boolean word_vikas(char arvikas[][],String avikas,int ivikas,int jvikas,int kvikas)
    {
        if(kvikas==avikas.length())
            return true;
        
        if(ivikas<0|| jvikas<0 || ivikas>=arvikas.length || jvikas>=arvikas[0].length || arvikas[ivikas][jvikas]!=avikas.charAt(kvikas))
            return false;
        
        char chvikas=arvikas[ivikas][jvikas];
        
        arvikas[ivikas][jvikas]='.';
        
        boolean t1vikas = word_vikas(arvikas,avikas,ivikas+1,jvikas,kvikas+1);
        
        boolean t2vikas = word_vikas(arvikas,avikas,ivikas,jvikas-1,kvikas+1);
        
        boolean t3vikas = word_vikas(arvikas,avikas,ivikas-1,jvikas,kvikas+1);
        
        boolean t4vikas = word_vikas(arvikas,avikas,ivikas,jvikas+1,kvikas+1);
        
        arvikas[ivikas][jvikas] = chvikas;
        
        return t1vikas || t4vikas || t3vikas || t2vikas;
        
    }
    
    public static void main (String args[])
    {
        Scanner scan=new Scanner(System.in);
        
        int a1vikas=scan.nextInt();
        
        int bvikas =scan.nextInt();
        
        int cvikas =scan.nextInt();
        
        char avikas[][]=new char[a1vikas][];
        
        for(int x=0;x<avikas.length;x++)
            avikas[x]=scan.next().toCharArray();
        
        String endvikas[]=new String[cvikas];
        
        for(int x=0;x<endvikas.length;x++)
            endvikas[x]=scan.next();
        
        Arrays.sort(endvikas);
        
        for(int ivikas=0;ivikas<endvikas.length;ivikas++){
            
            int fvikas=0;
            
            for(int ovikas=0;ovikas<avikas.length;ovikas++){
                
                for(int jvikas=0;jvikas<avikas[0].length;jvikas++){
                    
                    if(avikas[ovikas][jvikas]==endvikas[ivikas].charAt(0))
                        if(word_vikas(avikas,endvikas[ivikas],ovikas,jvikas,0)){
                            System.out.print(endvikas[ivikas]+" ");
                            fvikas=1;
                            break;
                        }
                }
                if(fvikas==1)
                    break;
            }
        }
    }
    
}
