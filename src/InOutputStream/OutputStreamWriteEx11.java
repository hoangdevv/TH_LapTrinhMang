/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InOutputStream;

/**
 *
 * @author PC
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamWriteEx11 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "C:/data.txt"; // Đường dẫn tới file
        File file = new File(path);

      
        FileOutputStream fos = new FileOutputStream(file);

        fos.write(73); // Ghi mã ASCII cho ký tự 'I'
        fos.write((int) 'T'); // Ghi ký tự 'T'
        fos.write('\n');
        String s = "HUTECH"; // Chuỗi cần ghi vào file
        byte[] b = s.getBytes(); // Chuyển chuỗi thành mảng byte
        fos.write(b); // Ghi mảng byte vào file

        fos.close(); // Đóng luồng sau khi ghi xong
    }
}
