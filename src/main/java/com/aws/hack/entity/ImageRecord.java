package com.aws.hack.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "image_record")
@Access(value = AccessType.FIELD)
public class ImageRecord implements Persistable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "property_id")
    private String propertyId;

    @Column(name = "image_url")
    private String imageURL;

    @Column(name = "image_features")
    private String imageFeatures;


    @Column(name = "timestamp")
    @CreatedDate
    private long timestamp = new Date().getTime();

    public Long getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return id == 0;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }


    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getImageFeatures() {
        return imageFeatures;
    }

    public void setImageFeatures(String imageFeatures) {
        this.imageFeatures = imageFeatures;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
