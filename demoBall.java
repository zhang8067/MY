public class demoBall {
    public static void main(String[] args) {
      /*  3.一球从100米高度自由落下，每次落地后反跳回原高度的一半；
        再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？*/
        double sum =0,high = 100;
        for (int i = 0; i < 10; i++) {
            sum = high+ high/2+sum;
            high/=2;
        }
        System.out.println(sum+"   "+high);

    }
}
