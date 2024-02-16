package com.soa.lab4ws.model.requests;

import com.soa.lab4ws.model.domain.Coordinates;
import com.soa.lab4ws.model.domain.Person;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroupView {
    private String name;
    private Coordinates coordinates;
    private Long studentsCount;
    private Long transferredStudents;
    private Integer averageMark;
    private String semester;
    private Person groupAdmin;
}
