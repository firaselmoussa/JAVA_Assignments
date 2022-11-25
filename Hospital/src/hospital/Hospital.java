/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;
import java.util.Calendar;

/**
 *
 * @author Firas
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CREATING TEST OBJECTS
        Vaccine cov_19 = new Vaccine("cov-19", "01/01/2032", 90);
        
        Patient sick_bob = new Patient("Bob", 8759, cov_19, false);
        
        Doctor Dr_Jean = new Doctor("Jean", 224, cov_19, true);

        System.out.println(cov_19.toString()+"\n"+sick_bob.toString()+"\n"+Dr_Jean.toString());
       

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int ExpireIn = Integer.parseInt(cov_19.extractYear()) - currentYear;
        System.out.println("vaccine expires in :"+ExpireIn);

        //APPLYING METHODS
        System.out.println("Dr.Jean will give Sick Bob his vaccine..");
        Dr_Jean.giveVaccine(sick_bob);
        System.out.println(sick_bob.toString());
        
        
        //ARRA OF PATIENTS
        Patient patients[] ={new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Unique", 0, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false),
                             new Patient("Bob", 8759, cov_19, false)};
        
        int patientsIds[] = new int[patients.length];
        for(int i= 0; i < patients.length; i++){
            patientsIds[i] = patients[i].getId();
        }
        
        int id = 0;
        int indexOfId = searchById(patientsIds, patients.length, id);
        
        if(indexOfId == -1)
            System.out.println("No user with such Id.");
        else
            System.out.println(patients[indexOfId].toString());
        

    }
    
    
    static int searchById(int arr[], int n, int x){
        // 1st comparison
        if (arr[n - 1] == x)
            return n-1;
        
        //backup var
        int backup = arr[n - 1];
        arr[n - 1] = x;
 
        //no termination condition => no comparison
        for (int i = 0;; i++) {
            
            // this would be executed at-most n comparisons
            if (arr[i] == x) {
                arr[n - 1] = backup;
 
                // final comparison
                if (i < n - 1)
                    return i;
 
                // else not present in the array
                return -1;
            }
        }
    }
    
    
    
}
