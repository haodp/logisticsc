<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	SimpleDateFormat dateFormat		= new SimpleDateFormat("yyMMdd_HHmmssSSS");
	String requestid				= "ZGTPAY" + dateFormat.format(new Date());
%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
	<title>4.4</title>

	<style type="text/css">
		tr.onekeyClose {
			display: none;
		}

		tr.directClose {
			display: none;
		}

		tr.commonClose {
			display: none;
		}

		tr.usernoClose {
			display: none;
		}
		
		tr.mccClose {
			display: none;
		}

		tr.bindidClose {
			display: none;
		}

		tr.ledgernoClose {
			display: none;
		}
	</style>

	<script type="text/javascript">

	</script>
</head>
<body>
	<br>
	<table width="80%" border="0" align="center" cellpadding="5" cellspacing="0" style="border:solid 1px #107929">
		<tr>
	  		<th align="center" height="30" colspan="2" bgcolor="#6BBE18">
				4.4 订单支付接口
			</th>
	  	</tr> 
		<form method="post" action="${configProps['project']}/UpLoadApi.pay" target="_blank" enctype="multipart/form-data" accept-charset="UTF-8">
		
			<tr >
				<td width="30%" align="right">主商户商编[customernumber]:</td>
				<td width="70%" align="left"> 
					<input size="70" type="text" name="customernumber" value="10012438801" >
					<span style="color:#FF0000;font-weight:100;">*</span>
				</td>
			</tr>

			<tr >
				<td width="30%" align="right">分账方编号[ledgerno]:</td>
				<td width="70%" align="left"> 
					<input size="70" type="text" name="ledgerno" value="10012909010" >
					<span style="color:#FF0000;font-weight:100;">*</span>
				</td>
			</tr>

			<tr >
				<td width="30%" align="right">文件类型[filetype]:</td>
				<td width="70%" align="left"> 
					<input size="70" type="text" name="filetype" value="ID_CARD_FRONT" required>
					<span style="color:#FF0000;font-weight:100;">*</span>
				</td>
			</tr>

			<tr >
				<td width="30%" align="right">上传图片:</td>
				<td width="70%" align="left"> 
					<input size="70" type=file name="filename" >
				</td>
			</tr>
			
			<tr >
				<td width="30%" align="left">&nbsp;</td>
				<td width="70%" align="left"> 
					<input type="submit" value="submit" />
				</td>
			</tr>
		</form>
	</table>
</body>
</html>
