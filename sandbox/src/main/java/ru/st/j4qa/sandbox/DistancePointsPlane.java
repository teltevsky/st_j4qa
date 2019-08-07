package ru.st.j4qa.sandbox;

public class DistancePointsPlane {


    public static void main(String[] args) {

        Point p1 = new Point(1, 3);
        Point p2 = new Point(6, 7);
        System.out.println("Расстояние между двумя точками, лежащими в одной плоскости, с координатами [" + p1.x + "; " + p1.y + "] и [" + p2.x + "; " + p2.y + "] равно " + distance(p1, p2));


//  Не сообразил, как при переносе функции (метода) в класс Point указать разные параметры (координаты) для разных точек (объектов).
//  Создал новый класс TwoPoints
        TwoPoints tp = new TwoPoints(5,12,-7,15);
        System.out.println("NEW Расстояние между двумя точками, лежащими в одной плоскости, с координатами [" + tp.x1 + "; " + tp.y1 + "] и [" + tp.x2 + "; " + tp.y2 + "] равно " + tp.distance());

    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }

}