package iostream;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author： hzm
 * @date： 2022/1/25 15:45
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class FileOutputStreamTest {
    @Test
    public void fileOutPutStream01(){

                FileOutputStream fos =null;
                try {
                    //如果文件不存在则会新建一个
                    //这种方式会先将源文件先清空，然后重新写入
                    //fos =new FileOutputStream("\\njSVN\\mms-push\\trunk\\0.5\\web\\myWeb2022\\javese-maven\\src\\test\\java\\iostream\\test.txt");
                    //采用这种方式会在文件末尾写入，不会清空原文件内容
                    fos = new FileOutputStream("E:\\njSVN\\mms-push\\trunk\\0.5\\web\\myWeb2022\\javese-maven\\src\\test\\java\\iostream\\test.txt",true);
                    //写入
                    byte[] bytes ={97,98,99,100};
                    //写出
                    fos.write(bytes);
                    //将byte数组部分写出
                    fos.write(bytes,0,2);//写出ab

                    //字符串转换为数组byte数组
                    String s="字符串";
                    byte[] bs =s.getBytes();
                    //写
                    fos.write(bs);
                    fos.flush();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    if (fos!=null){
                        try {
                            fos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }



    }
}
