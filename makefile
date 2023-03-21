usage:
	@echo "======================================================================="
	@echo " usage   =>  打印本菜单"
	@echo " clean   =>  清理本项目"
	@echo " compile =>  重新编译本项目"
	@echo " package =>  打包本项目"
	@echo " github  =>  推送源码"
	@echo "======================================================================="

clean:
	@mvn clean -q

compile:
	@mvn clean compile

package:
	@mvn clean package

github: clean
	@git status
	@git add .
	@git commit -m "$(shell /bin/date "+%F %T")"

.PHONY: usage clean compile package github