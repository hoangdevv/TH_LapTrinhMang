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
import java.io.IOException;

public class CharArrayReaderEx1 {
    public static void main(String[] args) throws IOException {
        // Tạo mảng ký tự
        char char_array[] = new char[]{'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 't', 'e', 'x', 't'};
        
        // Tạo đối tượng CharArrayReader để đọc từ mảng ký tự
        CharArrayReader reader = new CharArrayReader(char_array);

        int code;
        // Đọc từng ký tự từ CharArrayReader
        while ((code = reader.read()) != -1) {
            char ch = (char) code; // Chuyển mã số sang ký tự
            System.out.println(ch); // In ký tự ra
        }

        // Đóng CharArrayReader
        reader.close();
    }
}
