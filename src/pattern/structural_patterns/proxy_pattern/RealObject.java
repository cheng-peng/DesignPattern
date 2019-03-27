package pattern.structural_patterns.proxy_pattern;

/**
 * 文 件 名: RealObject
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 14:37
 * 描    述: 目标对象角色
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class RealObject extends AbstractObject {
    @Override
    public void operation() {
        //一些操作
        System.out.println("一些操作");
    }
}