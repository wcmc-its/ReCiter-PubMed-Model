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
 * The Class MedlineCitationMeshHeadingBuilder.
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationMeshHeading {
    
    /** The descriptorname. */
    private MedlineCitationMeshHeadingDescriptorName descriptorname;
    
    /** The qualifiernamelist. */
    private List<MedlineCitationMeshHeadingQualifierName> qualifiernamelist;
}
