# spring-grafana-prometheus
- prometheus server: http://my-release-prometheus-server:80
- dashboard import: 4701
- instalado o minikube
- Seguir a ordem para deploy da app:
  - build.sh
  - deploy_prometheus.sh
  - grafana/grafana.sh
  - kubectl apply -f ./k8s/deployment.yaml
  
  
