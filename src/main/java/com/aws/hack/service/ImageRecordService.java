package com.aws.hack.service;

import com.aws.hack.entity.ImageRecord;
import com.aws.hack.repository.ImageRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ImageRecordService {
    @Autowired
    private ImageRecordRepo imageRecordRepo;

    public void submitDetails(ImageRecord record) throws Exception {
        //TODO validation
        imageRecordRepo.save(record);
    }
}
