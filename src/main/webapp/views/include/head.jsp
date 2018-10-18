<head>
    <title>Booking</title>
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
</head>

<script type="text/javascript" src="https://cdn.jsdelivr.net/jquery/latest/jquery.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.css" />
<script>
    $(function(){
        $('#dateBegin').daterangepicker({
            singleDatePicker: true,
            locale: {
                format: 'DD-MM-YYYY'
            }
        });
    });
    $(function(){
        $('#dateEnd').daterangepicker({
            singleDatePicker: true,
            locale: {
                format: 'DD-MM-YYYY'
            }
        });
    });

    $(document).ready(function(){
        $("input").focus(function(){
            $(this).css("background-color", "#cccccc");
        });
        $("input").blur(function(){
            $(this).css("background-color", "#ffffff");
        });
    });


</script>




<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<style type="text/css">
    a {text-decoration: none;}
    a:hover {text-decoration: underline;color: red;}
    .block1 {
        background: #ccc;
        border: solid 1px darkgray;
        border-radius: 5px;
        margin: 5px;
    }
    ul.list-facility li{color: darkgreen;font-size: 13px}

    .wrap {
        width: 100%;
        background: darkblue;
        height: 60px;
    }
    .left, .right {
        display: inline-block;
    //display: inline;
    //zoom: 1;
        width: 100%;
        margin-right: -100%;
        vertical-align: center;
    }
    .right {
        text-align: right;
    }
    .left a, .right a { display: inline-block; position: relative; color: #FFFFFF; padding-top: 10px}
    .left a { width: auto; height: 30px; background: darkblue; margin-left: 20px;}
    .right a { width: auto; height: 30px; background: darkblue; margin-right: 20px}

    table.order {
        width: 100%; border: 4px double black; border-collapse: collapse;
    }
    th.order {
        text-align: left; background: #ccc; padding: 5px; 
        border: 1px solid black; 
    }
    td.order {
        padding: 5px; 
        border: 1px solid black; 
    }


</style>
