package com.soa.lab4ws.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;


@WebService
public interface AdditionalWSI {

    @WebResult(targetNamespace = "test.namespace")
    Long countTransferred();

//    @WebMethod
//    List<StudyGroup> moveStudents(long from, long to);
}
