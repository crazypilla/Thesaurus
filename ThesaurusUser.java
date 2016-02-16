/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thesaurususer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author Harshita V
 */
public class ThesaurusUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
       //FileReader file;
       try{
           // Input file-putting into hashmap
          FileReader file=new FileReader("F:/input.txt");
          BufferedReader bufRead = new BufferedReader(file);
          String myLine = null;
          Thesaurus th=new Thesaurus();
          while((myLine=bufRead.readLine()) != null)
          {th.add(myLine);}
           
          // request file
          
         FileReader reqfile=new FileReader("F:/req.txt");
         BufferedReader bufRead2 = new BufferedReader(reqfile);
         String reqWords=null;
         PrintWriter writer = new PrintWriter("F:/result.txt");
          while((reqWords=bufRead2.readLine()) != null)
              
          {th.getsynonyms(reqWords,writer);
          }
          
          //write to the file
          writer.close();

        
    }
        catch(Exception e){System.out.println(e);}}
}
    

