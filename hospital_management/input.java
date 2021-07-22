/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital_management;
import java.util.*;
/**
 *
 * @author SiddiqNF
 */
public class input {
    LL obj = new LL();
    Queue obj1 = new Queue();
        String name,Gender,Disease,Address,id,time,Designation;
        int Age,room;
    Scanner sc= new Scanner(System.in);
    public void InsertDRecordatFirst()
    {
        System.out.print("Doctor Name: ");
        name = sc.nextLine();
        System.out.print("Doctor ID: ");
        id = sc.nextLine();
        System.out.print("Enter Doctor Designation : ");
        Designation = sc.next();
        System.out.print("Enter Room Number: ");
        room = sc.nextInt();
        System.out.print("Enter Doctor Age: ");
        Age = sc.nextInt();
        obj.InsertDRecordatFirst(name, id, Designation, room, Age);
        
    }
    public void InsertDRecordatLast()
    {
        System.out.print("Doctor Name: ");
        name = sc.nextLine();
        System.out.print("Doctor ID: ");
        id = sc.nextLine();
        System.out.print("Enter Doctor Designation : ");
        Designation = sc.next();
        System.out.print("Enter Room Number: ");
        room = sc.nextInt();
        System.out.print("Enter Doctor Age: ");
        Age = sc.nextInt();
        obj.InsertDRecordatLast(name, id, Designation, room, Age);
        
    }
    public void searchDoctor()
    {
        System.out.print("Enter Doctor Name: ");
        name = sc.nextLine();
        obj.searchDoctor(name);
    }
    public void PrintDRecord()
    {
        System.out.println("NAME:\t\t\tID:\t\tDesignation:\tRoom:\t\tAge");
        obj.PrintDRecord();
        
        
    }
public void New_Appointment()
    {
       
        System.out.print("Patient Name: ");
        name = sc.next();
        System.out.print("Patient Age: ");
        Age = sc.nextInt();
        System.out.print("Enter what patient suffering from (Disease): ");
        Disease = sc.next();
        System.out.print("Enter Appointment Time:");
        time = sc.next();
        obj1.Engueue(name, Age, Disease, time);    
    }
public void Patient_Checkup()
    {
        obj1.Dequeue();
        System.out.println(":He's now out of queue.");
    }
    public void Remain_Appointments()
    {
        System.out.println("NAME:\t\tAGE:\t\tDISEASE:\t\tTIME:\t\t");
        obj1.PrintQ();
    }
public void addFirstRecord()
    {
       
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Gender: ");
        Gender = sc.nextLine();
        System.out.print("Enter Disease: ");
        Disease = sc.nextLine();
        System.out.print("Enter Address: ");
        Address = sc.nextLine();
        obj.InsertPFirst(name, Gender, Disease, Address);
      
        
    }
  public void addLastRecord()
    {   
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Gender: ");
        Gender = sc.nextLine();
        System.out.print("Enter Disease: ");
        Disease = sc.nextLine();
        System.out.print("Enter Address: ");
        Address = sc.nextLine();
        obj.InsertPLast(name, Gender, Disease, Address);    
    }
 public void PrintPRecord()
    {
        System.out.println("NAME:\t\tGENDER:\t\tDIESES:\t\tADDRESS:\t\t");
        obj.PrintForward();
        
        
    }
    public void SearchByName()
    {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        obj.searchPNode(name);
    }
    
}

