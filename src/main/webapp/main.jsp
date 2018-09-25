<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>KIT ADMIN</title>
    <link rel="stylesheet" href="layui/css/layui.css" media="all">
    <link rel="stylesheet" type="LayerAdmin/text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
    <link rel="stylesheet" href="LayerAdmin/build/css/app.css" media="all">
</head>

<body>
    <div class="layui-layout layui-layout-admin kit-layout-admin">
        <div class="layui-header">
            <div class="layui-logo">医养结合信息服务平台</div>
            <div class="layui-logo kit-logo-mobile">K</div>
            <ul class="layui-nav layui-layout-right kit-nav">
                <li class="layui-nav-item">
                    <a href="javascript:;">
                        <img src="http://m.zhengjinfan.cn/images/0.jpg" class="layui-nav-img">${sessionScope.user.user_name}
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">基本资料</a></dd>
                        <dd><a href="javascript:;">安全设置</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="javascript:;"><i class="fa fa-sign-out" aria-hidden="true"></i> 注销</a></li>
            </ul>
        </div>

        <div class="layui-side layui-bg-black kit-side">
            <div class="layui-side-scroll">
                <div class="kit-side-fold"><i class="fa fa-navicon" aria-hidden="true"></i></div>
                <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
                <ul class="layui-nav layui-nav-tree" lay-filter="kitNavbar" kit-navbar>
                    <li class="layui-nav-item">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span>健康监测</span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;" kit-target data-options="{url:'showXueYa.action?old_id=${sessionScope.user_id}',icon:'&#xe6c6;',title:'血压信息',id:'1'}">
                                <i class="layui-icon">&#xe6c6;</i><span>血压指标</span></a>
                            </dd>
                            <dd>
                                <a href="javascript:;" data-url="showXueYang.action?old_id=${sessionScope.user_id}" data-icon="fa-user" data-title="血氧指标" kit-target data-id='2'>
                                <i class="fa fa-user" aria-hidden="true"></i><span> 血氧指标</span></a>
                            </dd>
                            <dd>
                                <a href="javascript:;" data-url="showXueTang.action?old_id=${sessionScope.user_id}" data-icon="&#xe628;" data-title="血糖指标" kit-target data-id='3'>
                                <i class="layui-icon">&#xe628;</i><span>血糖指标</span></a>
                            </dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item">
                        <a href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span>健康监护</span></a>
                        <dl class="layui-nav-child">
                            <dd><a href="javascript:;" kit-target data-options="{url:'getAllValueWarn.action?old_id=${sessionScope.user_id}',icon:'&#xe658;',title:'异常指标',id:'4'}">
                            <i class="layui-icon">&#xe658;</i><span>异常指标</span></a></dd>
                            <dd><a href="javascript:;" kit-target data-options="{url:'showAllValue.action?old_id=${sessionScope.user_id}',icon:'&#xe658;',title:'预警设置',id:'5'}">
                            <i class="layui-icon">&#xe658;</i><span>预警设置</span></a></dd>
                        </dl>
                    </li>
                     <li class="layui-nav-item">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span>健康档案</span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;" kit-target data-options="{url:'LayerAdmin/test.html',icon:'&#xe6c6;',title:'个人档案',id:'6'}">
                                <i class="layui-icon">&#xe6c6;</i><span>个人档案</span></a>
                            </dd>
                            <dd>
                                <a href="javascript:;" data-url="selectAll.action?" data-icon="fa-user" data-title="住院记录" kit-target data-id='7'>
                                <i class="fa fa-user" aria-hidden="true"></i><span> 住院记录</span></a>
                            </dd>
                        </dl>
                    </li>
                     <li class="layui-nav-item">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span>亲人关怀</span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;" kit-target data-options="{url:'LayerAdmin/test.html',icon:'&#xe6c6;',title:'表格',id:'8'}">
                                <i class="layui-icon">&#xe6c6;</i><span>健康档案调阅申请</span></a>
                            </dd>
                            <dd>
                                <a href="javascript:;" data-url="#" data-icon="fa-user" data-title="表单" kit-target data-id='9'>
                                <i class="fa fa-user" aria-hidden="true"></i><span>健康档案调阅授权</span></a>
                            </dd>
                            <dd>
                                <a href="javascript:;" data-url="showXueYa.action?old_id=1" data-icon="&#xe628;" data-title="导航栏" kit-target data-id='10'>
                                <i class="layui-icon">&#xe628;</i><span>健康档案查询</span></a>
                            </dd>
                        </dl>
                    </li>
                     <li class="layui-nav-item">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span>家庭医生</span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;" kit-target data-options="{url:'#',icon:'&#xe6c6;',title:'表格',id:'11'}">
                                <i class="layui-icon">&#xe6c6;</i><span>医生专家库</span></a>
                            </dd>
                            <dd>
                                <a href="javascript:;" data-url="#" data-icon="fa-user" data-title="表单" kit-target data-id='12'>
                                <i class="fa fa-user" aria-hidden="true"></i><span>我的咨询</span></a>
                            </dd>
                        </dl>
                    </li>
                     <li class="layui-nav-item">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span>个人账户</span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;" kit-target data-options="{url:'#',icon:'&#xe6c6;',title:'表格',id:'13'}">
                                <i class="layui-icon">&#xe6c6;</i><span>老人信息</span></a>
                            </dd>
                            <dd>
                                <a href="javascript:;" data-url="#" data-icon="fa-user" data-title="表单" kit-target data-id='14'>
                                <i class="fa fa-user" aria-hidden="true"></i><span>修改密码</span></a>
                            </dd>
                        </dl>
                    </li>
                    
                </ul>
            </div>
        </div>
        <div class="layui-body" id="container">
            <!-- 内容主体区域 -->
            <div style="padding: 15px;">主体内容加载中,请稍等...</div>
        </div>

        <div class="layui-footer">
            <!-- 底部固定区域 -->
            2017 &copy;
            <a href="http://kit.zhengjinfan.cn/">kit.zhengjinfan.cn/</a> MIT license

        </div>
    </div>
    <script type="text/javascript">
        var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");
        document.write(unescape("%3Cspan id='cnzz_stat_icon_1264021086'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s22.cnzz.com/z_stat.php%3Fid%3D1264021086%26show%3Dpic1' type='text/javascript'%3E%3C/script%3E"));
    </script>
    <script src="LayerAdmin/plugins/layui/layui.js"></script>
    <script>
        var message;
        layui.config({
            base: 'LayerAdmin/build/js/'
        }).use(['app', 'message'], function() {
            var app = layui.app,
                $ = layui.jquery,
                layer = layui.layer;
            //将message设置为全局以便子页面调用
            message = layui.message;
            //主入口
            app.set({
                type: 'iframe'
            }).init();
            $('#pay').on('click', function() {
                layer.open({
                    title: false,
                    type: 1,
                    content: '<img src="LayerAdmin/build/images/pay.png" />',
                    area: ['500px', '250px'],
                    shadeClose: true
                });
            });
        });
    </script>
</body>

</html>