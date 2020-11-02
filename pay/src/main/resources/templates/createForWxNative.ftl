<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>支付</title>
</head>

<body>
<div id="myQrcode"></div>
<#--<div id="orderId" hidden>${orderId}</div>-->
<#--<div id="returnUrl" hidden>${returnUrl}</div>-->

<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/jquery.qrcode/1.0/jquery.qrcode.min.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        $('#myQrcode').qrcode({
            text: "${codeUrl}"
        })
    });

    $(function () {
        //定时器
        setInterval(function () {
            console.log('开始查询支付状态...')
            $.ajax({
                'url': '/pay/queryByOrderId',
                data: {
                    'orderId': '12345'
                },
                success: function (result) {
                    console.log(result)
                    // if (result.platformStatus != null
                    //     && result.platformStatus === 'SUCCESS') {
                    //     location.href = $('#returnUrl').text()
                    // }
                },
                error: function (result) {
                    alert(result)
                }
            })
        }, 2000)
    });
</script>
</body>
</html>