/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main_Package;

import org.jsoup.*;
import org.jsoup.select.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.*;
import java.util.*;
import java.io.*;


/**
 *
 * @author Badha Rathna
 */
public class snapdeal {
    public static void main(String args[]) throws IOException{
        String price ="", description = "",url;
        
        url = "https://www.snapdeal.com/product/veirdo-green-half-sleeve-tshirt/639827458615";
        Document doc = Jsoup.connect(url).userAgent("Mozilla/4.0").get();
        
        //the below is for the description
        Elements p = doc.getElementsByClass("payBlkBig");
        Elements desc = doc.select("[itemprop=description]");
        description  = desc.html().toString();
       
       
   
        price = p.html().toString();
        System.out.println(""+price+"\n\n"+description);
         
    }
    
}
