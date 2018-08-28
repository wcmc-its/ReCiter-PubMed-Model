package reciter.model.pubmed;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@JsonInclude(Include.NON_EMPTY)
@DynamoDBDocument
@NoArgsConstructor
@AllArgsConstructor
public class MedlineCitationArticlePagination {
    private List<String> medlinepgns;
}
