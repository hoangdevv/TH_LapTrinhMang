/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InOutputStream;

/**
 *
 * @author PC
 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {
    public static void main(String[] args) {
        try {
            String file_name = "C:/data.txt";
            long n = 500000; // Số byte ghi
            long t = System.currentTimeMillis();

            // Ghi có sử dụng BufferedOutputStream
            FileOutputStream fo = new FileOutputStream(file_name);
            BufferedOutputStream bo = new BufferedOutputStream(fo);
            for (int i = 0; i < n; i++) {
                bo.write(i);
            }
            bo.close();
            t = System.currentTimeMillis() - t;
            System.out.println("Ghi co vung dem: " + t + " ms");

            // Ghi không sử dụng BufferedOutputStream
            t = System.currentTimeMillis();
            fo = new FileOutputStream(file_name);
            for (int i = 0; i < n; i++) {
                fo.write(i);
            }
            fo.close();
            t = System.currentTimeMillis() - t;
            System.out.println("Ghi KHÔNG có vùng đệm: " + t + " ms");
        } catch (IOException e) {
            System.err.println("ERROR");
        }
    }
}
