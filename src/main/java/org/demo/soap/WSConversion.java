/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.demo.soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author daserna
 */
@WebService(serviceName = "WSConversion")
@Stateless()
public class WSConversion {

    /**
     * Web service operation
     * @param numero
     * @return 
     */
    @WebMethod(operationName = "DecToBin")
    public String DecToBin(@WebParam(name = "numero") int numero) {
        String binario = "";
        while (numero > 0) {
            binario = numero % 2 + binario;
            numero /= 2;
        }
        return binario;
    }
}
