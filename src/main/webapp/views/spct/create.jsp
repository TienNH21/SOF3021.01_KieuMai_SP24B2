<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/select2@4.1.0-rc.0/dist/css/select2.min.css" rel="stylesheet" />
</head>
<body>
    <form method="POST" action="#" class="col-8 offset-2">
        <div class="row mt-2">
            <div class="col-6">
                <label class="form-label">San pham</label>
                <select name="sanPhamId" class="col-12 js-example-basic-multiple">
                    <c:forEach items="${listSP}" var="sp">
                        <option value="${sp.id}">${sp.ten}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="col-6">
                <label class="form-label">Ma</label>
                <input type="text" name="ma" class="form-control" />
            </div>
        </div>
        <div class="row mt-2">
            <div class="col-6">
                <label class="form-label">Mau sac</label>
                <select name="mauSacId" class="col-12 js-example-basic-multiple">
                    <c:forEach items="${listMS}" var="ms">
                        <option value="${ms.id}">${ms.ten}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="col-6">
                <label class="form-label">Kich thuoc</label>
                <select name="kichThuocId" class="col-12 js-example-basic-multiple">
                    <c:forEach items="${listKT}" var="kt">
                        <option value="${kt.id}">${kt.ten}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="row mt-2">
            <div class="col-6">
                <label class="form-label">So luong</label>
                <input type="text" name="soLuong" class="form-control" />
            </div>
            <div class="col-6">
                <label class="form-label">Don gia</label>
                <input type="text" name="donGia" class="form-control" />
            </div>
        </div>
        <div class="row mt-2">
            <div class="col-6">
                <label class="form-label">Trang thai</label>
                <div class="col-12">
                    <input type="radio" id="trang_thai_active" name="trangThai" value="1" />
                    <label for="trang_thai_active">Dang hoat dong</label>
                    <input type="radio" id="trang_thai_inactive" name="trangThai" value="0" />
                    <label for="trang_thai_inactive">Ngung hoat dong</label>
                </div>
            </div>
        </div>
        <div>
            <button>Them</button>
        </div>
    </form>

<script src="https://code.jquery.com/jquery-3.7.1.slim.min.js" integrity="sha256-kmHvs0B+OpCW5GVHUNjv9rOmY0IvSIRcf7zGUDTDQM8=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/select2@4.1.0-rc.0/dist/js/select2.min.js"></script>

<script>
    $(document).ready(function() {
        $('.js-example-basic-multiple').select2();
    });
</script>

</body>
</html>