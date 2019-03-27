package pattern.structural_patterns.facade_pattern;

/**
 * 文 件 名: HomeTheaterFacade
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 11:38
 * 描    述: 家中观影
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class HomeTheaterFacade {
    private PopcornPopper mPopcornPopper;
    private Light mLight;
    private Projector mProjector;
    private Computer mComputer;
    private Player mPlayer;

    public HomeTheaterFacade(PopcornPopper mPopcornPopper, Light mLight, Projector mProjector, Computer mComputer, Player mPlayer) {
        this.mPopcornPopper = mPopcornPopper;
        this.mLight = mLight;
        this.mProjector = mProjector;
        this.mComputer = mComputer;
        this.mPlayer = mPlayer;
    }

    //看电影
    public void watchMovie() {
        //1.打开爆米花机
        mPopcornPopper.on();
        //2.制作爆米花
        mPopcornPopper.makePopcorn();
        //3.将灯光调暗
        mLight.down();
        //4.打开投影仪
        mProjector.on();
        //5.放下投影仪投影区
        mProjector.open();
        //6.打开电脑
        mComputer.on();
        //7.打开播放器
        mPlayer.on();
        //8.将播放器音调设为环绕立体声
        mPlayer.make3D();
    }

    //停止看电影
    public void stopMovie() {
        //1.停止制作爆米花
        mPopcornPopper.stopMakePopcorn();
        //2.关闭爆米花机
        mPopcornPopper.off();
        //3.将灯光调亮
        mLight.up();
        //4.收起投影仪投影区
        mProjector.close();
        //5.关闭投影仪
        mProjector.off();
        //6.关闭播放器
        mPlayer.off();
        //7.关闭电脑
        mComputer.off();
    }

}
