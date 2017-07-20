/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twelwth_project;

class Math 
    {
        private static int a;
        //int b;
        
   /* static int Temp()
        {
            return a = 10;
        }*/
    static 
    {
        //System.out.println("Static");
        a = 0;
    }
    public Math()
    {
        //System.out.println("Default");
        a++;
    }
    static void Temp2()
    {
        //System.out.println("Temp");
        System.out.println(a);
    }
    
    }
//Статические переменные разделяются между объектами класса

class Employee
{
    private int salary;
    
    public Employee()
    {
        salary = 100;
    }
    public int GetSalary()
    {
        return salary;
    }
}
public class Twelwth_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Math math1 = new Math();
        //Math math2 = new Math();
       // System.out.println(Math.Temp());
        //Math.a = 5;
        //Math.b = 50;
        //math1.a = 80;
        //math1.b = 60;
        //Math.Temp2();
        Employee empl1 = new Employee();
        System.out.println();
    }
    
}
