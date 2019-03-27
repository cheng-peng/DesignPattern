package pattern.structural_patterns.facade_pattern;

/**
 * 文 件 名: FacadePatternTest
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 11:48
 * 描    述: 测试调用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class FacadePatternTest {
    public static void main(String[] args) {
        PopcornPopper mPopcornPopper=new PopcornPopper();
        Light mLight=new Light();
        Projector mProjector=new Projector();
        Computer mComputer=new Computer();
        Player mPlayer=new Player();
        HomeTheaterFacade mHomeTheaterFacade=new HomeTheaterFacade(mPopcornPopper,mLight,mProjector,mComputer,mPlayer);
        System.out.println("==================开始观影====================");
        mHomeTheaterFacade.watchMovie();
        System.out.println("==================结束观影====================");
        mHomeTheaterFacade.stopMovie();
    }
}
