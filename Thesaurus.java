/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thesaurususer;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author Harshita V
 */
public class Thesaurus {
    private TreeMap<String,ArrayList<String>> map=new TreeMap<String,ArrayList<String>>();
    public void add(String line){
        String[] arr=line.split(" ");
        String key=arr[0];
       ArrayList<String> al=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
           al.add(arr[i]);
        
        }
        
     map.put(key,al);
    
    }
    public void getsynonyms(String word,PrintWriter writer){
    
    if(!map.containsKey(word)){
        System.out.println(word+" "+"word not found");
        if(!word.equals(""))
        writer.println(word+" "+"word not found");
        else{
            writer.println("Blank line");
            
        }
    
    //return new ArrayList();
    }
    else{
        System.out.println(word+" "+map.get(word));
        writer.println(word+" "+map.get(word));
       
    //return map.get(word);
    }
    //writer.close();
    }
}
