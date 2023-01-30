curl -X GET --location "http://localhost:8080/case-types/cases?from=2018-01-01&to=2022-01-31"

curl -X GET --location "http://localhost:8080/parties/cases?caseState=CLOSED&active=false"