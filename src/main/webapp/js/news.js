function newsLoadData(page) {
    $.ajax({
        type: "get",
        url: "/gudong/news/list.do?page=" + page,
        dataType: "json",
        success: function (data) {
            newsPageData(data);
        }
    })
}

function newsPageData(data) {
    if (data.code == 1) {
        var total = data.info.total; // 获取总行数
        var pageCount = Math.ceil(total / 5); // 向上取整 计算总页数
        var infos = data.info.rows;
        newsPage.news = infos;
        if (pageCount <= 0) {
            pageCount = 1;
        }
        $('.M-box3').pagination({
            pageCount: pageCount,
            current: $(".currentPage").html(),
            jump: true,
            coping: true,
            keepShowPN: true,
            homePage: '首页',
            endPage: '末页',
            prevContent: '上页',
            nextContent: '下页',
            callback: function (api) {
                $(".currentPage").html(api.getCurrent());
                // getCurrent() 获取当前页
                userLoadData(api.getCurrent())
            }
        });
    }
}