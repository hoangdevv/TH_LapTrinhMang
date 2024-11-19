/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InOutputStream;

/**
 *
 * @author PC
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Đường dẫn tới tệp
        File file = new File("C:/students.txt");

        // Tạo đối tượng FileReader và BufferedReader
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);

        // Đọc từng dòng, lọc các dòng không bắt đầu với "%" và in ra
        br.lines()
            .filter(line -> !line.startsWith("%"))
            .forEach(System.out::println);

        // Đóng BufferedReader
        br.close();
    }
}
