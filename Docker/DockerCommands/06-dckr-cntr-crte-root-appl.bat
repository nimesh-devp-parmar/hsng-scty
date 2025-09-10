docker create --name dckr-cntr-hsng-scty-root-appl^
-p 4000:4000^
--network dckr-ntwk-hsng-scty-root^
-e MYSQL_ROOT_PASSWORD=rootPassword^
-e MYSQL_DATABASE=MYSQL_DB_HSNG_SCTY_ROOT^
-e MYSQL_USER=hsngSctyRootUser^
-e MYSQL_PASSWORD=userPassword^
dckr-imge-hsng-scty-root-appl:latest