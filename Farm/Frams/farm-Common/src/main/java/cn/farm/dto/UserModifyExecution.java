package cn.farm.dto;

import cn.farm.enums.UserModifyEnum;

public class UserModifyExecution {
    private Integer state;          //状态码
    private String stateInfo;   //该状态下信息

    public UserModifyExecution(){

    }

    // 登陆失败的构造器
    public UserModifyExecution(UserModifyEnum stateEnum) {
        this.state = stateEnum.getState();              //状态码
        this.stateInfo = stateEnum.getStateInfo();      //状态信息
    }


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public String toString(){
        return "AddressExecution [state=" + state + ", stateInfo=" + stateInfo+"]";
    }
}
