/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main_Package;

import org.jsoup.*;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.select.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.*;
import java.util.*;
import java.io.*;
import java.net.*;


/**
 *
 * @author Badha Rathna
 */

import java.io.*;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
 
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.net.URL;





public class amazon {
    public static void main(String args[]) throws IOException{
        String price ="",desc,url;
        url = "https://www.amazon.in/dp/B095SYVXDR/ref=s9_acsd_al_bw_c2_x_1_i?pf_rd_m=A1K21FY43GMZF8&pf_rd_s=merchandised-search-5&pf_rd_r=31X39JM34M3YFPH6Q8WR&pf_rd_t=101&pf_rd_p=c017efa0-f981-41e5-926c-c0a4fdc91a99&pf_rd_i=15390366031https://www.amazon.in/ELISE-Womens-Yellow-Flip-Flops-8-EHS20-004/dp/B089BG3W94/ref=pb_allspark_purchase_sims_desktop_3/261-5184822-7482929?pd_rd_w=TAG2R&pf_rd_p=4b1daa6f-d985-4bf4-ad05-1c80a32b58b5&pf_rd_r=YR85SYS9PRQAH03A604J&pd_rd_r=dd92a7e3-3b88-4269-aa38-bb109e51cf24&pd_rd_wg=6Mo69&pd_rd_i=B089BG3W94&psc=1";
        Document doc = Jsoup.connect(url).get();
        
        // th ebelow line is to get the block with price
        Element price_block = doc.getElementById("price");
        
        //the below is for the description
        Elements p = doc.getElementsByClass("a-unordered-list a-vertical a-spacing-mini");
        Elements normal_price = price_block.select("#priceblock_ourprice");
        if(normal_price.size() == 0){
            try{
            Elements dealprice = price_block.select("#priceblock_dealprice");
            price = dealprice.text().toString();
            }
            catch(Exception e){
                
            }
        }
        else{
            price = normal_price.text().toString();
        }
        desc = p.text().toString();
        System.out.println("" + price +"\n\n"+desc);

     
        //System.out.println("\n\n\n"+p);
     

    }
    
}



