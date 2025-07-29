package reciter.model.pubmed;

/**
 * Represents a chemical substance associated with a Medline journal article.
 * Includes registry information and standardized substance identifiers.
 * @author ved4006
 */
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

/**
 * MedlineCitationChemical class holds medline citation chemical information.
 * @author ved4006
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationChemical {

	  /** The unique registry number assigned to the chemical substance. */
    private String registrynumber;
    
    /** The name of the chemical substance. */
    private String nameofsubstance;
    
    /**
     * The unique identifier (UI) for the substance name,
     */
    private String nameofsubstanceui;
}
