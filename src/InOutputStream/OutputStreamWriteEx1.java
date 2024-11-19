/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InOutputStream;

/**
 *
 * @author PC
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class OutputStreamWriteEx1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "C:/data.txt"; // Đường dẫn file
        byte b[] = new byte[15]; // Mảng byte
        File file = new File(path);
        OutputStream os = new FileOutputStream(file); // Luồng ghi vào file

        os.write(73); // Ghi ký tự 'B' vào file
        os.write((int) 'T'); // Ghi ký tự 'T' vào file
        os.write('\n');
        String s = "HUTECH-ILOVE"; // Chuỗi cần ghi
        char c[] = s.toCharArray(); // Chuyển chuỗi sang mảng ký tự
        for (int i = 0; i < c.length; i++) {
            b[i] = (byte) c[i]; // Chuyển từng ký tự sang byte
        }

        os.write(b); // Ghi mảng byte vào file
        os.close(); // Đóng luồng
    }
}
