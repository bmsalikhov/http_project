package domain;

import data_sources.ReceiverApiDataSource;
import dto.UserDto;
import models.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class ReceiverService {
    final ReceiverApiDataSource receiverApiDataSource;

    public ReceiverService(ReceiverApiDataSource receiverApiDataSource) {
        this.receiverApiDataSource = receiverApiDataSource;
    }

    public void fetch(int pagesCount, int limit) {
        for (int i = 0; i < pagesCount; i++) {
            Call<UserModel> repos = receiverApiDataSource.listReceivers(i, limit);
            try {
                System.out.println("page #" + i + " users count: " + limit);
                Response<UserModel> response = repos.execute();
                response.body().printList();
                System.out.println();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void fetchCreated() {
        Call<UserModel> users = receiverApiDataSource.listCreatedReceivers(1);
        try {
            users.execute().body().printList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteUser(String id) {
        Call<ResponseBody> response = receiverApiDataSource.deleteUser(id);
        try {
            Response<ResponseBody> res = response.execute();
            if (res.code() != 200) {
                System.out.println("something wrong...");
                System.out.println("reason - " + res.errorBody().string());
            } else {
                System.out.println("done!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createUser(String firstName, String lastName, String email) {
        UserDto dto = new UserDto(firstName, lastName, email);
        Call<UserDetail> userData = receiverApiDataSource.createUser(dto);
        try {
            Response<UserDetail> response = userData.execute();
            if (response.code() != 200) {
                System.out.println("something wrong...");
                System.out.println("reason: - " + response.errorBody().string());
            } else {
                System.out.println(response.body());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
