# Tp-spring-cloud-streams-kafka
1. 
- Télécharger Kafka
- Démarrer Zookeeper
- Démarrer Kafka-server
- Tester avec Kefka-console-producer et kafka-console-consumer

![9](https://user-images.githubusercontent.com/81491934/212872971-b48daf38-8027-47d4-9290-b8f7825cd865.png)

2. Avec Docker (voir https://developer.confluent.io/quickstart/kafka-docker/)
https://www.youtube.com/watch?v=9O1Kuk2xXO8
 - Créer le fichier docker-compose.yml
 - Démarrer les conteneurs docker : zookeeper et kafka-broker
 - Tester avec Kafka-console-producer et kafka-console-consumer
3. 
En Utilisant KAFKA et Stpring Cloud Streams, Créer :
- Un Service Producer KAFKA via un Rest Controler

<img width="960" alt="1" src="https://user-images.githubusercontent.com/81491934/212870454-46a738d3-86a8-4a20-81cc-e6c1ae085437.PNG">

- Un Service Consumer KAFKA

<img width="720" alt="5" src="https://user-images.githubusercontent.com/81491934/212869460-ff75c43d-5526-44d3-8499-24474b89f3ae.PNG">

- Un Service Supplier KAFKA

- Un Service de Data Analytics Real Time Stream Processing avec Kaflka Streams

<img width="960" alt="7" src="https://user-images.githubusercontent.com/81491934/212867030-2a3a5b4c-44b0-4d00-a885-424ac4e57ece.PNG">

- Une application Web qui permet d'afficher les résultats du Stream Data Analytics en temps réel

<img width="960" alt="8" src="https://user-images.githubusercontent.com/81491934/212865751-5b79d38b-1124-4242-bea6-d6cab9713430.PNG">
