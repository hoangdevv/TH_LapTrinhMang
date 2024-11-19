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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamReadEx1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "C:/data.txt";
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        int code;
        while ((code = fis.read()) != -1) {
            char ch = (char) code;
            System.out.println(code + " " + ch);
        }

        fis.close();
    }
}