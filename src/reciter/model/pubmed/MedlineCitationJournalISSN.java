package reciter.model.pubmed;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Builder
@Getter
@Setter
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDBDocument
@DynamoDBTypeConvertedEnum
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationJournalISSN {

    private String issntype;
    private String issn;
    
    public enum IssnType {
        ELECTRONIC,
        PRINT,
        UNDETERMINED,
        LINKING
    }
}
