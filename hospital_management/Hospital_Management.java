

package hospital_management;
import java.util.*;
/**
 *
 * @author SiddiqNF
 */
public class Hospital_Management {

       public static void main(String[] args) 
    {

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("*** Welcome to Hospital Management System ***");
        System.out.println("----------------------------------------------");
        LL obj = new LL();
        input abc = new input();
        
        
        Scanner input = new Scanner(System.in);
        int option, s = 1;
        while (s == 1)
        {
            System.out.println("\n<<<<<<=============================MAIN MENU=============================>>>>>>");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("1.PATIENT RECORD  \n2.DOCTOR RECORD  \n3.OPPOINTMENT RECORD  \n4.HOSPITAL FACILITIES");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.print("Select Number:  ");
            option = input.nextInt();
            switch (option)
            {
                
                case 1:
                    {
                        int s1 = 1;
                        while (s1 == 1)
                        {
                            System.out.println("1.Add Patient Record On First Position\n2.Add Patient Record On Last Position\n3.Search Patient Record By Name\n4.Print Patient Record\n");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.print("Select Number:  ");
            
                            int c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        abc.addFirstRecord();
                                        break;
                                    }
                                case 2:
                                    {
                                        abc.addLastRecord();
                                        break;
                                    }
                                case 3:
                                    {
                                        abc.SearchByName();
                                        break;
                                    }
                                case 4:
                                    {
                                        abc.PrintPRecord();
                                        break;
                                    }
                                            
                                }              
                                System.out.println("\nRETURN TO BACK PRESS 01 AND FOR MAIN MENU PRESS 0");
                                s1 = input.nextInt();
                        }
                        break;

                    }
                    case 2:
                    {
                        int s1 = 1;
                        while (s1 == 1)
                        {
                            System.out.println("1.Add Doctor Record On First Position\n2.Add Doctor Record On Last Position\n3.Search Doctor Record By Name\n4.Print Doctor Record\n");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.print("Select Number:  ");
            
                            int c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        abc.InsertDRecordatFirst();
                                        break;
                                    }
                                case 2:
                                    {
                                        abc.InsertDRecordatLast();
                                        break;
                                    }
                                case 3:
                                    {
                                        abc.searchDoctor();
                                        break;
                                    }
                                case 4:
                                    {
                                        abc.PrintDRecord();
                                        break;
                                    }
                                            
                                }              
                                System.out.println("\nRETURN TO BACK PRESS 01 AND FOR MAIN MENU PRESS 0");
                                s1 = input.nextInt();
                        }
                        break;

                    }
                    
                    case 3:
                    {
                        int s1 = 1;
                        while (s1 == 1)
                        {
                            System.out.println("1.Enter New Appointment\n2.Patient Check-Up\n3.Print Remaining Appointments");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.print("Select Number:  ");
            
                            int c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        abc.New_Appointment();
                                        break;
                                    }
                                case 2:
                                    {
                                        abc.Patient_Checkup();
                                        break;
                                    }
                                case 3:
                                    {
                                        abc.Remain_Appointments();
                                        break;
                                    }
                                }              
                                System.out.println("\nRETURN TO BACK PRESS 01 AND FOR MAIN MENU PRESS 0");
                                s1 = input.nextInt();
                        }
                        break;

                    }
                    /*******************************************************************************************************/
                    
                    
                case 4:
                    {
                        int s5 = 1;
                        while (s5 == 1)
                        {
                            System.out.println("1. List Of Fecilities Provided");
                            int c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        System.out.println("<>**************************<>");
                                        System.out.println("==> 24-HOURS Emergency Service\n==> Ambulance Service\n==> Room Service\n==> Canteen Service");
                                        System.out.println("<>**************************<>");
                                        break;
                                    }
                                
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press Any Key");
                            s5 = input.nextInt();
                        }
                               break;
                    }
            }
        }
        
    }
}
   