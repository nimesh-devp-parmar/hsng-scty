docker create --name dckr-cntr-hsng-scty-root-mysql^
-p 3306:3306^
--network dckr-ntwk-hsng-scty-root^
-e MYSQL_ROOT_PASSWORD=rootPassword^
-e MYSQL_DATABASE=MYSQL_DB_HSNG_SCTY_ROOT^
-e MYSQL_USER=hsngSctyRootUser^
-e MYSQL_PASSWORD=userPassword^
-v D:\01_new\05_proj\Hsng_Scty_Mgmt\HsngSctyRootSrvc\HSNG_SCTY_ROOT_DATA_MYSQL:/var/lib/hsngsctyproot/data^
mysql:latest