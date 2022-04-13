package com.etiya.cqrsWithCleanArchitecture.ws.models;

import lombok.Data;

@Data
public class CreateCourseModel {
    private String courseId;

    private String courseName;
}
