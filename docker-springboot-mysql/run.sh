#!/bin/bash
while  ! exec 6<>/dev/tcp/database/3306; do
    echo "Trying to connect to MySQL at ${MYSQL_PORT}..."
    sleep 10
done

java -Djava.security.egd=file:/dev/./urandom -jar /app.jar