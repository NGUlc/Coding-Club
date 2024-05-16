package com.coding.subject.application.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.coding.subject.application.convert.SubjectCategoryDTOConverter;
import com.coding.subject.application.dto.SubjectCategoryDTO;
import com.coding.subject.common.entity.Result;
import com.coding.subject.domain.entity.SubjectCategoryBO;
import com.coding.subject.domain.service.SubjectCategoryDomainService;

import com.google.common.base.Preconditions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/subject/category")
@Slf4j
public class SubjectCategoryController {
    @Resource
    private SubjectCategoryDomainService subjectCategoryDomainService;
    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody SubjectCategoryDTO subjectCategoryDTO){
        try{
            if(log.isInfoEnabled()){
                log.info("SubjectCategoryController.add.dto:{}", JSON.toJSONString(subjectCategoryDTO));
            }
            Preconditions.checkNotNull(subjectCategoryDTO.getCategoryType(), "分类类型不能为空");
            Preconditions.checkArgument(StringUtils.isBlank(subjectCategoryDTO.getCategoryName()), "分类名称不能为空");
            Preconditions.checkNotNull(subjectCategoryDTO.getParentId(), "分类父级id不能为空");
            SubjectCategoryBO subjectCategoryBO = SubjectCategoryDTOConverter.INSTANCE.convertDtoToCategoryBo(subjectCategoryDTO);
            subjectCategoryDomainService.add(subjectCategoryBO);
            return Result.ok(true);
        }catch (Exception e){
            log.error("SubjectCategoryController.add.error:{}", e.getMessage());
            return Result.fail(e.getMessage());
        }

    }
}
