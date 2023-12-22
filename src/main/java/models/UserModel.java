package models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserModel {
    @SerializedName("data")
    List<UserDetail> userDetails;

    public List<UserDetail> getResultDetails() {
        return userDetails;
    }

    public void printList() {
        for (UserDetail userDetail : userDetails) {
            System.out.println(userDetail);
        }
    }
}