/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InOutputStream;

/**
 *
 * @author PC
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamEx1 {
    public static void main(String[] args) throws IOException {
        String fileName = "file.dat";

        // Ghi file với dữ liệu có định dạng
        DataOutputStream dout = new DataOutputStream(new FileOutputStream(fileName));
        dout.writeDouble(1.1); // Ghi số thực
        dout.writeInt(55); // Ghi số nguyên
        dout.writeBoolean(true); // Ghi giá trị boolean
        dout.writeChar('4'); // Ghi một ký tự
        dout.close();

        // Đọc file với dữ liệu có định dạng
        DataInputStream din = new DataInputStream(new FileInputStream(fileName));
        double a = din.readDouble(); // Đọc số thực
        int b = din.readInt(); // Đọc số nguyên
        boolean c = din.readBoolean(); // Đọc giá trị boolean
        char d = din.readChar(); // Đọc một ký tự
        din.close();

        // In các giá trị đã đọc
        System.out.println("Values: " + a + " " + b + " " + c + " " + d);
    }
}
