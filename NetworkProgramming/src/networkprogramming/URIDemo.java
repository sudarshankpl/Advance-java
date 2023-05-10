/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Marshall
 */
public class URIDemo {
    public static void main(String[]args) throws URISyntaxException{
        URI uri1=new URI("mailto:info@asmt.edu.np");
        System .out.println(uri1);
 
        URI uri2=new URI("mailto:tel:9841160837");
        System .out.println(uri2);  
        
        URI uri3=new URI("file:c/myfile/abc.txt");
        System .out.println(uri3);    
        
        URI uri4=new URI("ftp","c/file/abc.txt","abc");
        System .out.println(uri4);    

        URI uri5=new URI("ftp","www.asmt.edu.np","/style/style.css","abc");
        System .out.println(uri5);  
        
        URI uri6=new URI("ftp","www.asmt.edu.np:66","/style/style.css","q=network+programming","abc");
        System .out.println(uri6);       
        
        URI uri7=new URI("ftp","ram","gmail.com",88,"/style/style.css","q=network+programming","abc");
        System .out.println(uri7); 
        
        System.out.println("parts of the URI");
        System.out.println(uri1.getScheme());
        System.out.println(uri1.getSchemeSpecificPart());
        System.out.println(uri1.getRawSchemeSpecificPart());
        System.out.println(uri1.getQuery());
        System.out.println(uri1.getFragment());
        
        
        System.out.println(uri7.getScheme());
        System.out.println(uri7.getScheme());
        System.out.println(uri7.getSchemeSpecificPart());
        System.out.println(uri7.getRawSchemeSpecificPart());
        System.out.println(uri7.getQuery());
        System.out.println(uri7.getFragment());       
        
        
    }
    
}
