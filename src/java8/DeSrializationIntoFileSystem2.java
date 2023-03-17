package java8;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class DeSrializationIntoFileSystem2 {
          public static void main(String[] args) {
			try {
				FileInputStream fileInputStream=new FileInputStream("D:/tinu.txt");
				ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
				Dog dog=(Dog)objectInputStream.readObject();
				System.out.println("Hello  Dog de serialized = "+dog);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
}
