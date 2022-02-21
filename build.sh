#!/bin/bash

echo "Performing a clean Maven build"
./mvnw clean package -DskipTests=true

echo "Building the popug-eureka-server"
cd eureka-server
docker build --tag popug-eureka-server .
cd ..

echo "Building the popug-gateway-service"
cd gateway-server
docker build --tag popug-gateway-service .
cd ..

echo "Building the popug-task-tracker"
cd task-tracker
docker build --tag popug-task-tracker .
cd ..
docker-compose up
