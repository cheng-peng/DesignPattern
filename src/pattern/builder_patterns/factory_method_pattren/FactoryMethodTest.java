package pattern.builder_patterns.factory_method_pattren;

/**
 * 文 件 名: FactoryMethodTest
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 16:09
 * 描    述: 测试调用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        //先给我来个灯泡
        ICreator creator = new BulbCreator();
        ILight light = creator.CreateLight();
        light.TurnOn();
        light.TurnOff();

        //再来个灯管看看
        creator = new TubeCreator();
        light = creator.CreateLight();
        light.TurnOn();
        light.TurnOff();
    }
}
