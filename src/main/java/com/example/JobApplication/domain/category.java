package com.example.JobApplication.domain;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;
import java.util.UUID;


@Table("category")
@Data public class category {

    @PrimaryKey
    private UUID Id;
    private String name;
    private List<Job> job_id;


}
