import java.io.*; 
import java.util.*;
class UserMainCode{     
  public int countPrimesInRange(int input1, int input2){      
 
   int count=0;        
   int pcount=0;         
  for(int i=input1;i<=input2;i++){   
      
  count=0;        
for(int j=2;j<=Math.sqrt(i);j++) {       
 
if(i%j==0)         
  count++;       
  }       
if(count==0)         
  pcount++;     
  } 
  return count; 
  }}