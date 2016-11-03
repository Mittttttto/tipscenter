<%@page import="com.app.model.User"%>
<%@page import="com.app.model.Tag"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
<!DOCTYPE html>
<%
	ArrayList<Tag> tags =(ArrayList<Tag>)request.getAttribute("tags");
	ArrayList<User> users =(ArrayList<User>)request.getAttribute("users");
%>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>TipsCenter</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/bootstrap-table.css">
    <!-- <link rel="stylesheet" href="js/index.css"> -->
    <!-- <script src="assets/index.js"></script> -->
    <script src="/js/jquery-1.8.3.min.js"></script>

    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/ajaxfileupload.js"></script>
    <script src="/js/ga.js"></script>
    <link rel="stylesheet" href="/css/examples.css">
    <script src="/js/bootstrap-tagsinput.js"></script>
    <script src="/js/bootstrap-tagsinput-angular.js"></script>
    <link rel="stylesheet" href="/css/bootstrap-tagsinput.css">
    <link rel="stylesheet" href="/css/bootstrap-tagsinput-typeahead.css">
    <script src="/js/bootstrap-table.js"></script>
    <link rel="Stylesheet" type="text/css" href="/css/loginDialog.css" />
</head>
<body>

<!-- Fixed navbar -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

            <a id="loginlink" class="navbar-brand" href="javascript:login()">Login</a>
            <div class="navbar-brand" id="hellotext"></div>    
            <a id="logoutlink" class="navbar-brand" style="display:none" href="javascript:logout()">Log out</a>
        </div>

    </div>
</nav>

	
    <div id="LoginBox">
        <div class="row1">
            Login<a href="javascript:void(0)" title="关闭窗口" class="close_btn" id="closeBtn">×</a>
        </div>
        <div class="row">
            &nbsp;&nbsp; <span class="inputBox">
                <input type="text" id="txtName" placeholder="Account" />
            </span><a href="javascript:void(0)" title="提示" class="warning" id="warn">*</a>
        </div>
        <div class="row">
            &nbsp;&nbsp; <span class="inputBox">
                <input type="password" id="txtPwd" placeholder="Password" />
            </span><a href="javascript:void(0)" title="提示" class="warning" id="warn2">*</a>
        </div>
        <div class="row">
            <a href="#" id="loginbtn">Login</a>
        </div>
    </div>

	<script type="text/javascript">



	function checkuploadaccess(){
		$.get("/checkuser",{date:new Date()},function(mess){
			//request.getRequestDispatcher("customer/regSuccess.jsp").forward(request, response);
			if(mess=="success"){
				$("#upload_title").val("")
				$("#upload_comment").val("")
				$("#myModal2").modal('show');
			}else{
				$("body").append("<div id='mask'></div>");
				$("#mask").addClass("mask").fadeIn("slow");
				$("#LoginBox").fadeIn("slow");
			}
		});	
	}

	function checkupdateaccess(title){
		$.get("/checkuser",{date:new Date()},function(mess){
			//request.getRequestDispatcher("customer/regSuccess.jsp").forward(request, response);
			if(mess=="success"){
				$("#update_title").html(title)
				$("#update_comment").val("")
				$("#myModal3").modal('show');
			}else{
				$("body").append("<div id='mask'></div>");
				$("#mask").addClass("mask").fadeIn("slow");
				$("#LoginBox").fadeIn("slow");
			}
		});	
	}
	
	function login(){
		$("body").append("<div id='mask'></div>");
		$("#mask").addClass("mask").fadeIn("slow");
		$("#LoginBox").fadeIn("slow");
		
		}
	
	function logout(){

		$.get("/logout",{date:new Date()},function(mess){
			//request.getRequestDispatcher("customer/regSuccess.jsp").forward(request, response);
			if(mess=="success"){
				$("#logoutlink").css({ display: 'none' });
				$("#loginlink").css({ display: 'block' });
				$("#hellotext").text("");	
			}else{
				
			}
		});	
		
		}
	
	$(function ($) {
		//弹出登录
		$("#example").hover(function () {
			$(this).stop().animate({
				opacity: '1'
			}, 600);
		}, function () {
			$(this).stop().animate({
				opacity: '0.6'
			}, 1000);
		}).on('click', function () {
			$("body").append("<div id='mask'></div>");
			$("#mask").addClass("mask").fadeIn("slow");
			$("#LoginBox").fadeIn("slow");
		});
		//
		//按钮的透明度
		$("#loginbtn").hover(function () {
			$(this).stop().animate({
				opacity: '1'
			}, 600);
		}, function () {
			$(this).stop().animate({
				opacity: '0.8'
			}, 1000);
		});
		//文本框不允许为空---按钮触发
		$("#loginbtn").on('click', function () {
			var txtName = $("#txtName").val();
			var txtPwd = $("#txtPwd").val();
			if (txtName == "" || txtName == undefined || txtName == null) {
				if (txtPwd == "" || txtPwd == undefined || txtPwd == null) {
					$(".warning").css({ display: 'block' });
				}
				else {
					$("#warn").css({ display: 'block' });
					$("#warn2").css({ display: 'none' });
				}
			}
			else {
				if (txtPwd == "" || txtPwd == undefined || txtPwd == null) {
					$("#warn").css({ display: 'none' });
					$(".warn2").css({ display: 'block' });
				}
				else {
					$(".warning").css({ display: 'none' });
				}
			}
			$.get("/checklogin",{action:"login",date:new Date(),username:txtName,pwd:txtPwd},function(mess){
				//request.getRequestDispatcher("customer/regSuccess.jsp").forward(request, response);
				if(mess=="fail"){
					$("#warn").css({ display: 'block' });
					$("#warn2").css({ display:'block' });
				}else{
					$("#logoutlink").css({ display: 'block' });
					$("#loginlink").css({ display: 'none' });
					$("#hellotext").text(mess);
					$("#LoginBox").fadeOut("fast");
					$("#mask").css({ display: 'none' });
				}
			});	
		});
		//文本框不允许为空---单个文本触发
		$("#txtName").on('blur', function () {
			var txtName = $("#txtName").val();
			if (txtName == "" || txtName == undefined || txtName == null) {
				$("#warn").css({ display: 'block' });
			}
			else {
				$("#warn").css({ display: 'none' });
			}
		});
		$("#txtName").on('focus', function () {
			$("#warn").css({ display: 'none' });
		});
		//
		$("#txtPwd").on('blur', function () {
			var txtName = $("#txtPwd").val();
			if (txtName == "" || txtName == undefined || txtName == null) {
				$("#warn2").css({ display: 'block' });
			}
			else {
				$("#warn2").css({ display: 'none' });
			}
		});
		$("#txtPwd").on('focus', function () {
			$("#warn2").css({ display: 'none' });
		});
		//关闭
		$(".close_btn").hover(function () { $(this).css({ color: 'black' }) }, function () { $(this).css({ color: '#999' }) }).on('click', function () {
			$("#LoginBox").fadeOut("fast");
			$("#mask").css({ display: 'none' });
		});
	});
	</script>	
	
	
