/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Interface.IShape;
import Model.*;
/**
 *
 * @author ASUS
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IShape circle = new Circle();
        IShape rectangle = new Rectangle();
        IShape square = new Square();
        
        GraphicEditor editor = new GraphicEditor();
        editor.DrawShape(circle);
        editor.DrawShape(rectangle);
        editor.DrawShape(square);
    }
    
}
