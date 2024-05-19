package com.coding.subject.domain.convert;

import com.coding.subject.domain.entity.SubjectAnswerBO;
import com.coding.subject.domain.entity.SubjectInfoBO;
import com.coding.subject.infra.basic.entity.SubjectBrief;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BriefSubjectConverter {

    BriefSubjectConverter INSTANCE = Mappers.getMapper(BriefSubjectConverter.class);

    SubjectBrief convertBoToEntity(SubjectInfoBO subjectInfoBO);
}
