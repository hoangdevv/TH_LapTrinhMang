/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InOutputStream;

/**
 *
 * @author PC
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputInputStreamEx1 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            // Tạo luồng đọc từ file "inp.txt" và ghi vào file "out.txt"
            in = new FileInputStream("C:\\inp.txt");
            out = new FileOutputStream("C:\\out.txt");

            int c;
            while ((c = in.read()) != -1) { // Đọc từng byte từ file đầu vào
                out.write(c); // Ghi byte đọc được vào file đầu ra
            }
        } finally {
            // Đảm bảo đóng cả hai luồng dù có xảy ra lỗi
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
