package pattern.builder_pattern.simple_factory_pattern;

/**
 * 文 件 名: LoginManager
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 15:43
 * 描    述: 工厂类LoginManager
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class LoginManager {
    public static Login factory(String type) {
        if (type.equals("password")) {
            return new PasswordLogin();
        } else if (type.equals("passcode")) {
            return new DomainLogin();
        } else {
            /**
             * 这里抛出一个自定义异常会更恰当
             */
            throw new RuntimeException("没有找到登录类型");
        }
    }
}
