/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InOutputStream;

/**
 *
 * @author PC
 */
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedOutputInputStreamEx1 {
    public static void main(String[] args) throws IOException {
        PipedInputStream pi = new PipedInputStream();
        PipedOutputStream po = new PipedOutputStream(pi);

        System.out.println("Du lieu ghi:");
        for (int i = 0; i < 10; i++) {
            int b = (int) Math.round(Math.random() * 20); // Tạo số ngẫu nhiên từ 0 đến 20
            po.write(b); // Ghi số ngẫu nhiên vào PipedOutputStream
            System.out.print(b + " ");
        }
        po.flush(); // Đảm bảo tất cả dữ liệu được ghi
        System.out.println("\n-------------------");

        System.out.println("Du lieu doc:");
        while (pi.available() > 0) {
            int b = pi.read(); // Đọc dữ liệu từ PipedInputStream
            System.out.print(b + " ");
        }
        System.out.println("\n-------------------");

        pi.close(); // Đóng PipedInputStream
        po.close(); // Đóng PipedOutputStream
    }
}
