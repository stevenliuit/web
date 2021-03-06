package pers.husen.web.common.template.html;

import pers.husen.web.common.constants.CommonConstants;

/**
 * 存放通用的html模板
 *
 * @author 何明胜
 *
 *         2017年10月18日
 */
public class GenericTemplate {
	/**
	 * 通用的html head
	 * @param title
	 * @return
	 */
	public static String htmlHeader(String title, String description, String keyWords) {
		//空格变为英文逗号
		if(keyWords != null && keyWords != "" && keyWords.indexOf(CommonConstants.ENGLISH_COMMA) == -1) {
			keyWords = keyWords.replaceAll("\\s", ",");
		}
		
		String header = ""+
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"UTF-8\">\r\n" + 
				"<title>何明胜的个人网站</title>\r\n" + 
				"\r\n" + 
				"<meta name=\"description\"\r\n" + 
				"	content=\"欢迎来到何明胜的个人网站.本站主要用于记录和分享本人的学习心得和编程经验,并分享常见可复用代码、推荐书籍以及软件等资源.本站源码已托管github,欢迎访问：https://github.com/HelloHusen/web\" />\r\n" + 
				"<meta name=\"keywords\" content=\"何明胜,何明胜的个人网站,何明胜的博客,一格的程序人生\" />\r\n" + 
				"<meta name=\"author\" content=\"何明胜,一格\">\r\n" + 
				"\r\n" + 
				"<!-- 网站图标 -->\r\n" + 
				"<link rel=\"shortcut icon\" href=\"/images/favicon.ico\">";
		
		return header;
	}
	
	/**
	 * 通用的js和css plugins.jsp的内容
	 * @return
	 */
	public static String jsAndCssPlugins() {
		String plugins = "<!-- 插件统一放  -->\r\n" + 
				"<!-- Bootstrap  -->\r\n" + 
				"<link rel=\"stylesheet\" href=\"/plugins/bootstrap/css/bootstrap.min.css\">\r\n" + 
				"<!-- validator -->\r\n" + 
				"<link rel=\"stylesheet\"\r\n" + 
				"	href=\"/plugins/validator/css/bootstrapValidator.min.css\" />\r\n" + 
				"<!-- jquery confirm -->\r\n" + 
				"<link rel=\"stylesheet\"\r\n" + 
				"	href=\"/plugins/jqueryconfirm/css/jquery-confirm.min.css\" />\r\n" + 
				"<!-- 自定义中间内容板块 css -->\r\n" + 
				"<link rel=\"stylesheet\" href=\"/css/navigation/middle.css\">\r\n" + 
				"<!-- 全局css -->\r\n" + 
				"<link rel=\"stylesheet\" href=\"/css/global.css\">\r\n" + 
				"<!-- jQuery -->\r\n" + 
				"<script src=\"/plugins/jquery/js/jquery-3.2.1.min.js\"></script>\r\n" + 
				"<!-- jQuery form -->\r\n" + 
				"<script src=\"/plugins/jquery/js/jquery.form.min.js\"></script>\r\n" + 
				"<!-- JQuery cookie -->\r\n" + 
				"<script src=\"/plugins/jquery/js/jquery.cookie.js\"></script>\r\n" + 
				"<!-- Bootstrap -->\r\n" + 
				"<script src=\"/plugins/bootstrap/js/bootstrap.min.js\"></script>\r\n" + 
				"<!-- validator -->\r\n" + 
				"<script src=\"/plugins/validator/js/bootstrapValidator.min.js\"></script>\r\n" + 
				"<!-- jquery confirm -->\r\n" + 
				"<script src=\"/plugins/jqueryconfirm/js/jquery-confirm.min.js\"></script>\r\n" + 
				"<!-- 登录、注册表单验证  -->\r\n" + 
				"<script src=\"/js/login/formvalidator.js\"></script>\r\n" + 
				"<!-- 自定义开发工具包  -->\r\n" + 
				"<script src=\"/js/customize-sdk.js\"></script>"+
				
				"<!-- 显示markdown,只有显示文章细节才有  -->" +
				"<!-- editor.md -->\r\n" + 
				"<link rel=\"stylesheet\"\r\n" + 
				"	href=\"/plugins/editormd/css/editormd.preview.min.css\" />\r\n" + 
				"<link rel=\"stylesheet\" href=\"/plugins/editormd/css/editormd.min.css\" />\r\n" + 
				"\r\n" + 
				"<!-- editor.md -->\r\n" + 
				"<script src=\"/plugins/editormd/lib/marked.min.js\"></script>\r\n" + 
				"<script src=\"/plugins/editormd/lib/prettify.min.js\"></script>\r\n" + 
				"<script src=\"/plugins/editormd/js/editormd.min.js\"></script>\r\n" + 
				"\r\n" + 
				"<script src=\"/js/article/article-markdown.js\"></script>"; 
		
		return plugins;
	}
	
