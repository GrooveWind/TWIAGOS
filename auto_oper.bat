@echo off
title Update project version and deploy to nexus
rem color 02

set snapshotUrl=http://localhost:8081/nexus/content/repositories/snapshots/
set snapshotId=snapshots

set curdir=%~dp0
echo ���뵱ǰ·��: %curdir%

set /p currVersion=���������İ汾��:


echo ======================= ��ʼ���°汾�� =======================
echo;
rem call mvn versions:set -DnewVersion=%currVersion%
echo;
echo ======================= ���°汾����� =======================

choice /C YN /M "����ʮ���Ӽ��ʱ��������gateway��market����Ŀ������������ִ�������밴 Y,��ִ�������밴 N"  /D Y /T 600
if errorlevel 2 goto end

echo ======================= ��ʼ���͸�pom��maven�ֿ� =======================
echo;
call mvn deploy:deploy-file -DgroupId=com.dscloud.open -DartifactId=dscloud_open -DpomFile=pom.xml -Dfile=%curdir%\pom.xml -Durl=%snapshotUrl% -DrepositoryId=%snapshotId%
echo;
echo ======================= ��pom���ͽ��� =======================
echo;


echo ======================= ��ʼ����common��Ŀ�ļ���maven�ֿ� =======================
echo;
cd dscloud_open_commons
rem call mvn deploy:deploy-file -DgroupId=com.dscloud.open -DartifactId=dscloud_open_commons -DpomFile=pom.xml -Dfile=%curdir%\dscloud_open_commons\pom.xml -Durl=%snapshotUrl% -DrepositoryId=%snapshotId%
cd dscloud_open_global_common
call mvn clean deploy
cd ../dscloud_open_dao_common
call mvn clean deploy
cd ../dscloud_open_server_common
call mvn clean deploy
cd %curdir%
echo;
echo ======================= ����common��Ŀ�ļ����ͽ��� =======================
echo;


echo ======================= ��ʼ����front��Ŀ�ļ���maven�ֿ� =======================
echo;
cd dscloud_open_front_server
rem call mvn deploy:deploy-file -DgroupId=com.dscloud.open -DartifactId=dscloud_open_front_server -DpomFile=pom.xml -Dfile=%curdir%\dscloud_open_front_server\pom.xml -Durl=%snapshotUrl% -DrepositoryId=%snapshotId%
cd dscloud_open_front_service
call mvn clean deploy
cd %curdir%
echo;
echo ======================= ����front��Ŀ�ļ����ͽ��� =======================
echo;


echo ======================= ��ʼ����deal��Ŀ�ļ���maven�ֿ� =======================
echo;
cd dscloud_open_deal_server
rem call mvn deploy:deploy-file -DgroupId=com.dscloud.open -DartifactId=dscloud_open_deal_server -DpomFile=pom.xml -Dfile=%curdir%\dscloud_open_deal_server\pom.xml -Durl=%snapshotUrl% -DrepositoryId=%snapshotId%
cd dscloud_open_deal_service
call mvn clean deploy
cd %curdir%
echo;
echo ======================= ����deal��Ŀ�ļ����ͽ��� =======================
echo;


echo ======================= ��ʼ����account��Ŀ�ļ���maven�ֿ� =======================
echo;
cd dscloud_open_account_server
rem call mvn deploy:deploy-file -DgroupId=com.dscloud.open -DartifactId=dscloud_open_account_server -DpomFile=pom.xml -Dfile=%curdir%\dscloud_open_account_server\pom.xml -Durl=%snapshotUrl% -DrepositoryId=%snapshotId%
cd dscloud_open_account_service
call mvn clean deploy
cd %curdir%
echo;
echo ======================= ����account��Ŀ�ļ����ͽ��� =======================
echo;


:end
echo good bye
pause