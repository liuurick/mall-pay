<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <title>支付</title>
</head>
<body>
<p>微信支付二维码</p>
<div id="myQrcode"></div>

<script src="https://cdn.bootcss.com/jquery/1.5.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/jquery.qrcode/1.0/jquery.qrcode.min.js"></script>
    <script>
        jQuery('#myQrcode').qrcode({
            text: "${codeUrl}"
        });
    </script>
</body>
</html>