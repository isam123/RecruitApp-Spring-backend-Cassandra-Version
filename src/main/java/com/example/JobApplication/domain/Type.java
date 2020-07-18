package com.example.JobApplication.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
//@AllArgsConstructor
@Table(value = "Employment_type")
public class Type  {
    @PrimaryKey
    private UUID Id;
}
