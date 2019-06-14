function adultAjax() {
    $.ajax({
        type: "get",
        url: "/gudong/lesson/list.do?type=1",
        dataType: "json",
        success: function (data) {
            if (data.code == 1) {
                var infos = data.info;
                adultLesson.lessons = infos;
            }
        }
    })
}

function childAjax() {
    $.ajax({
        type: "get",
        url: "/gudong/lesson/list.do?type=7",
        dataType: "json",
        success: function (data) {
            if (data.code == 1) {
                var infos = data.info;
                childLesson.lessons = infos;
            }
        }
    })
}

function babyAjax() {
    $.ajax({
        type: "get",
        url: "/gudong/lesson/list.do?type=12",
        dataType: "json",
        success: function (data) {
            if (data.code == 1) {
                var infos = data.info;
                babyLesson.lessons = infos;
            }
        }
    })
}


$("#tuichu").click(function () {
    $.ajax({
        type: "get",
        url: "/gudong/out.do",
        dataType: "json",
        success: function (data) {
            alert(data.info)
        }
    })
})