package com.soa.lab4ws;

import com.soa.lab4ws.service.AdditionalWSI;

import java.net.MalformedURLException;
import java.net.URL;

public class Test {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://127.0.0.1:8080/lab4-ws-1.0-SNAPSHOT/Additional?wsdl");

        AdditionalService additionalService
                = new AdditionalService(url);
        AdditionalWSI employeeServiceProxy
                = additionalService.getAdditionalPort();

        employeeServiceProxy.countTransferred();
    }
}
