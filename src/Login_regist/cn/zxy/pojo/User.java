package Login_regist.cn.zxy.pojo;

/**
 * 这是用户基本描述类
 * @author 郑黑脸
 * @version V1.1
 */
public class User {
    //用户名
    private String username;
    //密码
    private String password;
    //无参构造
    public User() {}
    //get/set方法
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
