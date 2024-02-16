package com.soa.lab4ws.retrofit;

import com.soa.lab4ws.model.requests.GroupView;
import com.soa.lab4ws.model.domain.StudyGroup;
import com.soa.lab4ws.model.domain.StudyGroupPage;
import retrofit2.Call;
import retrofit2.http.*;

public interface GroupAPI {
    @GET("{id}")
    Call<StudyGroup> getGroupById(@Path("id") long id);

    @GET("study-groups")
    Call<StudyGroupPage> getGroups(@Query("pageSize") int pageSize);

    @PUT("{id}")
    Call<StudyGroup> updateGroup(@Path("id") long id, @Body GroupView groupView);
}
