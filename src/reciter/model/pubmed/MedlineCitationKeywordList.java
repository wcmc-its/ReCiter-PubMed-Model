package reciter.model.pubmed;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

/**
 * The Class MedlineCitationKeywordListBuilder.
 * @author ved4006
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationKeywordList {
    
    /** The keywordlistowner. */
    private String keywordlistowner;
    
    /** The keywordlist. */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<MedlineCitationKeyword> keywordlist;

    /**
     * The Enum KeywordListOwner.
     */
    private enum KeywordListOwner {
        
        /** The nasa. */
        NASA,
        
        /** The pip. */
        PIP,
        
        /** The kie. */
        KIE,
        
        /** The nlm. */
        NLM,
        
        /** The notnlm. */
        NOTNLM,
        
        /** The hhs. */
        HHS
    }
}
