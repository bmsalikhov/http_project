package data_sources;

import dto.UserDto;
import models.*;
import retrofit2.Call;
import retrofit2.http.*;

public interface ReceiverApiDataSource {
    @Headers({"app-id: 6584ad6c5ba952cf0355ac49"})
    @GET("user?")
    Call<UserModel> listReceivers(@Query("page") int page, @Query("limit") int limit);

    @Headers({"app-id: 6584ad6c5ba952cf0355ac49"})
    @POST("user/create")
    Call<UserDetail> createUser(@Body UserDto dto);
}
