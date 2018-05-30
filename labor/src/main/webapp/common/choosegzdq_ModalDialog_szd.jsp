<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/import.jsp"%>
<html>
<head>
<title>工作地区</title>
<link href="<%=request.getContextPath()%>/styles/css/common.css" rel="stylesheet" type="text/css">
<script src="<%=request.getContextPath()%>/js/commonjs.js"></script>
<script src="<%=request.getContextPath() %>/js/jquery-1.11.1.js"></script>
<script>
	$(function(){
		
		$("#gzdq_dwszs").load("../qzdj/hkszd", {
			value : "00"
		})
		$("#gzdq_dwszs").change(function() {
			$("#gzdq_dwszq").empty();
			$("#gzdq_dwszj").empty();
			
			$.get("../qzdj/city", {
				code : "gzdq_dwszq",
				selectedId : $("#gzdq_dwszs").val(),
				region : "city"
			}, function(data) {
				$("#gzdq_dwszq").html(data);
			})

		})
		$("#gzdq_dwszq").change(function() {

			$.get("../qzdj/village", {
				code : "gzdq_dwszj",
				selectedId : $("#gzdq_dwszq").val(),
				region : "village"
			}, function(data) {
				$("#gzdq_dwszj").html(data);
				$("#gzdq_dwszj").change()
			})
		})
		
		$("#gzdq_dwszj").change(function(){
			if($("#gzdq_dwszj").val()==""){
				$("#dqdm").val($("#gzdq_dwszq option:selected").val());
				$("#dqmc").val($("#gzdq_dwszq option:selected").text());
			}else{
				$("#dqdm").val($("#gzdq_dwszj option:selected").val());
				$("#dqmc").val($("#gzdq_dwszj option:selected").text());	
			}	
				
		})
		
		
		
		
		//确定提交+校验 
		$("#qued").click(function(){
			if($("#gzdq_dwszs").val()==""){
				alert("省必填");
				return;						
			}
			
			var selectedValue=$("#dqdm").val();
			var selectedText=$("#dqmc").val();
			
			//var option_1=$("<option></option>");
			var opt=$("<option></option><option selected value="+selectedValue+">"+selectedText+"</option>");									
			window.returnValue=opt;
			window.close();			
		})
		
		
	})

</script>
</head>
<body leftmargin="0" topmargin="0" onkeypress="escQuit();">
<form name="form1" style="method">
<table  border="0" cellpadding="0" cellspacing="0" align="center"  width="100%">
	<tr class ="line4"> 
	  <td >&nbsp;</td>
	  <td >&nbsp;</td>
	  <td >&nbsp;</td>
	  <td >&nbsp;</td>
	</tr>
	<tr class ="line1"> 
	  <td align="right" >省&nbsp;&nbsp;&nbsp;&nbsp;</td>
	  <td id="gzdq_dwszstd">
		<select id="gzdq_dwszs" name="gzdq_dwszs"  style="width:120px"  onchange="initGz1()"></select>
	  </td>
	  <td  align="right" >市&nbsp;&nbsp;&nbsp;&nbsp;</td>
	  <td width="40%" id="gzdq_dwszqtd">
		<select id="gzdq_dwszq" name="gzdq_dwszq" style="width:120px"  onchange="initGz2()"></select>
	  </td>
	  
	</tr>
	
	<tr class ="line2" > 
	 <td  align="right" >区&nbsp;&nbsp;&nbsp;&nbsp;</td>
	  <td id="gzdq_dwszjtd">
		<select id="gzdq_dwszj" name="gzdq_dwszj" style="width:120px" onchange="initGz3()"></select>
	  </td>	  
	</tr>
	<tr class ="line2">
	  <td  align="right" >地区代码</td>
	  <td ><input type=text id="dqdm" name="dqdm" value="" readonly style="width:10em" maxlength="7">
	  </td>
	  <td  align="right" >地区名称</td>
	  <td  ><input type="text" id="dqmc" name="dqmc" value="" readonly style="width:10em">
	  </td>
	</tr>
  </table>
  <table width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
  	<tr class ="line2">
	  <td  align="center">&nbsp;</td>
	</tr>
	<tr class ="line2">
	  <td  align="center"><input type="button" id="qued" name="qued" value="确&nbsp;定" class="BUTTONs3"  style="cursor:hands"></td>
	</tr>
  </table>
 </form> 
</body>
</html>	