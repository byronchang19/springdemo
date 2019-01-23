package com.zhangnaiwang.test;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-18 17:14
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
