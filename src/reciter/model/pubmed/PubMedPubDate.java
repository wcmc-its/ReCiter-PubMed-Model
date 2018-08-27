package reciter.model.pubmed;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import reciter.model.pubmed.MedlineCitationJournalISSN.MedlineCitationJournalISSNBuilder;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDBDocument
@NoArgsConstructor
@AllArgsConstructor
public class PubMedPubDate {
	private MedlineCitationDate pubMedPubDate;
	private String pubStatus;
}
