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
public class flipkart {
    public static void main(String args[]) throws IOException{
        String price ="", description = "",url;
        url = "https://www.flipkart.com/metro-fashion-women-striped-straight-kurta/p/itmbc8a74c8aa480?pid=KTAG537EHXXJQAZH&lid=LSTKTAG537EHXXJQAZHPQ2BJY&marketplace=FLIPKART&store=clo%2Fcfv&srno=b_1_1&otracker=clp_omu_Don%2527t%2BMiss%2Bout%2BDeals_3_9.dealCard.OMU_fashion-boss-nov-2021-sale-store_fashion-boss-nov-2021-sale-store_1OOY9SBU4Q5J_8&otracker1=clp_omu_PINNED_neo%2Fmerchandising_Don%2527t%2BMiss%2Bout%2BDeals_NA_dealCard_cc_3_NA_view-all_8&fm=neo%2Fmerchandising&iid=e2a45c65-d785-4474-8949-c1ebea34c143.KTAG537EHXXJQAZH.SEARCH&ppt=clp&ppn=fashion-boss-nov-2021-sale-store&ssid=nz42l34rdc0000001638117479410";
        Document doc = Jsoup.connect(url).userAgent("Mozilla/4.0").get();
        
        // th ebelow line is to get the block with price
        Element price_block = doc.getElementById("price");
        
        //the below is for the description
        Elements p = doc.getElementsByClass("_30jeq3 _16Jk6d");
        Elements desc = doc.getElementsByClass("B_NuCI");
        description  = desc.html().toString().replace("&nbsp", " ");
        price = p.html().toString();
        System.out.println(""+price+"\n\n"+description);
        
        
        
        //Elements normal_price = price_block.select("#priceblock_ourprice");
        //if(normal_price.size() == 0){
        //    Elements dealprice = price_block.select("#priceblock_dealprice");
        //    price = dealprice.text().toString();
        //}
        //else{
        //    price = normal_price.text().toString();
        //}
        //String desc = p.text().toString();
        //System.out.println("" + price +"\n\n"+desc);
        //System.out.println("\n\n\n"+p);

    }
    
}
