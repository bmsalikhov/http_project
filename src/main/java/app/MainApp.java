package app;

import data_sources.ReceiverApiDataSource;
import domain.ReceiverService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainApp {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://dummyapi.io/data/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ReceiverApiDataSource receiverApiDataSource = retrofit.create(ReceiverApiDataSource.class);
        ReceiverService service = new ReceiverService(receiverApiDataSource);

        AppBuilder appBuilder = new AppBuilder(service);
        appBuilder.run();
    }
}
