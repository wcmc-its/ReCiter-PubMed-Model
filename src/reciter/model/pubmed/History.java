package reciter.model.pubmed;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@DynamoDBDocument
@NoArgsConstructor
@AllArgsConstructor
public class History {
	private List<PubMedPubDate> pubmedPubDate;
}
