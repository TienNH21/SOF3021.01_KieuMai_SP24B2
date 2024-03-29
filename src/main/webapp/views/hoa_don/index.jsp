<%@page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Document</title>
</head>
<body>

<form method="GET" action="/hoa-don/index">
    <div>
        <label>Tu khoa</label>
        <input type="text" name="keyword" />
    </div>
    <div>
        <button>Tim kiem</button>
    </div>
</form>

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Ten Nhan vien</th>
        <th>Ten Khach hang</th>
        <th>Ngay mua</th>
        <th>Trang thai</th>
        <th colspan="2">Thao tac</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ ds }" var="hd">
        <tr>
            <td>${ hd.id }</td>
            <td>${ hd.tenNV }</td>
            <td>${ hd.tenKH }</td>
            <td>${ hd.ngayMua }</td>
            <td>${ hd.trangThai }</td>
            <td>
                <a href="#">Update</a>
            </td>
            <td>
                <a href="#">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<nav aria-label="Page navigation example">
    <ul class="pagination">
        <li class="page-item"><a class="page-link" href="#">Previous</a></li>
        <c:forEach begin="1" end="${ p.totalPages }" varStatus="i">
            <c:if test="${ i.count < 4 || i.count > p.totalPages - 4 }">
            <li class="page-item">
                <a class="page-link"
                   href="/mau-sac/index?page=${ i.count }">
                        ${ i.count }
                </a>
            </li>
            </c:if>

            <c:if test="${ i.count == 4 }">
                <li class="page-item">
                    <a class="page-link" href="#">...</a>
                </li>
            </c:if>

        </c:forEach>
        <li class="page-item"><a class="page-link" href="#">Next</a></li>
    </ul>
</nav>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>


