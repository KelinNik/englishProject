package com.englishproject.core.mappers;

import com.englishproject.core.dto.EnWordDTO;
import com.englishproject.core.dto.EnWordDTO.EnWordDTOBuilder;
import com.englishproject.core.model.EnWord;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-19T12:22:05+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.3.jar, environment: Java 11.0.3 (JetBrains s.r.o)"
)
@Component
public class EnWordMapperImpl implements EnWordMapper {

    @Override
    public EnWordDTO toDTO(EnWord enWord) {
        if ( enWord == null ) {
            return null;
        }

        EnWordDTOBuilder enWordDTO = EnWordDTO.builder();

        enWordDTO.id( enWord.getId() );
        enWordDTO.meaning( enWord.getMeaning() );

        return enWordDTO.build();
    }
}
