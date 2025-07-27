package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

// TODO: Auto-generated Javadoc
/**
 * The Class MedlineCitationPublicationTypeBuilder.
 * @author ved4006
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationPublicationType {
    
    /** The publicationtypeui. */
    private String publicationtypeui;
    
    /** The publicationtype. */
    private String publicationtype;
}
