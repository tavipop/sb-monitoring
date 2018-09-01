curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://p5589.softvision.ro:8080/api/persons

curl -i -H "Accept: application/stream+json" -H "Content-Type: application/stream+json" -X GET http://p5589.softvision.ro:8080/api/persons



curl -i -H "Accept: application/json" -X GET http://localhost:8080/actuator/metrics