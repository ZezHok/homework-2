package ru.stqa.homework.sandbox;

public class HomeWork2 {
  public static void main(String[] args) {

    Point p1 = new Point(5, 6);
    // p1.x = 5;
    // p1.y = 6;
    System.out.println("Координаты первой точки (" + p1.x + ";" + p1.y + ")");

    Point p2 = new Point(7, 8);
    // p2.x = 7;
    // p2.y = 8;
    System.out.println("Координаты первой точки (" + p2.x + ";" + p2.y + ")");

    System.out.println("Расстояние между координатами " + p1.distance(p2));
  }
}

/*
 public static double distance (ru.stqa.homework.sandbox.Point p1, ru.stqa.homework.sandbox.Point p2) {
        return Math.sqrt((p2.x - p1.x)*(p2.x - p1.x)+(p2.y - p1.y)*(p2.y - p1.y));
    }
 System.out.println("Расстояние между координатами " + distance(p1, p2));
*/
