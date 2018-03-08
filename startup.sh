#!/usr/bin/env bash
sudo docker-compose stop
sudo docker-compose down

mvn package -f ./docker-springboot-mysql/pom.xml -Dmaven.test.skip=true
sudo docker-compose up --build