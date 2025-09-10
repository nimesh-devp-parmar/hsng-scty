docker network prune -f
for /F %i in ('docker images -a -q') do docker rmi -f %i
docker system prune -a --volumes
