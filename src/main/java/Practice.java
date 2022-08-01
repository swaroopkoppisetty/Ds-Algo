
import java.math.BigDecimal;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(1L);

        System.out.println(sol(list,4,1));

    }

    static int sol(List<Long> A,int n, long k)
    {
        int count = 0;
        for(int i = 0; i < n ; i ++){
            for(int j = 0; j<n;j++){
                int exp = (int) ((int) (A.get(i) ^ A.get(j)) & k);
                if(exp == 0)
                    count++;
            }
        }
        return count;
    }


}