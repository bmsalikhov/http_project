package data_sources;

import models.InRadiusDto;
import models.Receiver;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.List;

public interface ReceiverApiDataSource {
    @POST("inRadius")
    Call<List<Receiver>> listReceivers(@Body InRadiusDto dto);
}
