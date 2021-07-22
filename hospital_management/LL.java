
package hospital_management;

/**
 *
 * @author SiddiqNF
 */
public class LL {
    BaseNode head;
    BaseNode tail;
    int length;
    LL(){
        this.head=null;
        this.tail=null;
        this.length=0;
}
    public boolean IsEmpty(){
        return length==0;
    }
    public void InsertDRecordatFirst(String name, String Id, String Designation, int room, int Age)
    {
       BaseNode temp = new BaseNode(name,Id,Designation,room,Age);
       if(IsEmpty()){
           tail=head;
       }
       else{
           head.previous=temp;
           temp.next=head;
       }
       head=temp;
       length++;
        
    }
        public void InsertDRecordatLast(String name, String Id, String Designation, int room, int Age)
        {
        BaseNode temp = new BaseNode(name,Id,Designation,room,Age);
        if(tail==null){
            head=temp;
        }
        else{
            tail.next=temp;
            
        }
            temp.previous=tail;
            tail=temp;
            length++;
        }
            public void PrintDRecord()
    {
                BaseNode current = head;
                if(head==null){
                    System.out.println("NO record Exist");
                }
                else{
                    while(current != null){
                        System.out.print(current.name+"\t\t"+current.id+"\t\t"+current.Designation+"\t\t"+current.room+"\t\t"+current.Age);
                        current = current.next;
                        length++;
                        System.out.println("");
                    }
                }
        
    }
    public void searchDoctor(String name) {  
        int i = 1;  
        boolean flag = false;    
        BaseNode current = head;   
        if(head == null) {  
            System.out.println("Doctors List is empty");  
            return;  
        }  
        while(current != null) {    
            if(current.name.equals(name)) {  
                flag = true;  
                break;  
            }  
            current = current.next;  
            i++;  
        }  
        if(flag)  
             System.out.println(name+ " Record is present position --> " + i);  
        else  
             System.out.println(name+ " Search Record 'NOT FOUND' ");  
    }
 public void InsertPFirst(String name, String Gender, String Disease, String Address)
    {
       BaseNode temp = new  BaseNode(name,Gender,Disease,Address);
       if(IsEmpty()){
           tail=head;
       }
       else{
           head.previous=temp;
           temp.next=head;
       }
       head=temp;
       length++;
        
    }
    public void InsertPLast(String name, String Gender, String Disease, String Address){
        BaseNode temp = new BaseNode(name,Gender,Disease,Address);
        if(tail==null){
            head=temp;
        }
        else{
            tail.next=temp;
            
        }
            temp.previous=tail;
            tail=temp;
            length++;
    }
    
   
       
    public void PrintForward()
    {
        BaseNode current = head;
        if(head==null){
            System.out.println("List is Empty");
        }
        
            while(current != null){
                System.out.print(current.name+"\t\t"+current.Gender+"\t\t"+current.Disease+"\t\t"+current.Address);
                current = current.next;
                length++;
                System.out.println("");
            }
        }
        
    
    public void searchPNode(String name) {  
        int i = 1;  
        boolean flag = false;    
        BaseNode current = head;   
        if(head == null) {  
            System.out.println("None of the patient's data exist");  
            return;  
        }  
        while(current != null) {    
            if(current.name.equals(name)) {  
                flag = true;  
                break;  
            }  
            current = current.next;  
            i++;  
        }  
        if(flag)  
             System.out.println(name+ " Record is present at the position : " + i);  
        else  
             System.out.println(name+ " Search Record 'NOT FOUND'");  
    }  
    

}
