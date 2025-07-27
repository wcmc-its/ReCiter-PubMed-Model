package reciter.model.pubmed;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;


/**
 * Represents the Medline Citation  date (year, month, day) of a PubMed article.
 * @author ved4006
 */

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationDate {
    
    /** The year. */
    private String year;
    
    /** The month. */
    private String month;
    
    /** The day. */
    private String day;
}
