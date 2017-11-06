/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.and.interfaces;

/**
 *
 * @author MILTON PRO
 */
public class ShapeHierachyTest {
    public static void main(String[] args){
        Shape[] shapes = new Shape[6];

        shapes[0] = new Triangle(3, 4);
        shapes[1] = new Square(5);
        shapes[2] = new Circle(7);
        shapes[3] = new Sphere(11);
        shapes[4] = new Cube(5);
        shapes[5] = new Tetrahedron(4);

        for(int i=0; i<shapes.length; i++){
            System.out.printf("%s\n%s\n",
                    shapes[i].getClass().getName(),
                    shapes[i].toString());
        }

    }
}
