package com.uruburu.treasuebin.treasure.DTO;

import jakarta.persistence.Lob;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class TreasureDraft {
    private String title;

    private String contents;

    private String fileDirPath;


}
