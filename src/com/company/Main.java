package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Creation of the rectangle object
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        //Creation of the circle object
        double radius = 5;
        Shape circle = new Circle(radius);
        //Creation of the triangle object
        double a = 5, b = 3, c = 4;
        Shape triangle = new Triangle(a,b,c);

        //Serialization
        try {
            FileOutputStream fileOut = new FileOutputStream("Shapes.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(rectangle);
            out.writeObject(circle);
            out.writeObject(triangle);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in Shapes.ser");
        }
        catch (IOException i) {
            i.printStackTrace();
        }

        //deserialization
        Deserializer r = new Deserializer(circle);

    }
}
