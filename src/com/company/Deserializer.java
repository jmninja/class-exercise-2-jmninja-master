package com.company;
import java.io.*;


public class Deserializer   {
    Shape shape = null;


    public Deserializer(Shape shape) throws IOException, ClassNotFoundException {
        this.shape = shape;
        FileInputStream fileIn = new FileInputStream("./Shapes.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        shape = (Shape) in.readObject();
        in.close();
        fileIn.close();
        System.out.println("File has been deserialized");

    }
}


