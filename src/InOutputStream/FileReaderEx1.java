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
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Đường dẫn đến tệp
        File file = new File("C:/data.txt");

        // Tạo đối tượng FileReader để đọc tệp
        FileReader fis = new FileReader(file);

        int char_code;
        // Đọc từng ký tự từ tệp cho đến cuối tệp
        while ((char_code = fis.read()) != -1) {
            System.out.println((char) char_code + " " + char_code); // Hiển thị ký tự và mã ASCII
        }

        // Đóng FileReader
        fis.close();
    }
}
