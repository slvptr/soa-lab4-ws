package com.soa.lab4ws.service;

import com.soa.lab4ws.model.domain.StudyGroup;
import com.soa.lab4ws.model.domain.StudyGroupPage;
import com.soa.lab4ws.retrofit.GroupService;
import jakarta.inject.Inject;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;


import java.io.IOException;
import java.util.List;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class Additional implements AdditionalWSI {
    @Inject
    private GroupService groupService;

    public Long countTransferred() {
        System.out.println("countTransferred");
        try {
            long sum = 0;
            StudyGroupPage groupPage = groupService.getGroups();
            List<StudyGroup> groupList = groupPage.getStudyGroups();
            if (groupList == null) return 0L;
            for (StudyGroup group : groupList) {
                sum += group.getTransferredStudents();
            }
            return sum;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    @WebMethod
//    public List<StudyGroup> moveStudents(long from, long to) {
//        System.out.printf("moveStudents %d %d%n", from, to);
//
//        try {
//            StudyGroup groupFrom = groupService.getGroupById(from);
//            StudyGroup groupTo = groupService.getGroupById(to);
//
//            if (groupFrom == null || groupTo == null) {
//                throw new RuntimeException();
//            }
//
//            GroupView groupViewFrom = new GroupView(
//                    groupFrom.getName(),
//                    groupFrom.getCoordinates(),
//                    0L,
//                    0L,
//                    groupFrom.getAverageMark(),
//                    groupFrom.getSemesterEnum().getValue(),
//                    groupFrom.getGroupAdmin()
//            );
//            GroupView groupViewTo = new GroupView(
//                    groupTo.getName(),
//                    groupTo.getCoordinates(),
//                    groupTo.getStudentsCount() + groupFrom.getStudentsCount(),
//                    groupTo.getTransferredStudents() + groupFrom.getTransferredStudents(),
//                    groupTo.getAverageMark(),
//                    groupTo.getSemesterEnum().getValue(),
//                    groupTo.getGroupAdmin()
//            );
//
//            groupFrom = groupService.updateGroup(from, groupViewFrom);
//            groupTo = groupService.updateGroup(to, groupViewTo);
//
//            List<StudyGroup> resultList = new ArrayList<StudyGroup>();
//            resultList.add(groupFrom);
//            resultList.add(groupTo);
//
//            return resultList;
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
