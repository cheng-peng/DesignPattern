package pattern.builder_pattern.simple_factory_pattern;

/**
 * 文 件 名: SimpleFactoryTest
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 15:43
 * 描    述: 测试调用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        String loginType = "password";
        String name = "CXP";
        String password = "123456";
        Login login = LoginManager.factory(loginType);
        boolean bool = login.verify(name, password);
        if (bool) {
            /**
             * 业务逻辑
             */
            System.out.println("登录成功");
        } else {
            /**
             * 业务逻辑
             */
            System.out.println("用户名和密码不正确");
        }
    }
}
