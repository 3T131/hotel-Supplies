<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set  value="${pageContext.request.contextPath}" scope="page" var="ctx"></c:set>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />

	
<!--   <link rel="stylesheet" href="/static/css/roomset/roomset.css" type="text/css"></link> -->
  <link rel="stylesheet" href="/static/bootstrap/css/bootstrap.css" type="text/css"></link>
  <link rel="stylesheet" href="/static/css/page.css" type="text/css"></link>
  <link href="/static/bootstrap/css/bootstrap-responsive.css" rel="stylesheet">  <!-- start 响应式布局要添加的 -->
  <script src="/static/bootstrap/js/jquery-3.1.1.min.js"></script>
  <script src="/static/bootstrap/js/bootstrap.js"></script>
  <script type="text/javascript" src="/static/js/page.js"></script>
	  <script src="/static/js/passenger/list.js"></script>
   <style>
   
   .container{
     margin-top: 10px;
   }
   
    .labelroomnumber{
      position: relative;
      font-size: 17px;
      float: left;
      margin-top: 15px;
    }
    
    .textone{
    margin-top:12px;
    }
    
    .rightOne{
    margin-right: 50px;
    font-size:16px;
    }
    
    .table th,.table td{
       text-align: center; 
    }
    
    .theadone{
     background-color: #CCFF99;
    }
    
    .dgvone{
      margin-top: 12px;
    }
    
    .roomnumberwidth{
      width:70%;
    }
    
  
  </style>
  
 </head>
  
 
  <body>
  <div class="container" >
    <div class="span5">
	    <div class="row-fluid">
		    <label class="labelroomnumber">旅客名称：</label>
		    <form action="${ctx}/Passenger/tolist.do" method="post" style="float: left;">
			   <input id="txtnameid" name="name" class="textone roomnumberwidth" style="border-radius:0px; border-top-left-radius:4px; border-bottom-left-radius:4px;height:26px;" type="text" placeholder="请输入关键字" value="${name}">
			   <div class="input-append">  
			      <button type="submit" class="btn-success textone" style="margin-left:-4px;height:26px;"><li class="icon-search icon-white"></li>搜索</button>
			   </div>
		    </form>
	    </div>
    </div>
    <div class="span6">
      <div class="row-fluid">
       <div class="span3">
         <button class="btn btn-info btn-small textone" type="button" onclick="location='/Passenger/toadd.do'"><li class="icon-plus icon-white"></li>新增</button>
       </div>
       <div class="span3">
         <button class="btn btn-warning btn-small textone" type="button" onclick="updatefunction()"><li class="icon-pencil icon-white"></li>修改</button>
       </div>
       <div class="span3">
         <button class="btn btn-danger btn-small textone" type="button" onclick="deletefunction()"><li class="icon-remove icon-white"></li>删除</button>
       </div>
      </div>
    </div>
    <br>
    <div class="dgvone">
       <table class="table table-condensed table-bordered table-striped" id="tableid">
	      <thead class="theadone">
	        <tr>
	          <th >选择</th>
	          <th >姓名</th>
	          <th >性别</th>
	          <th >出生日期</th>
	          <th >民族</th>
	          <th >旅客级别</th>
	          <th >证件类型</th>
	          <th >证件号码</th>
	          <th >联系电话</th>
	        </tr>
	      </thead>
	      <tbody id="tbody">
	        <c:forEach items="${list}" var="item">
		        <tr>
		          <td><input type="checkbox" name="id" value="${item.passengerId}"></td>
		          <td>${item.name}</td>
		          <td>${item.genderName}</td>
		          <td>${item.birthDate}</td>
		          <td>${item.nationName}</td>
		          <td>${item.passengerLevelName}</td>
		          <td>${item.papersName}</td>
		          <td>${item.papersNumber}</td>
		          <td>${item.contactPhoneNumber}</td>
		        </tr>
	        </c:forEach>
	      </tbody>
	    </table>
    </div>

    <div class="span11">
      <div class="row-fluid">
        <div class="tcdPageCode" style="text-align:center;"></div>
      </div>
    </div>
  </div>
  
 
 
 
 
 <script type="text/javascript">
  /* 分页要用的 */
  <%--$(".tcdPageCode").createPage({--%>
     <%--pageCount:${list.totalPage},--%>
     <%--current:${list.currentPage},--%>
     <%--backFn:function(p){--%>
     <%--var txtname=document.getElementById("txtnameid").value;--%>
     <%--location.href="${ctx}/Passenger/tolist.do?currentPage="+p+"&txtname="+txtname;--%>
     <%--}--%>
   <%--});--%>
  
 </script>
   
  </body>
</html>
