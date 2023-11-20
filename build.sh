mvn clean package -DskipTests
eval $(minikube docker-env)
docker build -t consumer:1.0 .