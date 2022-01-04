package interfacedicussion;
// interface can extends N number of interfaces atonce because methods inside the interface does not have body
public interface Interface3 extends Interface1,Interface2 
{
       public void m1();  // this will be implemented only once SINCE THIS SAME METHOD IS IN INTERFACE1
       
      public void m100();  
}
// NOTE ----> SAME TYPE OF ENTITY(CLASS WITH CLASS, INTERFACE WITH INTERFACE) FOLLOOW EXTENDS BUT DIFFERENT TYPES OF ENTITY(CLASS WITH INTERFACE) FOLLOW IMPLEMENTS
// AN INTERFACE CAN EXTENDS ANOTHER INTERFACE BUT A CLASS HAVE TO CONNECT WITH ANOTHER INTERFACE THROUGH implements KEYWORD