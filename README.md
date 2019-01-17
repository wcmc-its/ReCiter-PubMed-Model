# ReCiter-PubMed-Model

![Build Status](https://codebuild.us-east-1.amazonaws.com/badges?uuid=eyJlbmNyeXB0ZWREYXRhIjoiME5LMmk2MXdTM2ZocFBTOGFQWUl6V3dqQXVVeTNNT0d6a3g2aG5URksvamdFejFaRm5aamFhcjVHSXRzWTNBSlp5OUdURWFHWlhNWHNUbTNQOE5FTEtJPSIsIml2UGFyYW1ldGVyU3BlYyI6ImNHUUtpQVFVMkpBUE1WdTgiLCJtYXRlcmlhbFNldFNlcmlhbCI6MX0%3D&branch=master)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/edu.cornell.weill.reciter/reciter-pubmed-model/badge.svg)](https://maven-badges.herokuapp.com/maven-central/edu.cornell.weill.reciter/reciter-pubmed-model)
[![GitHub version](https://badge.fury.io/gh/wcmc-its%2FReCiter-PubMed-Model.svg)](https://badge.fury.io/gh/wcmc-its%2FReCiter-PubMed-Model)
[![codebeat badge](https://codebeat.co/badges/d39fa0d6-c4c2-444d-b811-1db6a801c198)](https://codebeat.co/projects/github-com-wcmc-its-reciter-pubmed-model-master)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![Pending Pull-Requests](http://githubbadges.herokuapp.com/wcmc-its/ReCiter-PubMed-Model/pulls.svg?style=flat)](https://github.com/wcmc-its/ReCiter-PubMed-Model/pulls)
[![Open Issues](http://githubbadges.herokuapp.com/wcmc-its/ReCiter-PubMed-Model/issues.svg?style=flat)](https://github.com/wcmc-its/ReCiter-PubMed-Model/issues)
[![star this repo](http://githubbadges.com/star.svg?user=wcmc-its&repo=ReCiter-PubMed-Model&style=flat)](https://github.com/wcmc-its/ReCiter-PubMed-Model)
[![fork this repo](http://githubbadges.com/fork.svg?user=wcmc-its&repo=ReCiter-PubMed-Model&style=flat)](https://github.com/wcmc-its/ReCiter-PubMed-Model/fork)
[![Github All Releases](https://img.shields.io/github/downloads/wcmc-its/ReCiter-PubMed-Model/total.svg)]()
[![Open Source Love](https://badges.frapsoft.com/os/v3/open-source.svg?v=102)](https://github.com/wcmc-its/ReCiter-PubMed-Model/) 


## Data model

The following is a sample record from DynamoDB for the Identity table.

```
{
  "pmid": 30254045,
  "pubmedarticle": {
    "medlinecitation": {
      "article": {
        "articledate": {
          "day": "25",
          "month": "09",
          "year": "2018"
        },
        "articletitle": "Teaching Manually Assisted Cough to Caregivers of Children With Neuromuscular Disease.",
        "authorlist": [
          {
            "affiliation": "School of Physiotherapy, Australian Catholic University, North Sydney, New South Wales, Australia. amelia_kan@outlook.com.",
            "forename": "Amelia F",
            "initials": "AF",
            "lastname": "Kan"
          },
          {
            "affiliation": "School of Physiotherapy, Australian Catholic University, North Sydney, New South Wales, Australia.",
            "forename": "Jane M",
            "initials": "JM",
            "lastname": "Butler"
          },
          {
            "affiliation": "Department of Physiotherapy, The Children's Hospital at Westmead, Westmead, New South Wales, Australia; Institute for Neuroscience and Muscle Research, Children's Hospital at Westmead, Westmead, New South Wales, Australia.",
            "forename": "Meghan",
            "initials": "M",
            "lastname": "Hutchence"
          },
          {
            "affiliation": "Disciplines of Genetics and Paediatrics, Sydney Medical School, University of Sydney, Sydney, New South Wales, Australia; Department of Clinical Genetics, The Children's Hospital at Westmead, Westmead, New South Wales, Australia; Neurogenetics/Neuromuscular Clinical Service, The Children's Hospital at Westmead, Westmead, New South Wales, Australia; Clinical Trials Unit, Institute for Neuroscience and Muscle Research, Children's Hospital at Westmead, Westmead, New South Wales, Australia.",
            "forename": "Kristi",
            "initials": "K",
            "lastname": "Jones"
          },
          {
            "affiliation": "Department of Respiratory Medicine, Sydney Children's Hospital Network, Randwick, New South Wales, Australia; Discipline of Paediatrics, School of Women and Children's Health, University of New South Wales, Randwick, New South Wales, Australia.",
            "forename": "John",
            "initials": "J",
            "lastname": "Widger"
          },
          {
            "affiliation": "Department of Physiotherapy, Sydney Children's Hospital Network, Randwick, New South Wales, Australia; School of Women's and Children's Health, University of New South Wales, Randwick, New South Wales, Australia.",
            "forename": "Michael A",
            "initials": "MA",
            "lastname": "Doumit"
          }
        ],
        "elocationid": {
          "elocationid": "10.4187/respcare.06213"
        },
        "journal": {
          "isoAbbreviation": "Respir Care",
          "issn": [
            {
              "issn": "1943-3654",
              "issntype": "Electronic"
            },
            {
              "issn": "0020-1324",
              "issntype": "Linking"
            }
          ],
          "journalissue": {
            "issue": "12",
            "pubdate": {
              "month": "12",
              "year": "2018"
            },
            "volume": "63"
          },
          "title": "Respiratory care"
        },
        "pagination": {
          "medlinepgns": [
            "1520-1527"
          ]
        },
        "publicationAbstract": {
          "abstractTexts": [
            {
              "abstractText": "Cough augmentation techniques are taught by health-care providers to improve secretion clearance and to help prevent respiratory infections in children with neuromuscular disease. There is some evidence of the effectiveness of a manually assisted cough when applied by health-care providers. However, it is unknown whether parents and caregivers may also be effective in applying manually assisted cough. The aim of this study was to evaluate whether parents and caregivers are effective at applying a manually assisted cough to a child with neuromuscular disease after being taught by a health-care provider.",
              "abstractTextLabel": "BACKGROUND",
              "abstractTextNlmCategory": "BACKGROUND"
            },
            {
              "abstractText": "For this prospective cohort study, children and their parents or caregivers were recruited from neuromuscular clinics in the Sydney Children's Hospitals Network. Cough peak flow was the outcome measure for the strength of the child's cough. Children were eligible to participate if their unassisted cough peak flow at baseline was <270 L/min. Parents and caregivers were taught a manually assisted cough by a physiotherapist before being measured. The cough peak flow was measured in the following order: (1) during an unassisted cough as baseline, (2) during a manually assisted cough performed by a physiotherapist, (3) during a manually assisted cough performed by a parent or caregiver, and (4) during an unassisted cough after intervention.",
              "abstractTextLabel": "METHODS",
              "abstractTextNlmCategory": "METHODS"
            },
            {
              "abstractText": "Twenty-eight children (24 boys, 4 girls; mean ± SD age, 12 ± 3 y) completed the study. No clinically or statistically significant changes were found in the cough peak flow after the application of a manually assisted cough by parents or caregivers (95% CI -11 to 11 L/min) or by physiotherapists (95% CI -6 to 14 L/min).",
              "abstractTextLabel": "RESULTS",
              "abstractTextNlmCategory": "RESULTS"
            },
            {
              "abstractText": "Parents and caregivers and health-care providers were ineffective at increasing cough peak flow in children with neuromuscular weakness when applying a manually assisted cough. A single training session was insufficient for a parent or caregiver to be able to apply a manually assisted cough effectively on his or her child with neuromuscular weakness. Further research is warranted to guide recommendations on how best to equip parents and caregivers with the skills to help manage children with neuromuscular disease.",
              "abstractTextLabel": "CONCLUSIONS",
              "abstractTextNlmCategory": "CONCLUSIONS"
            }
          ],
          "copyrightInformation": "Copyright © 2018 by Daedalus Enterprises."
        },
        "publicationtypelist": [
          {
            "publicationtype": "Journal Article"
          }
        ]
      },
      "keywordlist": {
        "keywordlist": [
          {
            "keyword": "cough augmentation"
          },
          {
            "keyword": "cough peak flow"
          },
          {
            "keyword": "manually assisted cough"
          },
          {
            "keyword": "neuromuscular disease"
          }
        ]
      },
      "medlinecitationpmid": {
        "pmid": 30254045
      }
    },
    "pubmeddata": {
      "history": {
        "pubmedPubDate": [
          {
            "pubMedPubDate": {
              "day": "27",
              "month": "9",
              "year": "2018"
            },
            "pubStatus": "pubmed"
          },
          {
            "pubMedPubDate": {
              "day": "27",
              "month": "9",
              "year": "2018"
            },
            "pubStatus": "medline"
          },
          {
            "pubMedPubDate": {
              "day": "27",
              "month": "9",
              "year": "2018"
            },
            "pubStatus": "entrez"
          }
        ]
      }
    }
  }
}
```
