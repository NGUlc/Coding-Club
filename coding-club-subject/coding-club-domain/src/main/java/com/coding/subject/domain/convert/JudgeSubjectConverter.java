package com.coding.subject.domain.convert;

import com.coding.subject.domain.entity.SubjectAnswerBO;
import com.coding.subject.domain.entity.SubjectInfoBO;
import com.coding.subject.infra.basic.entity.SubjectJudge;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface JudgeSubjectConverter {

    JudgeSubjectConverter INSTANCE = Mappers.getMapper(JudgeSubjectConverter.class);

    SubjectJudge convertBoToEntity(SubjectInfoBO subjectInfoBO);

    List<SubjectAnswerBO> convertEntityToBoList(List<SubjectJudge> result);
}
