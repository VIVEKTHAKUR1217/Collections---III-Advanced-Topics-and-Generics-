import java.util.*;
class List_Sort implements Comparable<List_Sort>
{

public int compareTo(List_Sort o)
{
int comp=this.name.compareTo(o.name);
if(comp>0)
{
return 1;
}
else if(comp<0)
{
return -1;
}
else
{
return 0;
}
}

String name;
int age;

public String toString()
{
return name+" "+age;
}

List_Sort(String n,int r)
{
name=n;
age=r;
}
public boolean equals(Object o)
{
List_Sort m=(List_Sort) o;
if((this.name).equals(m.age))
{
return true;
}
else
{
return false;
}
}

public int hashCode()
{
return (this.name).length();
//return 5*(this.age);
}


public static void main(String[] args)
{
List_Sort s1=new List_Sort("vivek",11);
List_Sort s2=new List_Sort("java",20);
List_Sort s3=new List_Sort("ds",13);
List_Sort s4=new List_Sort("abc",14);
List_Sort s5=new List_Sort("ab",15);
List_Sort s6=new List_Sort("viv",16);
TreeSet<List_Sort> myset=new TreeSet<List_Sort>();
myset.add(s1);
myset.add(s2);
myset.add(s3);
myset.add(s4);
myset.add(s5);
myset.add(s6);
for(List_Sort s:myset)
{
System.out.println(s);
}
}
}


