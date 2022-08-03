
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.*;

public class Practice {

    public static void main(String[] args) {

        LocalDate todayDate = OffsetDateTime.now().minusHours(5).toLocalDate();
        System.out.println(todayDate);

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