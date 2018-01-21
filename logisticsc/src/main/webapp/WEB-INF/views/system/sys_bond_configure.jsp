<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${configProps['resources']}/newbui/css/bs3/dpl-min.css" rel="stylesheet">
<link href="${configProps['resources']}/newbui/css/bs3/bui-min.css" rel="stylesheet">
<title>保证金配置配置表</title>
</head>
<body>
	<div class="panel">
		<div class="panel-header">
			<h3>保证金配置配置</h3>
		</div>
		<div class="panel-body" id="wayBillBaseInfo">
			<form class="form-horizontal" id="bankBasicForm">
				<div class="control-group">
					<label class="control-label"><s>*</s>保证金金额：</label>
					<div class="controls">
						<input type="text" name="money" data-rules="{required:true,number:true}" value="${bondConfigure.money}">
					</div>
					<div style="color:green">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;会员交纳保证金金额（请谨慎修改）</div>
				</div>
				<div>
					<input type="hidden" name="id" value="${bondConfigure.id}">
				</div>
				
				<div class="actions-bar">
		        	<div class="row">
			            <div class="span13 offset3 ">
			              <button type="button" class="button" onclick="edit()">编辑</button>
			              <button type="button" onclick="save()" id="saveBtn" disabled="disabled" class="button button-primary">保存</button>
			            </div>
		          </div>
		        </div>
			</form>
		</div>
	</div>
	
	<script type="text/javascript" src="${configProps['resources']}/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="${configProps['resources']}/newbui/js/bui.js"></script>
	<script type="text/javascript" src="${configProps['resources']}/tools/DateUtils.js"></script>
	<script type="text/javascript">
	var basicDataForm;
	$(function(){
		loadForm();
		$('.form-horizontal input').attr('disabled','disabled');
	});
	
	function loadForm(){
		BUI.use('bui/form',function(Form){
			bankBasicForm = new Form.Form({
				srcNode : '#bankBasicForm'
			}).render();
		})
	}
	
	function edit(){
		$('.form-horizontal input').removeAttr('disabled');
		$('#saveBtn').removeAttr('disabled');
	}
	
	// 保存
	function save(){
		bankBasicForm.valid();
		if(!bankBasicForm.isValid()){
			return;
		}
		$.ajax({
			type : 'post',
			url : '<%=request.getContextPath()%>/sys/bank/updateBondConfigure.shtml',
			data : $("#bankBasicForm").serialize(),
			success : function(result){
				if(result.result){
					BUI.Message.Alert('保存成功',function(){
						window.location.reload(true);
					},'success');
				}else{
					BUI.Message.Alert('保存失败','error');
				}
			}
		});
	}
	</script>
</body>
</html>