/*
 * 1. 产生20个不重复的10～99以内的数字，并打印出来
 * 2. 利用冒泡排序法进行排序，并打印出来
* */
public class BubbleSort {
    public static void main(String[] args) {
        int[] orgArr = new int[40];
        int count = 0;

        for (int i = 0; i < orgArr.length; i++) {
            count++;
            int Temp = (int) (Math.random() * 90) + 10;
            for (int j = 0; j < i; j++) {
                if (orgArr[j] == Temp) {
                    Temp = orgArr[--i];
                    break;
                }
            }
            orgArr[i] = Temp;
        }

        for (int i = 0; i < orgArr.length; i++) {
            System.out.print(orgArr[i] + " ");
        }
        System.out.println();
        System.out.println(count);

        for (int i = 0; i < orgArr.length; i++) {
//            int j = i + 1;
            for (int j = i + 1; j < orgArr.length; j++) {
                if (orgArr[i] < orgArr[j]) {

                } else {
                    int Temp = orgArr[i];
                    orgArr[i] = orgArr[j];
                    orgArr[j] = Temp;
                }
            }
        }
        for (int i = 0; i < orgArr.length; i++) {
            System.out.print(orgArr[i] + " ");
        }
    }
}
