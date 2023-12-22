package app;

import data_sources.ReceiverApiDataSource;
import domain.ReceiverService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://dummyapi.io/data/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ReceiverApiDataSource receiverApiDataSource = retrofit.create(ReceiverApiDataSource.class);
        ReceiverService service = new ReceiverService(receiverApiDataSource);
        service.fetch(2, 3);
        /*Random random = new Random();
        String randomEmail = String.valueOf(random.nextInt(999) * 5 + 1) + LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMmyyyy")) + "@mail.ru";
        service.createUser("Ivan", "Ivanov", randomEmail);*/
    }
}
