/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital_management;
public class Queue {
    BaseNode Rear,front;
    int size;
    Queue(){
        Rear=null;
        front=null;
        size=0;
    }
public boolean isEmpty(){
        return size==0;
        }
public void Engueue(String name, int Age, String Disease, String time)
    {
        BaseNode oldRear = Rear;
        Rear = new BaseNode(name,Age,Disease, time);
        Rear.name=name;
        Rear.Age=Age;
        Rear.Disease=Disease;
        Rear.time=time;
        Rear.next=null;
        if(isEmpty())
        {
            front=Rear;
        }
        else
        {
            oldRear.next=Rear;
            
        }
        size++;
        
    }
    public void Dequeue()
    {
        String name= front.name;
        int age=front.Age;
        String Disease=front.Disease;
        String time = front.time;
        front=front.next;
        if(isEmpty()){
            Rear=null;
        }
        System.out.println(name);
        size--;
    }
 public void PrintQ()
    {
        BaseNode temp = front;
        if(front==null){
            System.out.println("Queue is Empty");
        }
        else{
            while(temp != null){
                System.out.print(temp.name+"\t\t"+temp.Age+"\t\t"+temp.Disease+"\t\t"+temp.time);
                temp = temp.next;
                size++;
                System.out.println("");
            }
        }
        
    }
}
