kubectl create namespace monitoring
kubectl config set-context --current --namespace=monitoring
helm repo add prometheus-community https://prometheus-community.github.io/helm-charts
helm repo update
helm install my-release prometheus-community/prometheus
