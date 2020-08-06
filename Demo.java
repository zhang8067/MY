public class Demo {
    /*
            思路：
            1.定义一个新的数组。
            2.遍历a数组，用a数组里的数对比b数组里的数。
            3.遍历b数组，用b数组里的数对比a数组里的数。
            4.获取两个数组相同的个数。
            */

            public static int[] HeBingArray(int[] a,int[] b)
            {
                int[] c = new int[a.length+b.length-cf(a,b)*2];
                int index = 0;
                for (int i=0;i<a.length;i++)
                {
                    if (!isExist(b,a[i]))
                    {
                        c[index++] = a[i];
                    }
                }
                for (int i=0;i<b.length;i++)
                {
                    if (!isExist(a,b[i]))
                    {
                        c[index++] = b[i];
                    }
                }
                return c;
            }
            public static int cf(int[] a,int [] b)
            {
                int num = 0;
                for (int i=0;i<a.length;i++)
                {
                    if (isExist(b,a[i]))
                    {
                        num++;
                    }
                }
                return num;
            }
            public static boolean isExist(int[] a,int s)
            {
                boolean d = false;
                for (int i=0;i<a.length;i++)
                {
                    if (s==a[i])
                    {
                        d = true;
                    }
                }
                return d;
            }
            public static void main(String[] args)
            {
                int[] a={10,20,30,40,50};
                int[] b={10,20,60};
                int[] c=HeBingArray(a,b);
                for (int i=0;i<c.length;i++)
                {
                    System.out.print(c[i]+" ");
                }
            }
        }


