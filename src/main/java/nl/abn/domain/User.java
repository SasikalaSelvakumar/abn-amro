package nl.abn.domain;

public enum User {
    QA_USER1("biancunha@gmail.com", "123456"),
    QA_USER2("growdev@growdev.com.br", "growdev123"),
    ADMIN_USER1("admin@admin.com", "2020"),
    INVALID_USER("testuser@yahoo.com", "testuser@testuser.com");

    private final String userName;
    private final String password;

    User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}




