package pattern.builder_pattern.simple_factory_pattern;

/**
 * 文 件 名: PasswordLogin
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 15:37
 * 描    述: 具体产品 — 口令认证
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class PasswordLogin implements Login {

    @Override
    public boolean verify(String name, String password) {
        /**
         * 业务逻辑
         */
        if (name.equals("CXP") && password.equals("123456")) {
            return true;
        }
        return false;
    }
}
