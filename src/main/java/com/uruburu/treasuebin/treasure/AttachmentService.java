package com.uruburu.treasuebin.treasure;


import com.uruburu.treasuebin.treasure.Entity.Attachment;
import com.uruburu.treasuebin.treasure.Entity.AttachmentType;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class AttachmentService {
    private String newFilename(String originalFilename){
        //이 파일시스템 안에서 사용하는 새로운 이름을 만드는 함수
        return UUID.randomUUID().toString() + extractExt(originalFilename);
    }

    private String extractExt(String originalFilename) {
        //확장자 발라내기. "." 이후의 문자열 잘라내는 로직
        return originalFilename.substring(originalFilename.lastIndexOf("."));
    }

    public Attachment storeFile(MultipartFile multipartFile, AttachmentType attachmentType)throws IOException {
        if(multipartFile.isEmpty())return null;

        String filenameForStore = newFilename(multipartFile.getOriginalFilename());
        multipartFile.transferTo(new File(filenameForStore));

        return Attachment.builder()
                .originalFilename(multipartFile.getOriginalFilename())
                .storePath(filenameForStore)
                .attachmentType(attachmentType)
                .build();


    }
}
