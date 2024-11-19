/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InOutputStream;

/**
 *
 * @author PC
 */
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayReaderEx2 {
    public static void main(String[] args) throws IOException {
        // Chuỗi gốc
        String origin_text = "Log20210217.txt";
        char char_array[] = origin_text.toCharArray(); // Chuyển chuỗi thành mảng ký tự

        // Tạo CharArrayReader và CharArrayWriter
        CharArrayReader r = new CharArrayReader(char_array);
        CharArrayWriter w = new CharArrayWriter();

        int code;
        // Đọc từng ký tự từ CharArrayReader
        while ((code = r.read()) != -1) {
            // Ghi các ký tự là số vào CharArrayWriter
            if (code >= 48 && code <= 57) { // Kiểm tra ký tự có phải là số (0-9)
                w.write(code);
            }
        }

        // Lấy dữ liệu từ CharArrayWriter dưới dạng mảng ký tự
        char new_char_array[] = w.toCharArray();
        System.out.println(new_char_array); // In mảng ký tự mới

        // Lấy dữ liệu từ CharArrayWriter dưới dạng chuỗi
        String new_text = w.toString();
        System.out.println(new_text); // In chuỗi mới
    }
}
