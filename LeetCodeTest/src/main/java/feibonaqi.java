import java.util.Arrays;

public class feibonaqi {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        /*long numOne = fibonaci1(10000);
        System.out.println(numOne);*/
        long end = System.currentTimeMillis();
        System.out.println("总共耗时"+(end-start));
        long numForty = fibonaci2(10000);
        System.out.println(numForty);
        long executeTime =  System.currentTimeMillis()-end;
        System.out.println("总共耗时"+executeTime);
        long numForty2 = fibonaci3(10000);
        System.out.println(numForty2);
        long executeTime2 =  System.currentTimeMillis()-executeTime;
        System.out.println("总共耗时"+executeTime2);
        //-2872092127636481573
        //2788724563990792802

    }

    /**
     * 递归造成内存深度加深，耗时过长
     * @param num
     * @return
     */
    public static long fibonaci1(int num){
        if(num==1 ||num == 2){
            return 1;
        }
        if(num>2){
            return fibonaci1(num-1)+fibonaci1(num-2);
        }
        return -1;
    }

    /**
     * 优化后
     * @param num
     * @return
     */

    public static long fibonaci2(long num){
        if (num<1){
            return -1;
        }
        long c=1L,b=1L,a=0L;
        if(num==1 ||num == 2){
            return 1;
        }
        for (int i = 0; i < num-2; i++) {
            c = a+b;
            a = b;
            b = c;
        }
        return  c;
    }

    /**
     * 优化3有问题，结果为-
     * @param num
     * @return
     */
    public static long fibonaci3(int num){
        if (num<1){
            return -1;
        }
        if (num == 1 ||num ==2){
            return 1;
        }
        long[] arr = new long[num];
        arr[0]=arr[1]=1;
        for (int i=2;i<num;i++){
            arr[i] =arr[i-1]+arr[i-2];
        }
        System.out.println("数组内容:"+ Arrays.toString(arr));
        return arr[(num-2)];
    }
}
