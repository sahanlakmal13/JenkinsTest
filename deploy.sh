docker kill selenoid selenoid-ui > /dev/null 2>&1
docker rm selenoid selenoid-ui > /dev/null 2>&1
docker-compose -f docker-compose.yml up
