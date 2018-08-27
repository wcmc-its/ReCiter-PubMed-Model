package reciter.model.pubmed;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDBDocument
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationJournalIssue {

    private String citedmedium;
    private String volume;
    private String issue;
    private MedlineCitationDate pubdate;
    private String medlineDate;

    private enum CitedMedium {
        INTERNET,
        PRINT
    }
}
