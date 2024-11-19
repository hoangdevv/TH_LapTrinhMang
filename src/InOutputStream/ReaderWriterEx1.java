/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InOutputStream;

/**
 *
 * @author PC
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterEx1 {
    public static void main(String[] args) {
        try {
            String file_name = "C:/data.txt";
            String s = "Hello file Reader-Writer";
            System.out.println("Du lieu ban dau: " + s);

            // Ghi chuỗi s vào tập tin
            FileWriter fw = new FileWriter(file_name);
            fw.write(s);
            fw.close();

            // Đọc dữ liệu từ file
            FileReader fr = new FileReader(file_name);
            StringBuffer sb = new StringBuffer();
            char ca[] = new char[8]; // Mảng ký tự với kích thước 8
            while (fr.ready()) {
                int len = fr.read(ca); // Đọc tối đa 8 ký tự mỗi lần
                sb.append(ca, 0, len); // Thêm các ký tự đã đọc vào StringBuffer
            }
            fr.close();

            // Hiển thị dữ liệu đã đọc từ file
            System.out.println("Du lieu duoc doc: " + sb);
        } catch (IOException e) {
            System.err.println("Error!.");
        }
    }
}
