package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

/**
 * The Class MedlineCitationMeshHeadingDescriptorNameBuilder.
 * @author ved4006
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationMeshHeadingDescriptorName {

    /** The majortopicyn. */
    private MedlineCitationYNEnum majortopicyn;
    
    /** The descriptorname. */
    private String descriptorname;
    
    /** The descriptornameui. */
    private String descriptornameui;
}
