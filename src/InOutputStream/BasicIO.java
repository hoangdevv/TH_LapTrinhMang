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

public class BasicIO {
    public static void main(String[] args) {
        byte byteArr[] = new byte[255];
        try {
            System.err.println("Enter the line of text: ");
            System.in.read(byteArr, 0, 255);
            System.out.println("The line typed was:");
            String str = new String(byteArr); // Loại bỏ khoảng trắng thừa
            System.out.println(str);
        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}
