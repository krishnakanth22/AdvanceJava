import java.io.*;
import  java.util.*;
class UserMainCode
{
 public int NthPrime(int input1){
       int count=0,pcount=0,i;
  for(i=2;i<=100000;i++)
  {
   count=0;
   for(int j=2;j<=Math.sqrt(i);j++)
   {
    if(i%j==0)
     count++;
   }
   if(count==0)
    pcount++;
   if(pcount==input1)
    break;
  }
  return i; 
}}