package com.uruburu.treasuebin.treasure;

import com.uruburu.treasuebin.treasure.DTO.TreasureDraft;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
