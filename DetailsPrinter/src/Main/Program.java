/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.ArrayList;
import java.util.List;
import Model.*;

/**
 *
 * @author ASUS
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee employee = new Employee("Name");
        Manager manager = new Manager("manager Name", new ArrayList<String>());
        
        ArrayList<Employee> List = new ArrayList<Employee>();
        List.add(employee);
        List.add(manager);
        DetailsPrinter printer = new DetailsPrinter(List);
        printer.printDetails();
    }
    
}
