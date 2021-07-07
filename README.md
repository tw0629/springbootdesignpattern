# springbootdesignpattern
Design Patterns


# ！！！  设计模式之美
# 待总结 ？？？
# 待总结 ？？？
# 待总结 ？？？
https://time.geekbang.org/column/article/218375









步骤一
https://open.weixin.qq.com/connect/qrconnect?appid=wxd8936345ec1df5ac&redirect_uri=https%3A%2F%2Fsegmentfault.com%2Fuser%2Foauth%2Fweixin&response_type=code&scope=snsapi_login#wechat_redirect
==
https://open.weixin.qq.com/connect/qrconnect?
appid=wxd8936345ec1df5ac
&redirect_uri=https://segmentfault.com/user/oauth/weixin (%3A%2F%2F=://)
&response_type=code
&scope=snsapi_login#wechat_redirect


步骤二
客户端扫描,访问地址：
https://open.weixin.qq.com/connect/confirm?uuid=081i3CTTw6o8PSt6
https://open.weixin.qq.com/connect/confirm?uuid=001cMzpAFTQqkl8f

==每次刷新后都会改变,这样可以保证一个uid只可以绑定一个账号和密码，确定登录用户的唯一性

登录成功以后，微信服务器就会回调到第三方网站提供的redirect_uri,做一些登录以后的事情(如绑定,访问网站等等逻辑）

通过查看网页源码，这个页面在加载完毕时，已经把很多登录后才需要的相关资源都预先加载进来了，所以登录用户得到确认后展示用户信息的速度很快。


步骤三     uid和token ---> 服务器的令牌】
当用户使用登录后的微信扫描二维码的时候，会将uid和手机微信产生的token进行绑定，并上传到服务器。
这个时候，浏览器通过长轮询查询到uid扫描记录，立即得到201响应码，然后通知服务器，客户端由此也进入一个新的页面（就是那个要你点确认的按钮）。
在客户端点击确认后，获得服务器授信的令牌，进行随后的信息交互过程。





