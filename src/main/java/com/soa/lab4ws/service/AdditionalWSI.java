package com.soa.lab4ws.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;


@WebService
public interface AdditionalWSI {

    @WebMethod
    Long countTransferred();
//    @WebMethod
//    List<StudyGroup> moveStudents(long from, long to);
}
