/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InOutputStream;

/**
 *
 * @author PC
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamEx2 {
    public static void main(String[] args) {
        byte[] byteArray = {65, 66, 67, 68, 69}; // Mảng byte (mã ASCII)

        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
            int data;

            // Đọc từng byte từ ByteArrayInputStream
            while ((data = byteArrayInputStream.read()) != -1) {
                System.out.print((char) data); // Chuyển đổi byte sang ký tự và in ra
            }

            byteArrayInputStream.close(); // Đóng luồng
        } catch (IOException e) {
            e.printStackTrace(); // Xử lý ngoại lệ nếu có lỗi xảy ra
        }
    }
}
