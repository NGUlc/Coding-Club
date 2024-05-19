package com.coding.subject.domain.convert;

import com.coding.subject.domain.entity.SubjectAnswerBO;
import com.coding.subject.domain.entity.SubjectInfoBO;
import com.coding.subject.domain.handler.subject.MultipleTypeHandler;
import com.coding.subject.infra.basic.entity.SubjectMultiple;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MultipleSubjectConverter {

    MultipleSubjectConverter INSTANCE = Mappers.getMapper(MultipleSubjectConverter.class);

    SubjectMultiple convertBoToEntity(SubjectAnswerBO subjectAnswerBO);

    List<SubjectAnswerBO> convertEntityToBoList(List<SubjectMultiple> result);
}
