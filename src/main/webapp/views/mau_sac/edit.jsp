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
    <h2>Edit Form</h2>
    <form method="POST" action="/mau-sac/update/${ ms.ma }">
        <div>
            <label>Ma</label>
            <input type="text" name="ma" value="${ ms.ma }" disabled />
        </div>
        <div>
            <label>Ten</label>
            <input type="text" name="ten" value="${ ms.ten }" />
        </div>
        <div>
            <label>Trang thai</label>
            <input type="radio" id="trang_thai_active" name="trangThai" value="1"
                ${ ms.trangThai == 1 ? "checked" : "" }/>
            <label for="trang_thai_active">Active</label>
            <input type="radio" id="trang_thai_inactive" name="trangThai" value="0"
                ${ ms.trangThai == 0 ? "checked" : "" }/>
            <label for="trang_thai_inactive">Inactive</label>
        </div>
        <div>
            <button>Them</button>
        </div>
    </form>
</body>
</html>