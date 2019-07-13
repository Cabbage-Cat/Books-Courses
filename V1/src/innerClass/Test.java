package innerClass;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        final int[] counter = {0};
        Date dates[] = new Date[100];
        for (int i=0;i<dates.length;i++){
            dates[i] = new Date(){
                @Override
                public int compareTo(Date anotherDate) {
                    counter[0]++;
                    return super.compareTo(anotherDate);
                }
            };
        }
        Arrays.sort(dates);
        System.out.println(Arrays.toString(counter));
    }
}
