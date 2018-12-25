package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		
	    ArrayList<Integer> listN= new ArrayList<Integer>();
	    
	    
	    for(int i=1;i<=10;i++) {
int num= (int)(1+Math.random()*101);
    listN.add(num);
	System.out.println(num);
	    }
	    
	    ArrayList<Integer> listN2= (ArrayList)listN.clone();
	    
	    int maxInd=listN.get(0);
	    for(int i=0;i<=listN.size()-2;i++) {
	        
	        if(listN.get(i)>=listN.get(i+1)) {
	            int temp=i;
	            int temp2=listN.get(i);
	            listN.set(i,listN.get(i+1));
	            listN.set(i+1, temp2);
	        }
	       
	    }
	    System.out.println();
	    System.out.println(listN.get(listN.size()-1));
	    
	    
	    
	}

	}
