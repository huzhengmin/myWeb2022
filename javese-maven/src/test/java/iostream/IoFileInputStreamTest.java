package iostream;

import org.junit.Test;

import java.io.*;
import java.util.ResourceBundle;

/**
 * @author： hzm
 * @date： 2022/1/25 15:29
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class IoFileInputStreamTest {
    @Test
    public void file01()
    {
        //ResourceBundle bundle = ResourceBundle.getBundle("src/main/resources/test");
        ResourceBundle bundle = ResourceBundle.getBundle("test");   // test.properties   src/test/resources/test.properties

        //String value= bundle.getString("key");
        String value= null;
        try {
            value = new String(bundle.getString("key").getBytes("ISO-8859-1"), "GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(value);
    }
    @Test
    public  void FileInputStream02(){
//建立文件对象
        File file=new File("E:\\njSVN\\mms-push\\trunk\\0.5\\web\\myWeb2022\\javese-maven\\src\\test\\java\\iostream\\1.txt");
        FileInputStream fis  = null;
        try {
            fis = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(fis,"utf-8"); //最后的"GBK"根据文件属性而定，如果不行，改成"UTF-8"试试
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public  void FileInputStream01(){
        //建立文件对象
        File file=new File("E:\\njSVN\\mms-push\\trunk\\0.5\\web\\myWeb2022\\javese-maven\\src\\test\\java\\iostream\\1.txt");
        try
        {
            //建立链接
            FileInputStream fileInputStream=new FileInputStream(file);
            int  n=0;
            StringBuffer sBuffer=new StringBuffer();
            while (n!=-1)  //当n不等于-1,则代表未到末尾
            {
                n=fileInputStream.read();//读取文件的一个字节(8个二进制位),并将其由二进制转成十进制的整数返回
                char by=(char) n; //转成字符
                sBuffer.append(by);
            }
            System.out.println(sBuffer.toString());
        }
        catch (FileNotFoundException e)
        {
            System.out.println("文件不存在或者文件不可读或者文件是目录");
        }
        catch (IOException e)
        {
            System.out.println("读取过程存在异常");
        }
    }
}
