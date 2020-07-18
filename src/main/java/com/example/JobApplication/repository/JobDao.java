package com.example.JobApplication.repository;

import com.example.JobApplication.domain.Job;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface JobDao extends CassandraRepository<Job, UUID> {
        List<Job> findJobByTitleLike(String title);
}
