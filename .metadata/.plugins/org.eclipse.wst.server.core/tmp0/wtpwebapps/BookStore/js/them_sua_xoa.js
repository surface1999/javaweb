function showAlertBeforeDelete(callback) {
    swal({
            title: "Xác nhận xóa",
            text: "Bạn có chắc chắn xóa những dòng đã chọn",
            type: "warning",
            showCancelButton: true,
            confirmButtonText: "Xác nhận",
            cancelButtonText: "Hủy bỏ",
            confirmButtonClass: "btn btn-success",
            cancelButtonClass: "btn btn-danger"
        })
        .then(function(isCofirm) {
            if (isCofirm) {
                callback()
            }
        })
}

function showAlertBeforeSave(callback) {
    swal({
            title: "Xác nhận Lưu",
            text: "Bạn có chắc chắn Lưu những dòng đã vừa chọn",
            type: "warning",
            showCancelButton: true,
            confirmButtonText: "Xác nhận",
            cancelButtonText: "Hủy bỏ",
            confirmButtonClass: "btn btn-success",
            cancelButtonClass: "btn btn-danger"
        })
        .then(function(isCofirm) {
            if (isCofirm) {
                callback()
            }
        })
}


function showAlertBeforeUpdate(callback) {
    swal({
            title: "Xác nhận Cập Nhật",
            text: "Bạn có chắc chắn Cập Nhật những dòng đã chọn",
            type: "warning",
            showCancelButton: true,
            confirmButtonText: "Xác nhận",
            cancelButtonText: "Hủy bỏ",
            confirmButtonClass: "btn btn-success",
            cancelButtonClass: "btn btn-danger"
        })
        .then(function(isCofirm) {
            if (isCofirm) {
                callback()
            }
        })
}


function showAlertBeforeBlock(callback) {
    swal({
            title: "Xác nhận Khóa",
            text: "Bạn có chắc chắn Khóa những dòng đã chọn",
            type: "warning",
            showCancelButton: true,
            confirmButtonText: "Xác nhận",
            cancelButtonText: "Hủy bỏ",
            confirmButtonClass: "btn btn-success",
            cancelButtonClass: "btn btn-danger"
        })
        .then(function(isCofirm) {
            if (isCofirm) {
                callback()
            }
        })
}