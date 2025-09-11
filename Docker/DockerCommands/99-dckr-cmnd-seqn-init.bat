REM	Delete everything in Docker Desktop
REM	docker network prune -f
REM	for /F %i in ('docker images -a -q') do docker rmi -f %i
REM	docker system prune -a --volumes
REM	pause

REM	docker stop $(docker ps -a -q)
REM	docker rm $(docker ps -a -q)
REM	docker rmi -f $(docker images -q)
REM	docker system prune --all --volumes

REM	Build the mysql image and pause
docker image build --file D:\01_new\05_proj\Hsng_Scty_Mgmt\HsngSctyRootSrvc\Dockerfile-root-mysql --tag dckr-imge-hsng-scty-root-mysql:latest D:\01_new\05_proj\Hsng_Scty_Mgmt\HsngSctyRootSrvc
pause

REM	Build the root application image and pause
docker image build --no-cache --file D:\01_new\05_proj\Hsng_Scty_Mgmt\HsngSctyRootSrvc\Dockerfile-root-appl --tag dckr-imge-hsng-scty-root-appl:latest D:\01_new\05_proj\Hsng_Scty_Mgmt\HsngSctyRootSrvc
pause

REM	List all images and pause
docker images -a
pause

REM	Create a new MySQL docker container from the image from dockerhub and pause
REM	docker create --name dckr-cntr-hsng-scty-root-mysql^
REM	-p 3306:3306^
REM	--network dckr-ntwk-hsng-scty^
REM	 -e MYSQL_ROOT_PASSWORD=rootPassword^
REM	 -e MYSQL_DATABASE=MYSQL_DB_HSNG_SCTY_ROOT^
REM	 -e MYSQL_USER=hsngSctyRootUser^
REM	 -e MYSQL_PASSWORD=userPassword^
REM	 -v D:\01_new\05_proj\Hsng_Scty_Mgmt\HsngSctyRootSrvc\HSNG_SCTY_ROOT_DATA_MYSQL:/var/lib/hsngsctyproot/data^
REM	 mysql:8.0^
	
REM	Create a new root application docker container from the image from the above step and pause
REM	docker create --name dckr-cntr-hsng-scty-root-appl^
REM		-p 4000:4000^
REM		--network dckr-ntwk-hsng-scty^
REM		-e SPRING_DATASOURCE_URL=jdbc:mysql://dckr-cntr-hsng-scty-root-mysql:3306/MYSQL_DB_HSNG_SCTY_ROOT^
REM		-e SPRING_DATASOURCE_USERNAME=hsngSctyRootUser^
REM		-e SPRING_DATASOURCE_PASSWORD=userPassword^
REM		-e SPRING_JPA_HIBERNATE_DDL_AUTO=update^
REM		-e SPRING_SQL_INIT_MODE=always^
REM		dckr-imge-hsng-scty-root-appl:latest
REM	pause

REM	List all containers and pause
REM	docker container ls -a

REM	Run the mysql container and pause
REM	docker start dckr-cntr-hsng-scty-root-mysql
REM	pause

REM	Run the root appl container and pause
REM	docker start dckr-cntr-hsng-scty-root-appl
REM	pause
REM	cls

