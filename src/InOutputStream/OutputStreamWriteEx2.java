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
import java.io.OutputStream;

public class OutputStreamWriteEx2 {
    public static void main(String[] args) throws IOException {
        byte byte_array[] = new byte[]{'0', '1', '2', '3', '4', '5', '6', '7', '8'}; // Mảng byte
        OutputStream os = new ByteArrayOutputStream();

        os.write(byte_array, 2, 5); // Ghi 5 byte từ vị trí thứ 2 trong mảng vào OutputStream

        String s = os.toString(); // Chuyển dữ liệu trong OutputStream thành chuỗi
        System.out.println(s); // In ra chuỗi
        os.close(); // Đóng luồng
    }
}