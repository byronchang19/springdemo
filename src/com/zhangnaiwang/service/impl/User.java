package com.zhangnaiwang.service.impl;

import com.zhangnaiwang.service.Card;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-16 13:59
 */
public class User {

    private String userName;

    private Card cardOne;

    public String getUserName() {
        return userName;
    }

    public Card getCardOne() {
        return cardOne;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setCardOne(Card cardOne) {
        this.cardOne = cardOne;
    }
}
