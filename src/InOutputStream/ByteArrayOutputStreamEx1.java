/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InOutputStream;

/**
 *
 * @author PC
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEx1 {
    public static void main(String[] args) throws IOException {
        // Tạo một ByteArrayOutputStream với kích thước ban đầu 1024 byte
        ByteArrayOutputStream os = new ByteArrayOutputStream(1024);

        // Tạo mảng byte ban đầu và ghi vào OutputStream
        byte bytes1[] = new byte[]{'H', 'e'};
        os.write(bytes1);

        // Ghi thêm các byte riêng lẻ vào OutputStream
        os.write(108); // Ký tự 'l', mã ASCII là 108
        os.write('l'); // ngc lại
        os.write('o'); // Ký tự 'o', mã ASCII là 111

        byte[] buffer = os.toByteArray();

        // Duyệt qua từng byte trong mảng và in ra mã ASCII cùng ký tự tương ứng
        for (byte b : buffer) {
            System.out.println(b + " ----> " + (char) b);
        }

        os.close(); 
    }
}
