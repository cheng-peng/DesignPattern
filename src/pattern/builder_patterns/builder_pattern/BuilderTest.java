package pattern.builder_patterns.builder_pattern;

/**
 * 文 件 名: BuilderTest
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 18:33
 * 描    述: 调用测试
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class BuilderTest {
    public static void main(String[] args) {
        // 构建器
        Builder builder = new ApplePCBuilder();
        // Director
        Director pcDirector = new Director(builder);
        // 封装构建过程, 4核, 内存2GB, Mac系统
        pcDirector.construct(4, 2, "Mac OS X 10.9.1");
        // 构建电脑, 输出相关信息
        System.out.println("电脑信息 : " + builder.create().toString());
    }
}
