package mm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class output {
    public static void main(String[] args)
    {
        int i=1, j=2, k=3;

        int m = i-- - j-- - k--;

        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
        System.out.println("m="+m);
        
        
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        
        int[] array3 = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).boxed().sorted(Comparator.comparing(Integer::valueOf)).mapToInt(Integer::intValue).toArray();
        
        
        for(int r = array3.length-1 ; r>=0;r--)
        {
        	System.out.print(array3[r]);
        }
        
//        for (int element : array3) {
//            System.out.print(element + " ");
//           
//        }
        
        
    }
    
    
}

