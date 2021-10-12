docker kill selenoid selenoid-ui > /dev/null 2>&1
docker rm selenoid selenoid-ui > /dev/null 2>&1
docker-compose down -d
docker-compose up -d