</br>
</br>
</br>
</br>
<script type="text/javascript">



</script>

 <div class="container">
 <!-- Tag  -->
 <div>
	<span id="taglist">
    
    <% 	for (Tag tag : tags) { %>
    <button  class="btn btn-primary" id="tag<%=tag.getId()%>" onclick="addtag(<%=tag.getId()%>)"><%=tag.getcontent() %></button>
    <%} %>
    </span>
    <button id="newtag" class="btn btn-primary" data-toggle="modal" data-target="#myModal" >
            <i class="glyphicon glyphicon-plus"></i> 
    </button><br/><br/>
<input id="tagbox" type="text" placeholder="Tag Box"  style="width:120px;" />

<br/><br/>
<% 	for (User user : users) { %>
    <button  class="btn btn-success" id="user<%=user.getId()%>" onclick="adduser(<%=user.getId()%>)"><%=user.getname() %></button>
    <%} %>
</br></br>
 <input id="userbox" type="text" placeholder="Owner Box" />
<br/>
<br/>
<div><input  id="searchtext" type="text"    placeholder="Key words"  class="form-control"  style="width:220px;" /></div> 
<br/>

<div >
<button  class="btn btn-danger" id="comfirm"  onclick="comfirm() ">Search</button>
<button  class="btn btn-danger" style="float:right"  onclick="checkuploadaccess()" ><i class="glyphicon glyphicon-upload"></i> Upload New Tip</button>
</div>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" style="width:200px">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×
				</button>
				<h4 class="modal-title" id="myModalLabel">
					New Tag
				</h4>
			</div>
			<div class="modal-body">
				<input id="newtagtext" />
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-primary" onclick="checkNewTag()">
					comfirm
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<!-- 模态框（Modal2） -->
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" style="width:500px">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×
				</button>
				<h4 class="modal-title" id="myModalLabel">
					Upload
				</h4>
			</div>
			<div class="modal-body">
				Title:<input id="upload_title" /> <br/>
				<br/>
	
				<span> <input type="file" id="newfile" name="newfile"></span>
				<br/>
				Tags :
				<span id="upload_taglist">
				    <% 	for (Tag tag : tags) { %>
				    <button  class="btn btn-primary" id="tag<%=tag.getId()%>" onclick="add_uploadtag(<%=tag.getId()%>)"><%=tag.getcontent() %></button>
				    <%} %>
			    </span>
			    <button id="newtag" class="btn btn-primary" data-toggle="modal" data-target="#myModal" >
			            <i class="glyphicon glyphicon-plus"></i> 
			    </button>
			    <br/><br>
			    Tags input:<input id="tagbox2" type="text"  style="width:120px;" /><br/><br/>
			    Comment:<textarea  id="upload_comment" rows="3" cols="60" ></textarea>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-primary" onclick="uploadNewTip()">
					Upload
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->


