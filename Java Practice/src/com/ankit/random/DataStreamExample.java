package com.ankit.random;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by ankitgupta on 5/21/17.
 */
public class DataStreamExample {

        public static void main(String args[]){
//            try{
//                FileInputStream fin=new FileInputStream("/Users/ankitgupta/IdeaProjects/JAVA/Java Practice/src/JavaDeveloper.rtf");
//                FileOutputStream fout=new FileOutputStream("/Users/ankitgupta/IdeaProjects/JAVA/Java Practice/src/JavaDeveloperOut.rtf");
//                //                int i=fin.read();
//                int i=0;
//                while((i=fin.read())!=-1){
////                    System.out.print((char)i);
//                fout.write(i);
//                }
//                fout.flush();
//                fout.close();
//                fin.close();
//            }catch(Exception e){System.out.println(e);}


            System.out.println();


            try {
                FileReader fr = new FileReader("/Users/ankitgupta/IdeaProjects/JAVA/Java Practice/src/JavaDeveloper.rtf");
                FileWriter fw = new FileWriter("/Users/ankitgupta/IdeaProjects/JAVA/Java Practice/src/JavaDeveloperOut.rtf");
                int i;
                while ((i = fr.read()) != -1)
//                    System.out.print((char) i);
                {fw.append((char) i);}
                fr.close();
                fw.flush();
                fw.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
}
