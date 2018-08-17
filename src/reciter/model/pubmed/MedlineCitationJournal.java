package reciter.model.pubmed;

import java.util.List;

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
public class MedlineCitationJournal {

    private List<MedlineCitationJournalISSN> issn;
    private MedlineCitationJournalIssue journalissue;
    private String title;
    private String isoAbbreviation;
}
