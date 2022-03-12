kubectl apply -f confimap.yaml
helm repo update
helm repo add bitnami https://charts.bitnami.com/bitnami
helm install grafana bitnami/grafana -f values.yaml --namespace monitoring
kubectl get secret grafana-admin --namespace monitoring -o jsonpath="{.data.GF_SECURITY_ADMIN_PASSWORD}" | base64 --decode
