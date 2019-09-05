$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TruNarrativeTeam.feature");
formatter.feature({
  "line": 1,
  "name": "TruNarrative Team",
  "description": "\r\nAs a user\r\nI want to search the TruNarrative website\r\nSo that I can find the leadership team",
  "id": "trunarrative-team",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "The TruNarrative team members are displayed when searching via Google",
  "description": "",
  "id": "trunarrative-team;the-trunarrative-team-members-are-displayed-when-searching-via-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I search for TruNarrative on Google",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on the link for the TruNarrative website",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I navigate to the TruNarrative leadership team page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "there are 8 people in the leadership team",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "the following names have the following roles:",
  "rows": [
    {
      "cells": [
        "John Lord",
        "Founder \u0026 CEO"
      ],
      "line": 13
    },
    {
      "cells": [
        "David Eastaugh",
        "Chief Technology Officer"
      ],
      "line": 14
    },
    {
      "cells": [
        "Nicola Janney",
        "Human Resources Manager"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "TruNarrative",
      "offset": 13
    }
  ],
  "location": "TruNarrativeTeamStepDefinitions.searchOnGoogle(String)"
});
formatter.result({
  "duration": 6975332800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TruNarrative",
      "offset": 28
    }
  ],
  "location": "TruNarrativeTeamStepDefinitions.clickFirstResultLink(String)"
});
formatter.result({
  "duration": 15975113300,
  "status": "passed"
});
formatter.match({
  "location": "TruNarrativeTeamStepDefinitions.navigateToLeadershipTeamPage()"
});
formatter.result({
  "duration": 6827754000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 10
    }
  ],
  "location": "TruNarrativeTeamStepDefinitions.verifyNumberInTheLeadershipTeam(int)"
});
formatter.result({
  "duration": 32984800,
  "status": "passed"
});
formatter.match({
  "location": "TruNarrativeTeamStepDefinitions.verifyNamesAndRoles(DataTable)"
});
formatter.result({
  "duration": 3074920800,
  "status": "passed"
});
});