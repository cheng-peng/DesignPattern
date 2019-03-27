package pattern.builder_patterns.simple_factory_pattern;

/**
 * 文 件 名: Login
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 15:35
 * 描    述:  抽象产品 — 登录验证
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public interface Login {
    //登录验证
     boolean verify(String name, String password);
}
