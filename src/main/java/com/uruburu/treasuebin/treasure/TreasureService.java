package com.uruburu.treasuebin.treasure;

import com.nimbusds.openid.connect.sdk.assurance.evidences.attachment.Attachment;
import com.nimbusds.openid.connect.sdk.assurance.evidences.attachment.AttachmentType;
import com.uruburu.treasuebin.treasure.DTO.TreasureDraft;
import com.uruburu.treasuebin.treasure.Entity.Treasure;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service@Transactional
@RequiredArgsConstructor
public class TreasureService {


    private TreasureRepository treasureRepository;
    public Long newTreasure(TreasureDraft treasureDraft){
        Treasure treasure = makeNewTreasure(treasureDraft);
        return treasureRepository.save(treasure).getId();
    }

    private Treasure makeNewTreasure(TreasureDraft treasureDraft) {
        return Treasure.builder()

                .build();
    }


}
