package com.interfaces.in;

import java.util.Scanner;
interface Shape {
    void input();
    void calcArea();
    void display();
}

class Rectangle implements Shape {
    int l, b;
    float area;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        l = sc.nextInt();
        System.out.print("Enter breadth: ");
        b = sc.nextInt();
    }

    public void calcArea() {
        area = l * b;
    }

    public void display() {
        System.out.println("Rectangle Area = " + area);
    }
}

class Square implements Shape {
    int a;
    float area;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        a = sc.nextInt();
    }

    public void calcArea() {
        area = a * a;
    }

    public void display() {
        System.out.println("Square Area = " + area);
    }
}

class Circle implements Shape {
    float r;
    float area;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = sc.nextFloat();
    }

    public void calcArea() {
        area = 3.14f * r * r;
    }

    public void display() {
        System.out.println("Circle Area = " + area);
    }
}

class AreaCalculation {
    void allowShape(Shape ref) {
        ref.input();
        ref.calcArea();
        ref.display();
    }
}


public class Shapes {
    public static void main(String[] args) {

        Shape r1 = new Rectangle();
        Shape s1 = new Square();
        Shape c1 = new Circle();

        AreaCalculation a1 = new AreaCalculation();

        a1.allowShape(r1);
        System.out.println("======================");
        a1.allowShape(s1);
        System.out.println("======================");
        a1.allowShape(c1);
    }
}