	/**
	 * 返回head末尾和body开始
	 * @return
	 */
	public static String headBody() {
		return "</head>\r\n" + "<body>";
	}
	
	/**
	 * 导航栏
	 * @return
	 */
	public static String topFixedBar() {
		String topBar = "<!-- 顶部固定导航栏 -->\r\n" + 
				"<link rel=\"stylesheet\" href=\"/css/navigation/topbar.css\">\r\n" + 
				"<script src=\"/js/navigation/topbar.js\"></script>\r\n" + 
				"\r\n" + 
				"<!-- 导航区  -->\r\n" + 
				"<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n" + 
				"	<!-- logo -->\r\n" + 
				"	<div class=\"navbar-header\">\r\n" + 
				"		<a class=\"navbar-brand\" href=\"/\"> <span id=\"trademark\"\r\n" + 
				"			class=\"glyphicon glyphicon-header\"></span>\r\n" + 
				"		</a>\r\n" + 
				"	</div>\r\n" + 
				"	<!-- 访问统计  -->\r\n" + 
				"	<div class=\"access-statistics\">\r\n" + 
				"		<label id=\"txt_accessToday\"></label> <label id=\"txt_accessTotal\"></label>\r\n" + 
				"		<label id=\"txt_onlineCurrent\"></label>\r\n" + 
				"	</div>\r\n" + 
				"	<div class=\"colmun-nav\">\r\n" + 
				"		<ul class=\"nav nav-pills topbar-nav\">\r\n" + 
				"			<li role=\"presentation\" class=\"active\"><a href=\"/\">首页</a></li>\r\n" + 
				"			<li role=\"presentation\"><a href=\"/topic/blog/\">博客</a></li>\r\n" + 
				"			<li role=\"presentation\"><a href=\"/topic/code/\">代码库</a></li>\r\n" + 
				"			<li role=\"presentation\"><a href=\"/topic/message/\">留言</a></li>\r\n" + 
				"			<li role=\"presentation\"><a href=\"/topic/download/\">下载</a></li>\r\n" + 
				"			<li role=\"presentation\"><a href=\"/topic/contact/\">联系站长</a></li>\r\n" + 
				"		</ul>\r\n" + 
				"	</div>\r\n" + 
				"	<!-- 登录注册 -->\r\n" + 
				"	<div class=\"login-register\">\r\n" + 
				"		<a id=\"loginBtn\" class=\"btn btn-warning btn-sm\" href=\"#\" role=\"button\"\r\n" + 
				"			data-toggle=\"modal\" data-target=\"#login\" href=\"\"> <span\r\n" + 
				"			class=\"glyphicon glyphicon-user\"></span>登录\r\n" + 
				"		</a> <a id=\"registerBtn\" class=\"btn btn-info btn-sm\" href=\"#\"\r\n" + 
				"			role=\"button\" data-toggle=\"modal\" data-target=\"#register\" href=\"\">\r\n" + 
				"			<span class=\"glyphicon glyphicon-log-in\"></span>注册\r\n" + 
				"		</a> <a id=\"persCenterBtn\" class=\"btn btn-success btn-sm\" href=\"#\"\r\n" + 
				"			role=\"button\" data-toggle=\"modal\" data-target=\"#\" href=\"\"> <span\r\n" + 
				"			class=\"glyphicon glyphicon-header\"></span>个人中心\r\n" + 
				"		</a> <a id=\"quitLoginBtn\" class=\"btn btn-primary btn-sm\" href=\"#\"\r\n" + 
				"			role=\"button\" data-toggle=\"modal\" data-target=\"#\" href=\"\"> <span\r\n" + 
				"			class=\"glyphicon glyphicon-log-out\"></span>退出\r\n" + 
				"		</a>\r\n" + 
				"	</div>\r\n" + 
				"	<!-- 其他 -->\r\n" + 
				"	<div class=\"nav-others\">\r\n" + 
				"		<a class=\"btn btn-default btn-sm\" href=\"https://m.hemingsheng.cn/\" role=\"button\"><span\r\n" + 
				"			class=\"glyphicon glyphicon glyphicon-phone\"></span> 手机版</a>\r\n" + 
				"	</div>\r\n" + 
				"</nav>";
		
		return topBar;
	}
	
