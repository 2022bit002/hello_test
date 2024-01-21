  Marker or tagged interface :
     interface which do not have any member is know as tagged or marker interface.

     CODE :::

           public interface Serializable{  
              }  


  Nested Interface :
     interface can have another interface hwich is nested interface.   

     CODE::::
        
         interface printable{  
               void print();  
               interface MessagePrintable{  
                 void msg();  
               }  
              }  