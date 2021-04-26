/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restcircleclient;

import java.io.StringReader;
import java.util.Scanner;
import javax.xml.bind.JAXB;
import util.ClientCircle;

/**
 *
 * @author supakew
 */
public class RestCircleClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ClientCircle obj = new ClientCircle();
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter radius => ");
     String radius = sc.next();
     String xml = obj.Area(radius);
     //System.out.println(xml);
     String string = (String) JAXB.unmarshal(new StringReader(xml), String.class);
     System.out.println(string);
     
     
    }
    
}
