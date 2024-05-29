package ArraysTest;

public class floor {
    //爬楼梯问题
    // 可以一次走一步，也可以一次走两步

    public static void main(String[] args) {
        System.out.println(floor(20));
    }

    public static int floor(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        return floor(n-1)+floor(n-2)+floor(n-3);
    }
}
