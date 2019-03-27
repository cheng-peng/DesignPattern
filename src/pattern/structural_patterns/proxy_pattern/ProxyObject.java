package pattern.structural_patterns.proxy_pattern;

/**
 * 文 件 名: ProxyObject
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 14:38
 * 描    述: 代理对象角色
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class ProxyObject extends AbstractObject{
    RealObject realObject = new RealObject();
    @Override
    public void operation() {
        //调用目标对象之前可以做相关操作
        System.out.println("before");
        realObject.operation();
        //调用目标对象之后可以做相关操作
        System.out.println("after");
    }
}
