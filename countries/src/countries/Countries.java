/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countries;

/**
 *
 * @author Firas
 */
public class Countries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Country LB = new Country("Lebanon", "Asia", 10452, 5882000);
        Country FR = new Country("France", "Europe", 640679, 66616416);
        Country MX = new Country("Mexico", "America", 1972550, 118395054);
        
        System.out.println(LB.toString() +"\n"+ FR.toString() +"\n"+ MX.toString());

    }
    
}
