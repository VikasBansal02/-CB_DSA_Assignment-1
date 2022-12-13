import java.util.*;
public class Main {
    public static void main (String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        String Ststring = scan.next();
        String Tstr = scan.next();
        Map<Character,Integer> mapTstr = new HashMap<>();
        for(int i = 0; i < Tstr.length(); i++) mapTstr.put(Tstr.charAt(i),mapTstr.getOrDefault(Tstr.charAt(i),0) + 1); 
        Map<Character,Integer> mapStstring = new HashMap<>();
        int hi = 0;
        int t_low = 0;
        int low = 0;
        
        int t_hi = 0;
        int anStstring = -1;
        int len = 0;
        while(hi < Ststring.length()) 
        {
            mapStstring.put(Ststring.charAt(hi),mapStstring.getOrDefault(Ststring.charAt(hi),0)+1);
            if(mapTstr.containsKey(Ststring.charAt(hi)) && mapTstr.get(Ststring.charAt(hi)) == mapStstring.get(Ststring.charAt(hi)))
            len += 1;
            while(low <= hi && len == mapTstr.size()) 
            
            {
                char c = Ststring.charAt(low);
                if(anStstring == -1 || hi - low + 1 < anStstring){
                    anStstring = hi - low + 1;
                    t_low = low;
                    t_hi = hi;
                }
            mapStstring.put(c,mapStstring.get(c) - 1);
            if(mapTstr.containsKey(c) && mapStstring.get(c) < mapTstr.get(c))
            len--;
            low++;
            }
            hi++;
        }
        System.out.println(anStstring == -1 ? "":Ststring.substring(t_low,t_hi + 1));
    }

}