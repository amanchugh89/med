package com.aws.hack.repository;

import com.aws.hack.entity.ImageRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ImageRecordRepo extends CrudRepository<ImageRecord, Long> {

    List<ImageRecord> findByPropertyId(String propertyId);

    ImageRecord findById(long id);
}