	/**
	 * 登录注册页面
	 * @return
	 */
	public static String loginAndRegister() {
		String login = "<link rel=\"stylesheet\" href=\"/css/login/login.css\">	\r\n" + 
				"	\r\n" + 
				"<!-- 注册窗口 -->\r\n" + 
				"<div id=\"register\" class=\"modal fade\" tabindex=\"-1\"\r\n" + 
				"	data-backdrop=\"static\" data-keyboard=\"false\">\r\n" + 
				"	<div class=\"modal-dialog\">\r\n" + 
				"		<div class=\"modal-content\">\r\n" + 
				"			<div class=\"modal-body\">\r\n" + 
				"				<button class=\"close\" data-dismiss=\"modal\">\r\n" + 
				"					<span>&times;</span>\r\n" + 
				"				</button>\r\n" + 
				"			</div>\r\n" + 
				"			<div class=\"modal-title\">\r\n" + 
				"				<h1 class=\"text-center login-title\">注册</h1>\r\n" + 
				"			</div>\r\n" + 
				"			<div class=\"modal-body\">\r\n" + 
				"				<div id=\"registerForm\" class=\"form-group\">\r\n" + 
				"					<div class=\"form-group\">\r\n" + 
				"						<label for=\"\">用户名</label> <input name=\"username\"\r\n" + 
				"							id=\"txt_userNameRegister\" class=\"form-control\" type=\"text\"\r\n" + 
				"							placeholder=\"5-15位字母或数字\">\r\n" + 
				"					</div>\r\n" + 
				"					<div class=\"form-group\">\r\n" + 
				"						<label for=\"\">密码</label> <input name=\"password\"\r\n" + 
				"							id=\"txt_userPwdRegister\" class=\"form-control\" type=\"password\"\r\n" + 
				"							placeholder=\"至少6位字母或数字\">\r\n" + 
				"					</div>\r\n" + 
				"					<div class=\"form-group\">\r\n" + 
				"						<label for=\"\">再次输入密码</label> <input name=\"confirmPassword\"\r\n" + 
				"							class=\"form-control\" type=\"password\" placeholder=\"至少6位字母或数字\">\r\n" + 
				"					</div>\r\n" + 
				"					<div class=\"form-group\">\r\n" + 
				"						<label for=\"\">邮箱</label> <input id=\"txt_userEmailRegister\"\r\n" + 
				"							name=\"email\" class=\"form-control\" type=\"text\"\r\n" + 
				"							placeholder=\"例如:123@123.com\">\r\n" + 
				"					</div>\r\n" + 
				"					<div class=\"text-right\">\r\n" + 
				"						<button id=\"btn_submitRegister\" class=\"btn btn-primary\">提交</button>\r\n" + 
				"						<button id=\"btnCancel\" class=\"btn btn-danger\" data-dismiss=\"modal\">取消</button>\r\n" + 
				"					</div>\r\n" + 
				"					<a href=\"\" data-toggle=\"modal\" data-dismiss=\"modal\"\r\n" + 
				"						data-target=\"#login\">已有账号？点我登录</a>\r\n" + 
				"				</div>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" + 
				"	</div>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"<!-- 登录窗口 -->\r\n" + 
				"<div id=\"login\" class=\"modal fade\" data-backdrop=\"static\"\r\n" + 
				"	data-keyboard=\"false\">\r\n" + 
				"	<div class=\"modal-dialog\">\r\n" + 
				"		<div class=\"modal-content\">\r\n" + 
				"			<div class=\"modal-body\">\r\n" + 
				"				<button class=\"close\" data-dismiss=\"modal\">\r\n" + 
				"					<span>&times;</span>\r\n" + 
				"				</button>\r\n" + 
				"			</div>\r\n" + 
				"			<div class=\"modal-title\">\r\n" + 
				"				<h1 class=\"text-center login-title\">登录</h1>\r\n" + 
				"			</div>\r\n" + 
				"			<div class=\"modal-body\">\r\n" + 
				"				<div id=\"loginForm\" class=\"form-group\">\r\n" + 
				"					<div class=\"form-group\">\r\n" + 
				"						<label for=\"\">用户名</label> <input name=\"username\"\r\n" + 
				"							id=\"txt_userNameLogin\" class=\"form-control\" type=\"text\"\r\n" + 
				"							placeholder=\"\">\r\n" + 
				"					</div>\r\n" + 
				"					<div class=\"form-group\">\r\n" + 
				"						<label for=\"\">密码</label> <input id=\"txt_userPwdLogin\"\r\n" + 
				"							name=\"password\" class=\"form-control\" type=\"password\"\r\n" + 
				"							placeholder=\"\">\r\n" + 
				"					</div>\r\n" + 
				"					<div class=\"text-right\">\r\n" + 
				"						<input id=\"btnLogin\" type=\"button\" class=\"btn btn-primary\"\r\n" + 
				"							value=\"登录\"> <input id=\"btnLoginCancel\" type=\"button\"\r\n" + 
				"							class=\"btn btn-danger\" data-dismiss=\"modal\" value=\"取消\">\r\n" + 
				"					</div>\r\n" + 
				"					<a href=\"\" data-toggle=\"modal\" data-dismiss=\"modal\"\r\n" + 
				"						data-target=\"#register\">注册账号</a>\r\n" + 
				"					<a id=\"btn_forgetPwd\" href=\"\" class=\"forget-pwd\" data-dismiss=\"modal\">忘记密码？</a>\r\n" + 
				"				</div>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" + 
				"	</div>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"<!-- 底部版权信息 -->\r\n" + 
				"<nav class=\"navbar-fixed-bottom navbar-bottom\">\r\n" + 
				"	<span class=\"glyphicon glyphicon-copyright-mark\"></span>2017&nbsp;何明胜&nbsp;版权所有&nbsp;渝ICP备16013250号</nav>";
		
		return login;
	}
	
