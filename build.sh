eval $(minikube -p minikube docker-env)
mvn clean install spring-boot:build-image
docker push fabricio211/simple:0.0.2-SNAPSHOT
