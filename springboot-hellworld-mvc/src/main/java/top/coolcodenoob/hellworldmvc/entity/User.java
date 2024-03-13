package top.coolcodenoob.hellworldmvc.entity;

public class User {
    /**
     * 编号
     */
    private int userId;

    /**
     * 姓名
     */
    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
