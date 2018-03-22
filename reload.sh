#!/usr/bin/env bash
mvn package -f ./docker-springboot-mysql/pom.xml -Dmaven.test.skip=true
sudo docker-compose build dockerized
sudo docker-compose push dockerized
sudo docker-compose restart dockerized
