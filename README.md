# -Window-Centos-
在Window主机上使用Xshell工具连接虚拟机的Centos系统  
原文：[用xshell连接VMware中的Linux](https://blog.csdn.net/n950814abc/article/details/79512834)
## 准备工作
* 下载安装XShell
* 安装好VMware虚拟机l
* 在虚拟机安装好Centos7系统
## 设置linux系统的网络配置类型
  - 在此选择NAT模式（与虚拟机共享主机ip）如下图<tr/>
![图1](https://img-blog.csdn.net/20180311111421981 "选择NAT模式")
  - 查看虚拟机中的网段<br>
  ![图2](https://img-blog.csdn.net/20180311111631614 "查看虚拟机中的网段")
    <br>
  ![图3](https://img-blog.csdn.net/20180311111807906 "查看虚拟机中的网段")
  - 设置linux系统中的静态IP
    * 登录linux系统
    * 输入：ip addr
  ![图4](https://img-blog.csdn.net/20180311114338775 "设置静态IP")
    * 配置网卡，绑定静态IP
      - 打开配置文件eno16777736
      - vi /etc/sysconfig/network-scripts/ifcfg-eno16777736
      ![图5](https://img-blog.csdnimg.cn/20190801081757419.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L245NTA4MTRhYmM=,size_16,color_FFFFFF,t_70 "配置文件")
      - 编辑完成，保存退出
      ```vim
      wq!
      ```
      - 重新启动网卡服务
      ```vim
      service network restart
      ```
## 配置虚拟机的IP
  * 默认网关要和虚拟机中配置的一致
  ![图6](https://img-blog.csdn.net/20180726123601663?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L245NTA4MTRhYmM=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70 "配置虚拟机IP")
##  xshell连接Linux
  * ![图7](https://img-blog.csdn.net/20180311120658688 "xshell连接Linux")
  * 之后输入用户名、密码（这些都是安装Linux时你设置的）
