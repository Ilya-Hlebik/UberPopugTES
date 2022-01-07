#!/bin/bash

echo "Performing a clean Maven build"
./mvnw clean package -DskipTests=true

echo "Building the Eureka server"
cd eureka-server
docker build --tag popug-eureka-server .
cd ..

echo "Building the Gateway"
cd gateway-server
docker build --tag popug-gateway-service .
cd ..

echo "Building the Service"
cd secured-service
docker build --tag popug-secured-service .
cd ..
docker-compose up
