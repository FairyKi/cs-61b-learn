import java.util.ArrayList;
import java.util.List;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        return  new int[]{1, 2, 3, 4, 5, 6};
    }

    /** Returns according to customer conditions.
     * If the customer is Ergun, please return ["beyti", "pizza", "hamburger", "tea"].
     * If the customer is Eric, please return ["Sushi", "Pasta", "Avocado", "Coffee"].
     * In other cases, return an empty string of size 3[]. */
    public static String[] takeOrder(String customer) {

        if("Ergun".equals(customer)){
            return new String[]{"beyti", "pizza", "hamburger", "tea"};
        }
        else if("Erik".equals(customer)){
            return new String[]{"sushi", "pasta", "avocado", "coffee"};
        }
        return new String[]{""," ",""};
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {

        int max = array[0];
        int min = array[0];
        for(int i:array){
            if(i>=max){
                max=i;
            }if (i<=min) {
                min = i;
            }
        }
        return max-min;
    }

    /**
      * 使用递归计算冰雹序列，作为从输入数 n 开始的整数列表。
      * 冰雹序列描述为：
      * - 选择一个正整数 n 作为起始
      * - 如果n为偶数，则将n除以2
      * - 如果n为奇数，则将n乘以3再加1
      * - 继续此过程直到n为1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        list.add(x);
        if(x==1){
            return list;
        }
        if(x%2==0){
            return hailstoneHelper(x/=2,list);
        }
        else {
            return hailstoneHelper(x=x*3+1,list);
        }
    }

}