<!-- 模态框（Modal3） -->
<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" style="width:500px">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×
				</button>
				<h4 class="modal-title" id="myModalLabel">
					Update
				</h4>
			</div>
			<div class="modal-body">
				Title:<span id="update_title" ></span> <br/>
				<br/>
	
				<span> <input type="file" id="updatefile" name="updatefile"></span>
				<br/>

			    Comment:<textarea  id="update_comment" rows="3" cols="60" ></textarea>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-primary" onclick="updateTip()">
					Upload
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->


<script type="text/javascript">
function checkNewTag(){
	var newtag=$("#newtagtext").val()
	$.get("/checknewtag",{date:new Date(),newtag:newtag},function(mess){
		//request.getRequestDispatcher("customer/regSuccess.jsp").forward(request, response);
		if(mess=="fail"){
			alert("the tag have already exist")
		}else{
			var obj = "<button  class='btn btn-primary' id='tag"+mess+"' onclick='addtag("+mess+")'>"+newtag+"</button>"; 
			$("#taglist").append(obj);
			var obj2 = "<button  class='btn btn-primary' id='tag2"+mess+"' onclick='add_uploadtag("+mess+")'>"+newtag+"</button>"; 
			$("#upload_taglist").append(obj2);
			$("#taglist").trigger("create");
			$('#myModal').modal('hide')
		}
	});	
}


$('#tagbox').tagsinput({
  itemValue: 'value',
  itemText: 'text',
});
function addtag(x){
	$('#tagbox').tagsinput('add', { "value": x , "text": $("#tag"+x).html()  }); 
}

$('#tagbox2').tagsinput({
	  itemValue: 'value',
	  itemText: 'text',
	});
function add_uploadtag(x){
	$('#tagbox2').tagsinput('add', { "value": x , "text": $("#tag"+x).html()  }); 
}

$('#userbox').tagsinput({
	  itemValue: 'value',
	  itemText: 'text',
	});
function adduser(x){
	$('#userbox').tagsinput('add', { "value": x , "text": $("#user"+x).html()  }); 
}

function comfirm(){
	var tags=$("#tagbox").val()
	var users=$("#userbox").val()
	var searchtext=$("#searchtext").val()

	if (tags.length==0) {tags=-1};
	if (users.length==0) {users=-1};
	$('#table').bootstrapTable('refresh',{url:'/loaddata?tags='+tags+"&users="+users+"&searchtext="+searchtext});

}

function updateTip(){
	var title=$("#update_title").html();
	var comment=$("#update_comment").val()
	if($("#updatefile").val()==""||$("#updatefile").val()==null){
	alert("please upload your file")
	}else{
		 $.ajaxFileUpload({
			url : '/updatetip',
			type: 'post',
			secureuri : false,
			fileElementId : 'updatefile',
			dataType : 'JSON',
			data : {title : title , comment:comment },
			success : function(data, status) {
				if(data=="success"){
					$('#table').bootstrapTable('refresh',{url:'/initdata'});
					$('#myModal3').modal('hide')
				}else{
					alert(data)
				}//alert("success")  //刷新页面  或者插入一行
			},
			error : function(data, status, e) {
				alert('上传出错');
			}
		}) 
	}
}

function uploadNewTip(){
	var title=$("#upload_title").val()
	var tags=$("#tagbox2").val()
	if(title==""||title==null ){
		alert("please fill the title")
	}else if(tags==""||tags==null){
	alert("please choose tags")
	}else if($("#newfile").val()==""||$("#newfile").val()==null){
	alert("please upload your file")
	}else{
		
		 $.ajaxFileUpload({
			url : '/uploadnewtip',
			type: 'post',
			secureuri : false,
			fileElementId : 'newfile',
			dataType : 'JSON',
			data : {title : title ,tags : tags , comment:$("#upload_comment").val() },
			success : function(data, status) {
				if(data=="success"){
					$('#myModal2').modal('hide')	
				}else{
					alert(data)
				}//alert("success")  //刷新页面  或者插入一行
			},
			error : function(data, status, e) {
				alert('上传出错');
			}
		}) 
	}
}
</script>
</div>
<!-- /tag -->
    <div id="toolbar">
