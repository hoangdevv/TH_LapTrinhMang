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

public class ByteArrayInputStreamEx1 {
    public static void main(String[] args) throws IOException {
        byte byte_array[] = new byte[] {84, 104, 105, 115, 32, 105, 115, 32, 116, 104, 101, 32, 116, 101, 115, 116}; 
        ByteArrayInputStream bais = new ByteArrayInputStream(byte_array);
        int b;

        while ((b = bais.read()) != -1) { // Đọc từng byte từ mảng
            char ch = (char) b; // Chuyển đổi byte sang ký tự
            System.out.println(b + " " + ch); // In ra mã ASCII và ký tự tương ứng
        }
    }
}
