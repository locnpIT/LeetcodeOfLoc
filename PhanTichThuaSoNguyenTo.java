import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhanTichThuaSoNguyenTo {
    

    public static List<Integer> phanTich(int n){
        List<Integer> results = new ArrayList<>();

        int num = 2;
        while(n > 1){
            if(n % num == 0){
                results.add(num);
                n /= num;
            }
            else{
                num +=1;
            }
        }

        return results;
    }
    
    public static void main(String[] args) {
        System.out.println(phanTich(12334));
           
     
    }
}
