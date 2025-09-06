docker stop myapp || true
docker rm myapp || true
docker rmi myapp:latest || true

# Build Docker image using the Dockerfile in repo
docker build -t myapp:latest .

# Run container
docker run -d --name myapp -p 9090:9090 myapp:latest
