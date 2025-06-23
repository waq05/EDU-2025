package com.EDU.entity;

public class UserEntity {
    private String username;
    private String password;

    // 无参构造方法
    public UserEntity() {
    }

    // 全参构造方法
    public UserEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "UserEntity{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // 重写 equals 方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity)) return false;

        UserEntity that = (UserEntity) o;

        if (!username.equals(that.username)) return false;
        return password.equals(that.password);
    }

    // 重写 hashCode 方法
    @Override
    public int hashCode() {
        int result = username.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
