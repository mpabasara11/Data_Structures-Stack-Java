/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

class stack
{int top;
int[] number;

public stack()
{top=0;
number=new int[3];
}

public void push(int value)
{
    if(top<number.length)
    {number[top++]=value;}
}

public int pop()
{if(top>=0)
{
    
  return number[--top];
}
else
{return 0;}
}



public void show()
{
    for(int c=0;c<top;c++)
    System.out.println(number[c]);
}


}
/**
 *
 * @author Malindu
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stack s1=new stack();
        s1.push(10);
        s1.push(2);
        s1.pop();
        
        s1.show();
        
    }
    
}
