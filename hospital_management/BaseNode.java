package hospital_management;

/**
 *
 * @author SiddiqNF
 */
public class BaseNode {
        String name,Gender,Disease,Address,id,time,Designation;
        int Age,room;
        BaseNode next;
        BaseNode previous;
        BaseNode(String name, String Id, String Designation, int room, int Age)
        {
            this.name=name;
            this.id=Id;
            this.Designation=Designation;
            this.room=room;
            this.Age=Age; 
            this.next=null;
            this.previous=null;

        }
        BaseNode(String name, String Gender, String Disease, String Address)
        {
            this.name=name;
            this.Gender=Gender;
            this.Address=Address;
            this.Disease=Disease; 
            this.next=null;
            this.previous=null;
        }
        BaseNode(String name, int Age, String Disease, String time)
        {
            this.name=name;
            this.Age=Age;
            this.Disease=Disease;
            this.time=time;
            this.next=null;
        }
}
