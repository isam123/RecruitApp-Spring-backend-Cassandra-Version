package com.example.JobApplication.domain;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Job  {


    @PrimaryKey
    private UUID Id;
    private String title;
    private LocalDate date;
    private List<category> category;

//    public Job(UUID id, String title) {
//        Id = id;
//        this.title = title;
//    }
}
