function chart(){
var myChart = echarts.init(document.getElementById('chart'));
var myChart2 = echarts.init(document.getElementById('chart2'));
var myChart3 = echarts.init(document.getElementById('chart3'));
option = {
    xAxis: {
        splitLine:{show: false},//去除网格线
        type: 'category',
        data: ['12 am', '1 pm', '2 pm', '3 pm', '4 pm', '5 pm', '6 pm'],
        axisLine: {
            lineStyle: {
                // type: '',
                color: '#fff',//左边线的颜色
                width:'2'//坐标线的宽度
            }
        },
    },
    title: {
        text: '当前馆内人数',
        textStyle: {
            color:'#fff'
          }
    },
    yAxis: {
        splitLine:{show: false},//去除网格线
        type: 'value',
        axisLine: {
            lineStyle: {
                type: 'solid',
                color: '#fff',//左边线的颜色
                width:'2'//坐标线的宽度
            }
        },
    },
    series: [{
        data: [820, 932, 901, 934, 1290, 1330, 1320],
        type: 'line',
        symbol:'none',  //这句就是去掉点的
        smooth:true,  //这句就是让曲线变平滑的
        color :"#71eeff",
        itemStyle : {
            normal : {
                lineStyle:{
                    width:5,//折线宽度
                    color:"#4ad2ff"//折线颜色
                }
            }
        },
    }]
};
option2 = {
    xAxis: {
        type: 'category',
        data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'],
        axisLine: {
            lineStyle: {
                type: 'solid',
                color: '#fff',//左边线的颜色
                width:'2'//坐标线的宽度
            }
        },
    },
    title: {
        text: '近七天游泳人数',
        textStyle: {
            color:'#fff'
        }
    },
    yAxis: {
        splitLine:{show: false},//去除网格线
        type: 'value',
        axisLine: {
            lineStyle: {
                type: 'solid',
                color: '#fff',//左边线的颜色
                width:'2'//坐标线的宽度
            }
        },
    },
    series: [{
        data: [120, 200, 150, 80, 70, 110, 130],
        type: 'bar',
        itemStyle:{
            normal:{
                color:'#4ad2ff'
            }
        }
    }],

};
option3 = {
    title: {
        text: '当前泳池男女比例 ',
        left: 'center',
        top: 20,
        textStyle: {
            color: '#ffffff'
        }
    },

    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },

    visualMap: {
        show: false,
        min: 80,
        max: 600,
        inRange: {
            colorLightness: [0, 1]
        }
    },
    series : [
        {
            name:'访问来源',
            type:'pie',
            radius : '55%',
            center: ['50%', '50%'],
            data:[
                {value:335, name:'男'},
                {value:310, name:'女'},
            ].sort(function (a, b) { return a.value - b.value; }),
            roseType: 'radius',
            label: {
                normal: {
                    textStyle: {
                        color: 'rgba(255, 255, 255, 1)'
                    }
                }
            },
            labelLine: {
                normal: {
                    lineStyle: {
                        color: 'rgba(255, 255, 255, 0.3)'
                    },
                    smooth: 0.2,
                    length: 10,
                    length2: 20
                }
            },
            itemStyle: {
                normal: {
                    color: '#15c2f7',
                    shadowBlur: 200,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            },

            animationType: 'scale',
            animationEasing: 'elasticOut',
            animationDelay: function (idx) {
                return Math.random() * 200;
            }
        }
    ]
};
myChart.setOption(option);
myChart2.setOption(option2);
myChart3.setOption(option3);
}
