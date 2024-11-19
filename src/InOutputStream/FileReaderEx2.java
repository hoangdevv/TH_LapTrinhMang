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

public class FileReaderEx2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Đường dẫn tới tệp
        File file = new File("C:/data.txt");

        // Tạo đối tượng FileReader và BufferedReader để đọc tệp
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);

        String line;
        // Đọc từng dòng trong tệp cho đến cuối tệp
        while ((line = br.readLine()) != null) {
            System.out.println(line); // In ra từng dòng
        }

        // Đóng BufferedReader
        br.close();
    }
}
