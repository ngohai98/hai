<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<c:url var="APIurl" value="/api-admin-phone"/>
<c:url var="uploadURL" value="/api-image"/>
<c:url var ="PhoneURL" value="/admin-phonelist"/>
<html>
<head>
    <title>Chỉnh sửa thông tin</title>
</head>
<body>
<div class="main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs" id="breadcrumbs">
            <script type="text/javascript">
                try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
            </script>
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#">Trang chủ</a>
                </li>
                <li class="active">Thêm sản phẩm</li>
            </ul><!-- /.breadcrumb -->
        </div>
        <div class="page-content">
            <div class="row">
                <div class="col-xs-12">
                        <c:if test="${not empty messageResponse}">
									<div class="alert alert-${alert}">
  										${messageResponse}
									</div>
						</c:if>
                        <form id="formSubmit">
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Nhãn hiệu</label>
                                <div class="col-sm-9">
                                    <select class="form-control" id="dt_hang_id" name="dt_hang_id">
                                        <c:if test="${empty model.dt_hang_id}">
                                            <option value="">Chọn nhãn hiệu</option>
                                            <c:forEach var="item" items="${brands}">
                                                <option value="${item.hang_id}">${item.hang_ten}</option>
                                            </c:forEach>
                                        </c:if>
                                        <c:if test="${not empty model.dt_hang_id}">
                                            <option value="">Chọn nhãn hiệu</option>
                                            <c:forEach var="item" items="${brands}">
                                                <option value="${item.hang_id}" <c:if test="${item.hang_id == model.dt_hang_id}">selected="selected"</c:if>>
                                                        ${item.hang_ten}
                                                </option>
                                            </c:forEach>
                                        </c:if>
                                    </select>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Tên điện thoại</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="dt_Ten" name="dt_Ten" value="${model.dt_Ten}"/>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Hình ảnh</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="dt_HinhAnh" name="dt_HinhAnh" value="${model.dt_HinhAnh}"/>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Thông tin chi tiết</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="dt_ThongTinChiTiet" name="dt_ThongTinChiTiet" value="${model.dt_ThongTinChiTiet}"/>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Giá bán</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="dt_GiaBan" name="dt_GiaBan" value="${model.dt_GiaBan}"/>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Số lượng</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="dt_SoLuong" name="dt_SoLuong" value="${model.dt_SoLuong}"/>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Màu sắc</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="dt_MauSac" name="dt_MauSac" value="${model.dt_MauSac}"/>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Inch</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="dt_Size" name="dt_Size" value="${model.dt_Size}"/>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Trạng Thái</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="dt_TrangThai" name="dt_TrangThai" value="${model.dt_TrangThai}"/>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Ngày đăng</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="dt_NgayDang" name="dt_NgayDang" value="${model.dt_NgayDang}"/>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <div class="col-sm-12">
                                    <c:if test="${not empty model.dt_id}">
                                        <input type="button" class="btn btn-white btn-warning btn-bold" value="Cập nhật sản phẩm" id="btnAddOrUpdatephone"/>
                                    </c:if>
                                    <c:if test="${empty model.dt_id}">
                                    	
                                        <input type="button" class="btn btn-white btn-warning btn-bold" value="Thêm sản phẩm" id="btnAddOrUpdatephone"/>
                                    </c:if>
                                </div>
                            </div>
                            <input type="hidden" value="${model.dt_id}" id="id" name="id"/>
                        </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
	 $(document).ready(function () {

	 })
	$('#dt_anh1').change(function () {
		var dataArray={};
		var files=$(this)[0].files[0];
		if(files != undefined){
			var reader = new FileReader();
			reader.onload=function (e) {
				dataArray["base64"]=e.target.result;
				dataArray["name"]=files.name;
				uploadFile(dataArray);
			};
			reader.readAsDataURL(files);
		}
	});
	 function uploadFile(data) {
		$.ajax({
			url: '${uploadURL}',
			type:'POST',
			data:JSON.stringify(data),
			contentType:'application/json',
			success:function (res) {
				console.log(res);
			},
			error:function (res) {
				console.log(res);

			}
		});
	 }
</script>
<script>
	
	var editor = '';
	$(document).ready(function(){
		editor = CKEDITOR.replace( 'dt_motangan');
	});
	
    $('#btnAddOrUpdatephone').click(function (e) {
        e.preventDefault();
        var data = {};
        var formData = $('#formSubmit').serializeArray();
        $.each(formData, function (i, v ) {
            data[""+v.name+""] = v.value;
        });
        data["dt_motangan"] = editor.getData();
        var id = $('#id').val();
        if (id == "") {
            addNew(data);
        } else {
            updateNew(data);
        }
    });
    function addNew(data) {
        $.ajax({
            url: '${APIurl}',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(data),
            dataType: 'json',
            success: function (result) {
            	window.location.href = "${PhoneURL}?type=list&id="+result.dt_id+"&page=1&maxPageItem=5&message=insert_success";
            },
            error: function (error) {
            	window.location.href = "${PhoneURL}?type=list&maxPageItem=5&page=1&message=error_system";
            }
        });
    }
    function updateNew(data) {
        $.ajax({
            url: '${APIurl}',
            type: 'PUT',
            contentType: 'application/json',
            data: JSON.stringify(data),
            dataType: 'json',
            success: function (result) {
            	window.location.href = "${UserURL}?type=list&id="+result.dt_id+"&page=1&maxPageItem=5&message=update_success";
            },
            error: function (error) {
            	window.location.href = "${UserURL}?type=list&maxPageItem=5&page=1&message=error_system";
            }
        });
    }
</script>
</body>
</html>
