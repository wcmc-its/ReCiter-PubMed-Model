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
public class MedlineCitationArticleELocationID {

    private String eidtype;
    private MedlineCitationYNEnum validyn;
    private String elocationid;

    private enum EIdType {
        DOI,
        PII
    }
}
