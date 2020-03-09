package com.gupao.designpattern.structural.bridge.course;

/**
 * 将Course体系（Java、Python。。。）与INote、IVideo体系 三个相互关联但又独立扩展的维度关联起来。
 * <p>
 * Just like a bridge
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 14:16
 */
public class AbstractCourse implements ICourse {

    private INote note;
    private IVideo video;

    public INote getNote() {
        return note;
    }

    public void setNote(INote note) {
        this.note = note;
    }

    public IVideo getVideo() {
        return video;
    }

    public void setVideo(IVideo video) {
        this.video = video;
    }
}
