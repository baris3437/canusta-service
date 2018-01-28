<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="/jsp/include/allDefinitions.jsp"%>

<header class="layout-header">
	<div class="actions">
		<a href="javascript: newCustomerClick()" title="Yeni Kayıt">
          <img class="icon30 icon-plus">
        </a>
	</div>
	<h1>Müşteri Genel Bilgileri</h1>
</header>

<!-- Example DataTables Card-->
<div class="card mb-3">
	<div class="card-body">
		<div class="table-responsive">
			<table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
				<thead>
					<tr>
						<th>Müşteri No</th>
						<th>Ünvanı</th>
						<th>Tipi</th>
						<th>Vergi No</th>
						<th>TC Kimlik No</th>
						<th>Statü</th>
						<th></th>
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${out.customerList}" var="customer">
						<tr>
							<td><c:out value="${customer.customerId}" /></td>
							<td><c:out value="${customer.titleText}" /></td>
							<td><c:out value="${customer.customerTypeDescr}" /></td>
							<td><c:out value="${customer.taxNum}" /></td>
							<td><c:out value="${customer.mernisNum}" /></td>
							<td><c:out value="${customer.statusDescr}" /></td>
							<td>
								<a title="Güncelle" href="javascript:updateCustomerClicked(${customer.customerId})">
									<img class="icon30 icon-search">
								</a>
							</td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>
</div>

<div id="customerListDummyDiv"></div>

<script>
	$('#dataTable').DataTable();

	function updateCustomerClicked(c) {
		var url = "${baseUrl}/customer/customerMaintain";
		var data = {
				"customer.customerId" : c,
				"clientCommand" : "DETAIL"
				};

		$.ajax({
			type : "GET",
			url : url,
			data : data,
			success : function(data) {
				var vmId = $("#customerListDummyDiv").closest(".carousel-item").attr('id');
				var vmPosition = parseInt(vmId.match(/\d+/));
				
				var currentVm = {name: vmId, position: vmPosition};
				appendToCarouselAndMakeActive(data, currentVm);
			},
			dataType : "html"
		});
	};
	
	function newCustomerClick(){
		var url = "${baseUrl}/customer/customerMaintain";
		var data = {
				"clientCommand" : "CREATE"
				};

		$.ajax({
			type : "GET",
			url : url,
			data : data,
			success : function(data) {
				var vmId = $("#customerListDummyDiv").closest(".carousel-item").attr('id');
				var vmPosition = parseInt(vmId.match(/\d+/));
				
				var currentVm = {name: vmId, position: vmPosition};
				appendToCarouselAndMakeActive(data, currentVm);
			},
			dataType : "html"
		});
	}
</script>