	/**
	 * 左侧导航
	 * @return
	 */
	public static String leftBar() {
		String leftBar = "<!-- 左侧固定栏 -->\r\n" + 
				"<link rel=\"stylesheet\" href=\"/css/navigation/leftbar.css\" />\r\n" + 
				"<!-- 加载新版本特性 -->\r\n" + 
				"<script type=\"text/javascript\" src=\"/js/navigation/leftbar.js\"></script>\r\n" + 
				"<div id=\"bar_left\">\r\n" + 
				"	<!-- 加载新版特性 -->\r\n" + 
				"	<div id=\"txt_versionFeature\" class=\"sidebar-module\"></div>\r\n" + 
				"</div>";
		
		return leftBar;
	}
	
	public static String rightBar() {
		String rightBar = "<!-- 右侧固定栏 -->\r\n" + 
				"<link rel=\"stylesheet\" href=\"/css/navigation/rightbar.css\" />\r\n" + 
				"<div id=\"bar_right\">\r\n" + 
				"	<div>\r\n" + 
				"		<div class=\"sidebar-module\">\r\n" + 
				"			<h4>关于本站</h4>\r\n" + 
				"			<p>&emsp;欢迎来到何明胜的个人网站.本站主要用于记录和分享本人的学习心得和编程经验，并分享常见可复用代码、推荐书籍以及软件等资源。</p>\r\n" + 
				"			<p>本站源码已托管github.欢迎访问:<br/>\r\n" + 
				"				<a href=\"https://github.com/HelloHusen/web\" target=\"_blank\">github.com/HelloHusen/web</a>\r\n" + 
				"			</p>\r\n" + 
				"		</div>\r\n" + 
				"		<div class=\"sidebar-module\">\r\n" + 
				"			<h4>我的其他主页</h4>\r\n" + 
				"			<ol class=\"list-unstyled\">\r\n" + 
				"				<li><a href=\"http://blog.csdn.net/qq_24879495\" target=\"_blank\">CSDN博客&emsp;一格的程序人生</a></li>\r\n" + 
				"				<li><a\r\n" + 
				"					href=\"http://www.jianshu.com/users/933952e4f1d6/timeline\"\r\n" + 
				"					target=\"_blank\">简书&emsp;一格的博客</a></li>\r\n" + 
				"				<li><a href=\"https://github.com/HelloHusen\" target=\"_blank\">GitHub&emsp;何明胜</a></li>\r\n" + 
				"			</ol>\r\n" + 
				"		</div>\r\n" + 
				"		<div class=\"sidebar-module\">\r\n" + 
				"			<h4>友情链接</h4>\r\n" + 
				"			<ol class=\"list-unstyled\">\r\n" + 
				"				<li><a href=\"http://www.jianshu.com/u/062170d22472\"\r\n" + 
				"					target=\"_blank\">简书 &emsp;鲁莽书生</a></li>\r\n" + 
				"			</ol>\r\n" + 
				"		</div>\r\n" + 
				"	</div>\r\n" + 
				"</div>";
		
		return rightBar;
	}
	
	/**
	 * 返回html结尾
	 * @return
	 */
	public static String bodyHtml() {
		return "</body>\r\n" + "</html>";
	}
}