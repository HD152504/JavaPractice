package org.dimigo.io;

import java.io.*;

/**
 * <pre>
 *  org.dimigo.io
 *     |_ ArakoMenu
 * 1. 개요 :
 * 2. 작성일 : 2017-06-14
 * <pre>
 * @author : lg
 * @version : 1.0
 */
public class ArakoMenu {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Writer writer = new BufferedWriter(new FileWriter("files/menu.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"));


            String str;
            while ((str = br.readLine()) != null) {
                writer.write(str+"\n");
            }
            writer.flush();
            System.out.println("<< 메뉴 출력 >>");

            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
