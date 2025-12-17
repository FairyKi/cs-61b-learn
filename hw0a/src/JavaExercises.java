/**
 * Skeleton file for HW0A.
 * Exercises sourced from Practice-It by the University of Washington.
 * Original problems available at: https://practiceit.cs.washington.edu/
 *
 * @author Erik Kizior
 */
public class JavaExercises {

    /**
     *打印一个右对齐的星形三角形（'*'），共5条线。
     * 第一行包含1颗星，第二排包含2颗星，依此类推。
     */
    public static void starTriangle() {

        for(int i = 5;i>0;i--){
            for(int j = 1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int n = 6;n>i;n--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 打印给定字符串的每个字符，后接其反向索引。
     * 示例：printIndexed（“hello”）-> h4e3l2l1o0
     */
    public static void printIndexed(String s) {
        for(int i = 0;i<s.length();i++){
            System.out.print(s.charAt(i)+""+(s.length()-i-1));
        }
    }

    /**
     * 返回一个新字符串，每个字符串的字符重复两次。
     * 示例：stutter（“hello”）->“hheelllloo”
     */
    public static String stutter(String s) {
        String new_string = new String("");
        for(int i = 0;i<s.length();i++){
            new_string+=s.charAt(i);
            new_string+=s.charAt(i);
        }
        return new_string;
    }

    /**
     * 确定笛卡尔坐标（x， y）的象限。
     * 回归：
     * 1 表示第一象限（x > 0， y > 0），
     * 2 表示第二象限（x < 0， y > 0），
     * 3 表示第三象限（x < 0， y < 0），* 4 表示第四象限（x > 0， y < 0），
     * 如果点在轴上，则为0。
     */
    public static int quadrant(int x, int y) {
        if(x>0&&y>0){
            return 1;
        }else if(x<0&&y>0){
            return 2;
        }else if(x<0&&y<0){
            return 3;
        }else if(x>0&&y<0){
            return 4;
        }
        return 0;
    }

    public static void main(String[] args) {
        starTriangle();
        printIndexed("hello");
        System.out.println(stutter("hello"));
        System.out.println(quadrant(3, 4));  // Output: 1
        System.out.println(quadrant(-3, 4)); // Output: 2
        System.out.println(quadrant(-3, -4));// Output: 3
        System.out.println(quadrant(3, -4)); // Output: 4
        System.out.println(quadrant(0, 5));  // Output: 0
    }
}
