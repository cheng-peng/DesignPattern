package pattern.structural_patterns.proxy_pattern;

/**
 * 文 件 名: Client
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 14:38
 * 描    述: 测试调用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Client {
    public static void main(String[] args) {
        AbstractObject obj = new ProxyObject();
        obj.operation();
    }
}
