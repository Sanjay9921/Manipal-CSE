package Stack;

import java.util.*;
import java.io.*;

// Fixed Stack
public class GenStack<T>{
    int tos; // top of the stack is int
    int n; // fixed stack size
    ArrayList<T> arr;
    
    public GenStack(int n){
        tos = -1;
        this.n = n;
        this.arr = new ArrayList<T>(n);
    }
    
    public void push(T x) throws StackOverFlow{
        if(tos==n-1){
            throw new StackOverFlow();
        }
        else{
            tos++;
            // Overwriting existing element
            if(arr.size() > tos){
                arr.set(tos, x);
            }
            else{
                arr.add(x);
            }
        }
    }
    
    
    public T pop() throws StackUnderFlow{
        T x = null;
        if(tos==-1){
            throw new StackUnderFlow();
        }
        else{
            x = arr.get(tos);
            tos--;
        }
        
        return x;
    }
    
    public void display(){
        for(int i=0;i<tos;i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("");
    }
}
