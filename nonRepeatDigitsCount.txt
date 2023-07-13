import java.io.*;
import  java.util.*;
class UserMainCode
{
public int nonRepeatDigitsCount(int input1){
String str = Integer.toString(input1);
int len=str.length();
int count=0,pcount=0;
for(int i=0;i<len;i++)
{
          count=0;
for(int j=0;j<len;j++)
{
                if(i!=j)
if(str.charAt(i)==str.charAt(j))
{
count++;
break;
}
}
            if(count==0)
              pcount++;
}
return pcount;
}
}