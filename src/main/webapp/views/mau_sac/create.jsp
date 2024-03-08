<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <form method="POST" action="/mau-sac/store">
        <div>
            <label>Mã</label>
            <input type="text" name="ma" />
        </div>
        <div>
            <label>Tên</label>
            <input type="text" name="ten" />
        </div>
        <div>
            <label>Trạng thái</label>
            <input type="radio" id="trang_thai_active" name="trangThai" value="1" />
            <label for="trang_thai_active">Đang hoạt động</label>
            <input type="radio" id="trang_thai_inactive" name="trangThai" value="0" />
            <label for="trang_thai_inactive">Ngừng hoạt động</label>
        </div>
        <div>
            <button>Thêm</button>
        </div>
    </form>
</body>
</html>