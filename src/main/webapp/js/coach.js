function loadData() {
    //导航跳转效果插件
    $(".nav").singlePageNav({
        offset: 70
    });
    //小屏幕导航点击菜单
    $(".navbar-collapse a").click(function () {
        $(".navbar-collapse").collapse("hide");
    });
    new WOW().init();
    //layui
    layui.use(['layer', 'form'], function () {
        var layer = layui.layer;
        var form = layui.form;
    });
}

