<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="/jsp/include/allDefinitions.jsp"%>

<header class="layout-header">
	<c:choose>
		<c:when test="${out.protectAllFlag}">
			<div class="actions">
				<a href="javascript: headerUpdateClick()" title="Güncelle">
		          <img class="icon30 icon-pencil">
		        </a>
		        <a href="javascript: headerDeleteClick()" title="Sil">
		        	<img class="icon30 icon-bin">
		        </a>
			</div>
			<h1>Müşteri Detay</h1>
		</c:when>
		<c:otherwise>
			<c:choose>
				<c:when test="${out.protectKeyFlag}">
					<h1>Müşteri Güncelle</h1>
				</c:when>
				<c:otherwise>
					<h1>Müşteri Yarat</h1>
				</c:otherwise>
			</c:choose>
		</c:otherwise>
	</c:choose>
	
</header>

<c:choose>
	<c:when test="${out.protectAllFlag}">
		<div class="form-row">
			<div class="form-group col-md-6">
				<label class="field-label">Müşteri No</label>
				<span class="text-field">${out.customer.customerId}</span>
			</div>
			<div class="form-group col-md-6">
				<label class="field-label">Müşteri Tipi</label>
				<span class="text-field">${out.customerTypeDescr}</span>
			</div>
		</div>	
		<div class="form-group">
				<label class="field-label">Ad Soyad/Ünvanı</label>
				<span class="text-field">${out.customer.titleText}</span>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label class="field-label">Vergi No</label>
					<span class="text-field">${out.customer.taxNum}</span>
				</div>
				<div class="form-group col-md-6">
					<label class="field-label">TC Kimlik No</label>
					<span class="text-field">${out.customer.mernisNum}</span>
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label class="field-label">Statü</label>
					<span class="text-field">${out.customerStatusDescr}</span>
				</div>
			</div>
	</c:when>
	<c:otherwise>
		<form:form commandName="out.customer">
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="customerId">Müşteri No</label>
					<form:input type="number" class="form-control" id="customerId"
						placeholder="Müşteri No" path="customerId" disabled="${out.protectKeyFlag}" />
				</div>
				<div class="form-group col-md-6">
					<label for="customerType">Tipi</label>
					<form:select id="customerType" class="form-control"
						path="customerType">
						<form:option value="" label="Seçiniz..." />
						<form:options items="${out.customerTypeList}"
							itemValue="displayValue" itemLabel="displayName" />
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<label for="titleText">Ad Soyad/Ünvanı</label>
				<form:input type="text" class="form-control" id="titleText"
					placeholder="Ad Soyad/Ünvanı" path="titleText" />
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="taxNum">Vergi No</label>
					<form:input type="number" class="form-control" id="taxNum"
						placeholder="Vergi No" path="taxNum" />
				</div>
				<div class="form-group col-md-6">
					<label for="mernisNum">TC Kimlik No</label>
					<form:input type="number" class="form-control" id="mernisNum"
						placeholder="TC Kimlik No" path="mernisNum" />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="customerType">Statü</label>
					<form:select id="customerStatus" class="form-control" path="status">
						<form:option value="" label="Seçiniz..." />
						<form:options items="${out.customerStatusList}"
							itemValue="displayValue" itemLabel="displayName" />
					</form:select>
				</div>
			</div>
			
			<form:button id="cancelButton" type="button" class="btn btn-secondary">İptal</form:button>		
			<form:button id="updateButton" type="button" class="btn btn-success form-actions-btn-right">
				<c:choose>
					<c:when test="${out.protectKeyFlag}">Güncelle</c:when>
					<c:otherwise>Kaydet</c:otherwise>
				</c:choose>
			</form:button>
			
			<form:button id="clearButton" type="button" class="btn btn-warning form-actions-btn-right">Temizle</form:button>
		</form:form>

	</c:otherwise>
</c:choose>

<div id="customerMaintainDummyDiv"></div>

<script>
	function headerUpdateClick(){
		var url = "${baseUrl}/customer/customerMaintain";
		var data = {
				"customer.customerId" : ${out.customer.customerId},
				"clientCommand" : "UPDATE"
				};

		$.ajax({
			type : "GET",
			url : url,
			data : data,
			success : function(data) {
				var vmId = $("#customerMaintainDummyDiv").closest(".carousel-item").attr('id');
				var vmPosition = parseInt(vmId.match(/\d+/));
				
				var currentVm = {name: vmId, position: vmPosition};
				var destroyThis = true;
				appendToCarouselAndMakeActive(data, currentVm, destroyThis);
			},
			dataType : "html"
		});
	}
	
	function headerDeleteClick(){
		
	}
	
	$("#cancelButton").click(function(){
		
		var url = "${baseUrl}/customer/customerMaintain";
		var data = {
				"customer.customerId" : ${out.customer.customerId},
				"clientCommand" : "DETAIL"
				};

		$.ajax({
			type : "GET",
			url : url,
			data : data,
			success : function(data) {
				var vmId = $("#customerMaintainDummyDiv").closest(".carousel-item").attr('id');
				var vmPosition = parseInt(vmId.match(/\d+/));
				
				var currentVm = {name: vmId, position: vmPosition};
				var destroyThis = true;
				appendToCarouselAndMakeActive(data, currentVm, destroyThis);
			},
			dataType : "html"
		});
	});
	
	$("#clearButton").click(function(){
		
	});
	
</script>
