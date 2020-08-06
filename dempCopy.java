import java.io.*;

public class dempCopy {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("F:\\6.1_培训_java\\java_2\\图片\\css.png");
        OutputStream os = new FileOutputStream("F:\\6.1_培训_java\\java_2\\图片\\css1.png");
        byte[] b =new byte[1024];
          int len;
          while((len=is.read())!=-1){
              os.write(b,0,len);

          }
    }
}
