package com.coding.subject.common.enums;


import lombok.Getter;

/**
 * 删除状态枚举
 */
@Getter
public enum IsDeletedFlagEnum {
    UN_DELETED(0, "未删除"),
    DELETED(1, "已删除");

    private int code;

    private String desc;

    IsDeletedFlagEnum(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static IsDeletedFlagEnum getByCode(int codeVal){
        for(IsDeletedFlagEnum isDeletedFlagEnum : IsDeletedFlagEnum.values()){
            if(isDeletedFlagEnum.code == codeVal)
                return isDeletedFlagEnum;
        }
        return null;
    }
}
