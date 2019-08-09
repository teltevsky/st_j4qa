package ru.st.j4qa.sandbox;

public class DistancePointsPlane {


    public static void main(String[] args) {

        Point p1 = new Point(1, 3);
        Point p2 = new Point(6, 7);
        System.out.println("Расстояние между двумя точками, лежащими в одной плоскости, с координатами [" + p1.x + "; " + p1.y + "] и [" + p2.x + "; " + p2.y + "] равно " + p1.distance(p2));

    }

}