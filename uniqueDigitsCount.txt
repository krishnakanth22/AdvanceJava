import java.io.*;
import  java.util.*;

class UserMainCode{

public int uniqueDigitsCount(int input1){

String str = Integer.toString(input1);

int len=str.length();   

int count=0;

for(int i=0;i<len-1;i++){           

for(int j=i+1;j<len;j++){               

if(str.charAt(i)==str.charAt(j)) {           

count++;                     
break;                 
}} 
 }       
  return len-count;   
}}
