package com.uruburu.treasuebin.treasure.Entity;


import jakarta.persistence.*;
import lombok.*;

@Getter@Setter@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SequenceGenerator(
        name="ATTACHMENT_SEQ_GENERATOR",
        sequenceName = "ATTACHMENT_SEQ"
)

public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String originalFilename;
    private String storeFilename;

    @Enumerated(EnumType.STRING)
    private AttachmentType attachmentType;

    @Builder
    public Attachment(Long id, String originalFilename, String storePath, AttachmentType attachmentType){
        this.id = id;
        this.originalFilename = originalFilename;
        this.storeFilename = storePath;
        this.attachmentType = attachmentType;
    }
}
