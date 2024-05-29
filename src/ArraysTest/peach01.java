package ArraysTest;

public class peach01 {
    public static void main(String[] args) {
        //猴子吃桃问题
        //第十天只剩一个桃子
        //第九天是第十天的两倍加一
        //第八天是第九天的两倍加一

    }
    public static int peach(int day){
        if(day==10){
            return 1;
        }
        return (peach(day+1)+1)*2;
    }
}
