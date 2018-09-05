package Encrypt;

import java.lang.*;

/**
 * The main class of the encrypt project
 * @author Sean McGovern
 * @version 1.0.0
 */

public class Main {

    private final static FileOutput outFile = new FileOutput("encrypt.txt");
    private final static FileInput inFile = new FileInput("encrypt.txt");
    public static void main(String[] args) {

        String message = "The quick brown fox jumped over the lazy dog";
        outFile.fileWrite(encrypt(message));
        outFile.fileClose();

        String encrypted = inFile.fileReadLine();

        System.out.println( encrypted + " decrypts to " + decrypt(encrypted));
        inFile.fileClose();


    }

    /**
     * A method to encrypt a String by increasing the numeric value of each character by 8
     * @param s The string to be encrypted
     * @return an encrypted string
     */
    public static String encrypt(String s){
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i<s.length(); i++ ){
            char c = s.charAt(i);
            c += 8;
            encrypted.append(Character.toString(c));
        }
        return encrypted.toString();
    }


    /**
     * A method to return an encrypted string to its original state.
     * @param s the encrypted string
     * @return an decrypted string
     */
    public static String decrypt(String s){
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i<s.length(); i++ ){
            char c = s.charAt(i);
            c -= 8;
            decrypted.append(Character.toString(c));
        }
        return decrypted.toString();
    }
}
