package java8;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class SerializationIntoFileSystem {
          public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter name");
			String name=scanner.next();
			System.out.println("Enter price");
			int price=scanner.nextInt();
			try {
				Dog dog=new Dog(name,price);
				FileOutputStream fileOutputStream=new FileOutputStream("D:/tinu.txt");
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
				objectOutputStream.writeObject(dog);
				System.out.println("Hello  Dog serialized = "+dog);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
}
