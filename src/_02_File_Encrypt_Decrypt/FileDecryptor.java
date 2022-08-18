package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	/*
	 * Decryption is the process of taking encoded or encrypted text or other data
	 * and converting it back into text that you or the computer can read and
	 * understand.
	 *
	 * The shift cipher is decrypted by using using the key and shifting back up, at
	 * the end of our encryption example we had our alphabet as:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 *
	 * If we shift it back up by 4 based on the key we used the alphabet is
	 * decrypted:
	 *
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 *
	 * "Lipps Asvph" returns to "Hello World"
	 * 
	 * Create a program that opens the file created by FileEncryptor and decrypts
	 * the message, then display it to the user in a JOptionPane.
	 */
	public static void main(String[] args) {
		String decrypt="";
		String encyrpted="";
		String key = JOptionPane.showInputDialog("give me a key");
		int keyValue=Integer.parseInt(key);
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/_02_File_Encrypt_Decrypt/secretMessage.txt"));
			
			String line = br.readLine();
			while(line != null){
				System.out.println(line);
				decrypt=decrypt+line;
				line = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < decrypt.length(); i++) {
			if((decrypt.charAt(i)-keyValue)>122) {
				encyrpted=encyrpted+(char)(decrypt.charAt(i)+(26-keyValue));
			}
			else if(decrypt.charAt(i)-keyValue>90&&decrypt.charAt(i)-keyValue<97) {
				encyrpted=encyrpted+(char)(decrypt.charAt(i)+(26-keyValue));

			}
			else if(decrypt.charAt(i)==' ') {
				encyrpted=encyrpted+" ";

			}
			else {
			encyrpted =encyrpted+(char)(decrypt.charAt(i)-keyValue);
			}
		}
		System.out.println(encyrpted); 
	}
}
