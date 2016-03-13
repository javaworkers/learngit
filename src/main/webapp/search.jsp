<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Search Category - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="./css/easyui.css">
	<link rel="stylesheet" type="text/css" href="./css/icon.css">
	<link rel="stylesheet" type="text/css" href="./css/demo.css">
	<script type="text/javascript" src="./js/jquery.min.js"></script>
	<script type="text/javascript" src="./js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="./js/easyui-lang-zh_CN.js"></script>
</head>
<body>
	<h2>Tom的主页</h2>
	<p>欢迎来到Tom的主页，Tom期待成为你的朋友，交流生活中的点点滴滴。</p>
	<div style="margin:20px 0;"></div>
	<input class="easyui-searchbox" data-options="prompt:'输入搜索值',menu:'#mm',searcher:doSearch" style="width:350px;height: 40px" id="input1"></input>
	<div id="mm">
		<div data-options="name:'student',iconCls:'icon-ok'">学生</div>
		<div data-options="name:'teacher'">老师</div>
	</div>
	<div style="margin:20px 0;"></div>
	<div id="dataTables" style="display: none">
	<table class="easyui-datagrid" title="搜索结果" style="width:461px;height:250px;display:none"
			data-options="singleSelect:true,collapsible:true" id="magazineGrid1">
		<thead>
			<tr>
				<th data-options="field:'tName',width:80,align:'center'">姓名</th>
				<th data-options="field:'age',width:80,align:'center'">年龄</th>
				<th data-options="field:'address',width:130,align:'center'">地址</th>
				<th data-options="field:'phone',width:110,align:'center'">手机号</th>
				<th data-options="field:'sex',width:60,align:'center'">性别</th>
			</tr>
		</thead>
	</table>
	</div>
	<script>
		function doSearch(value,name){
			$.post("search/getSearchResult",{
				"value":value,
			    "name":name
			},function(data){
				if (data==null || data=="") {
					alert("输入名字有误，请重新输入");
					$("#input1").val("");
					window.location.reload();
				} else {
					$("#dataTables").css('display','block');
					if (name=='teacher') {
						initTeacherDataGrid();
					} else if (name=='student') {
						initStudentDataGrid();
					}
					var jsdata = {'total':data.length,'rows':data};
					$("#magazineGrid1").datagrid('loadData', jsdata);
				}
			});
		}
		function initTeacherDataGrid() {
			$('#magazineGrid1').datagrid({
				columns: [[
				           { field:'tName',width:80,align:'center',title:'姓名'},
 				           { field:'age',width:80,align:'center',title:'年龄'},
				           { field:'address',width:130,align:'center',title:'地址' },
				           { field:'phone',width:110,align:'center',title:'手机号' },
				           { field:'sex',width:60,align:'center',title:'性别' }
				       ]]
			});	
		}
		function initStudentDataGrid() {
			$('#magazineGrid1').datagrid({
				columns: [[
				           { field:'sName',width:80,align:'center',title:'姓名'},
 				           { field:'classId',width:80,align:'center',title:'班级编号'},
				           { field:'address',width:130,align:'center',title:'地址' }
				       ]]
			});	
		}
	</script>
 
</body>
</html>