<!--         <button id="remove" class="btn btn-danger" disabled>
            <i class="glyphicon glyphicon-remove"></i> Delete
        </button> -->
    </div>
    <table id="table"
           data-toolbar="#toolbar"
           data-search="false"
           data-show-refresh="true"
           data-show-toggle="true"
           data-show-columns="true"
           data-show-export="false"
           data-detail-view="true"
           data-detail-formatter="detailFormatter"
           data-minimum-count-columns="2"
           data-show-pagination-switch="true"
           data-id-field="id"
           data-page-list="[10, 25, 50, 100, ALL]"
           data-show-footer="false"
           data-side-pagination="server"
           data-url="/initdata"
           data-response-handler="responseHandler">
    </table>
</div>

<script type="text/javascript">


</script>


<script>
    var $table = $('#table'),
        $remove = $('#remove'),
        selections = [];

    function initTable() {
        $table.bootstrapTable({
            height: getHeight(),
            columns: [
                [
                 {
                        title: 'Id',
                        field: 'id',
                        //checkbox: true,
                        rowspan: 2,
                        align: 'center',
                        valign: 'middle'
                    }, 
                    {
                        title: 'Title',
                        field: 'title',
                        rowspan: 2,
                        //align: 'center',
                        valign: 'middle',
                        sortable: true,
                        footerFormatter: totalTextFormatter
                    }, {
                        title: 'Tip Detail',
                        colspan: 4,
                        align: 'center'
                    }
                ],
                [
                    {
                        field: 'tags',
                        title: 'Tag',
                        sortable: true,
                        //editable: true,
                        footerFormatter: totalNameFormatter,
                        //align: 'center'
                    }, {
                        field: 'version',
                        title: 'version',
                        sortable: true,
                        align: 'center',
                     /*    editable: {
                            type: 'text',
                            title: 'Item Price',
                            validate: function (value) {
                                value = $.trim(value);
                                if (!value) {
                                    return 'This field is required';
                                }
                                if (!/^\$/.test(value)) {
                                    return 'This field needs to start width $.'
                                }
                                var data = $table.bootstrapTable('getData'),
                                    index = $(this).parents('tr').data('index');
                                console.log(data[index]);
                                return '';
                            }
                        },*/
                        footerFormatter: totalPriceFormatter 
                    }, {
                        field: 'owner',
                        title: 'Owner',
                        sortable: true,
                        //editable: true,
                        footerFormatter: totalNameFormatter,
                        align: 'center'
                    }, {
                        field: 'operate',
                        title: 'Tip Operate',
                        align: 'center',
                        events: operateEvents,
                        formatter: operateFormatter
                    }
                ]
            ]
        });
        // sometimes footer render error.
        setTimeout(function () {
            $table.bootstrapTable('resetView');
        }, 200);
        $table.on('check.bs.table uncheck.bs.table ' +
                'check-all.bs.table uncheck-all.bs.table', function () {
            $remove.prop('disabled', !$table.bootstrapTable('getSelections').length);

            // save your data, here just save the current page
            selections = getIdSelections();
            // push or splice the selections if you want to save all data selections
        });
        $table.on('expand-row.bs.table', function (e, index, row, $detail) {
        	var title
        	$.each(row, function (key, value) {
            	if(key=="title"){
				title=value
				}
        	});

                $detail.html('Loading from data request...');
                $.ajax({
                    async :true,
          		  url: "/tipdetail",
          		  type: "post",
          		  data: {date:new Date(),title:title},  
          		//  dataType : "json", //这里已经定义数据格式
          	      contentType: "application/x-www-form-urlencoded; charset=GB2312", 
          		  success:function(data) {
          		          
          			  //  var json=eval('('+data+')');   // jquery调用时会检测到，从而直接把返回格式当做json处理，所以再转化会报错。
          		        $detail.html(data.replace(/\n/g, '<br>'));
          		   }
          		});

                
              /*   $.post('/tipdetail',{date:new Date(),jsondata:JSON.stringify(row),contentType: "application/x-www-form-urlencoded; charset=utf-8"}, function (res) {
					alert(res);
                    $detail.html(res.replace(/\n/g, '<br>'));
                }); */
        });
        $table.on('all.bs.table', function (e, name, args) {
            console.log(name, args);
        });
        $remove.click(function () {
            var ids = getIdSelections();
            $table.bootstrapTable('remove', {
                field: 'id',
                values: ids
            });
            $remove.prop('disabled', true);
        });
        $(window).resize(function () {
            $table.bootstrapTable('resetView', {
                height: getHeight()
            });
        });
    }

    function getIdSelections() {
        return $.map($table.bootstrapTable('getSelections'), function (row) {
            return row.id
        });
    }

    function responseHandler(res) {
        $.each(res.rows, function (i, row) {
            row.state = $.inArray(row.id, selections) !== -1;
        });
        return res;
    }

 /*   function detailFormatter(index, row) {
        var html = [];
        $.each(row, function (key, value) {
            html.push('<p><b>' + key + ':</b> ' + value + '</p>');
        });
        return html.join('');
    }*/

    function operateFormatter(value, row, index) {
        return [
           	'<a class="download" href="javascript:void(0)" title="Download">',
            '<i class="glyphicon glyphicon-download"></i>',
            '</a> ',
            '<a class="upload" href="javascript:upload()" title="Update">',
            '<i class="glyphicon glyphicon-upload"></i>',
            '</a>  ',
            '<a class="remove" href="javascript:remove()" title="Remove">',
            '<i class="glyphicon glyphicon-remove"></i>',
            '</a> ',

        ].join('');
    }

    window.operateEvents = {
    	 'click .download': function (e, value, row, index) {
    	 	row.title;
    	 	window.location.href = '/download?title='+row.title;
            
        },

        'click .upload': function (e, value, row, index) {
          
        	checkupdateaccess(row.title);
        },

        'click .remove': function (e, value, row, index) {
        	$.get("/remove",{date:new Date(),title:row.title},function(mess){
				//request.getRequestDispatcher("customer/regSuccess.jsp").forward(request, response);
				if(mess=="success"){
					$table.bootstrapTable('remove', {
		                field: 'title',
		                values: [row.title]
		            });
				}else if (mess=="fail"){
					alert("some wrong occured,please refresh the page")
				}else if(mess=="noright"){
					alert("you are not owner of the tip")
				}else{
					window.location.reload();
				}
			});	
            
        }
    };

    function totalTextFormatter(data) {
        return 'Total';
    }

    function totalNameFormatter(data) {
        return data.length;
    }

    function totalPriceFormatter(data) {
        var total = 0;
        $.each(data, function (i, row) {
            total += +(row.price.substring(1));
        });
        return '$' + total;
    }

    function getHeight() {
        return $(window).height() - $('h1').outerHeight(true);
    }

    $(function () {
        var scripts = [
                location.search.substring(1) || '/js/bootstrap-table.js',
                '/js/bootstrap-table-export.js',
                'http://rawgit.com/hhurz/tableExport.jquery.plugin/master/tableExport.js',
                '/js/bootstrap-table-editable.js',
                'http://rawgit.com/vitalets/x-editable/master/dist/bootstrap3-editable/js/bootstrap-editable.js'
            ],
            eachSeries = function (arr, iterator, callback) {
                callback = callback || function () {};
                if (!arr.length) {
                    return callback();
                }
                var completed = 0;
                var iterate = function () {
                    iterator(arr[completed], function (err) {
                        if (err) {
                            callback(err);
                            callback = function () {};
                        }
                        else {
                            completed += 1;
                            if (completed >= arr.length) {
                                callback(null);
                            }
                            else {
                                iterate();
                            }
                        }
                    });
                };
                iterate();
            };

        eachSeries(scripts, getScript, initTable);
    });

    function getScript(url, callback) {
        var head = document.getElementsByTagName('head')[0];
        var script = document.createElement('script');
        script.src = url;

        var done = false;
        // Attach handlers for all browsers
        script.onload = script.onreadystatechange = function() {
            if (!done && (!this.readyState ||
                    this.readyState == 'loaded' || this.readyState == 'complete')) {
                done = true;
                if (callback)
                    callback();

                // Handle memory leak in IE
                script.onload = script.onreadystatechange = null;
            }
        };

        head.appendChild(script);

        // We handle everything using the script element injection
        return undefined;
    }


    function upload(){
    	/* $.get("/upload",{date:new Date()},function(mess){
    		//request.getRequestDispatcher("customer/regSuccess.jsp").forward(request, response);
    		if(mess=="fail"){
    			alert("the tag have already exist")
    		}else{
    			
    		}
    	});	 */

        }
</script>
</body>
</html>
