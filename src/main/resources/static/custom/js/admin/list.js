var admin, adminName;

function removeAdminDialog(el) {
	adminId = $(el).attr('data-admin-id');
	adminName = $(el).attr('data-admin-name');
	$('.remove-admin-modal').find('#admin-name').text(adminName);
}

function removeAdmin() {
	$('.remove-admin-modal').modal('hide');
	window.location = "/admin/remove/" + adminId;
}