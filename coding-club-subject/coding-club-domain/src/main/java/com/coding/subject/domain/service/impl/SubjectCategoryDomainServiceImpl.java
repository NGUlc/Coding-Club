package com.coding.subject.domain.service.impl;

import com.alibaba.fastjson.JSON;
import com.coding.subject.domain.convert.SubjectCategoryConverter;
import com.coding.subject.domain.entity.SubjectCategoryBO;
import com.coding.subject.domain.service.SubjectCategoryDomainService;
import com.coding.subject.infra.basic.entity.SubjectCategory;
import com.coding.subject.infra.basic.service.SubjectCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class SubjectCategoryDomainServiceImpl implements SubjectCategoryDomainService {
    @Resource
    private SubjectCategoryService subjectCategoryService;

    @Override
    public void add(SubjectCategoryBO subjectCategoryBO) {
        if(log.isInfoEnabled()){
            log.info("SubjectCategoryController.add.bo:{}", JSON.toJSONString(subjectCategoryBO));
        }
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE.convertBoToCategory(subjectCategoryBO);
        subjectCategoryService.insert(subjectCategory);
    }
}
