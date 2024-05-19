package com.coding.subject.domain.handler.subject;

import com.coding.subject.common.enums.SubjectInfoTypeEnum;
import com.coding.subject.domain.entity.SubjectInfoBO;
import com.coding.subject.domain.entity.SubjectOptionBO;
import org.springframework.stereotype.Component;

@Component
public interface SubjectTypeHandler {
    /**
     * 枚举身份的识别
     */
    SubjectInfoTypeEnum getHandlerType();

    /**
     * 实际的题目的插入
     */
    void add(SubjectInfoBO subjectInfoBO);

    SubjectOptionBO query(int subjectId);
}
