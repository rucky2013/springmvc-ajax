/**
 * Created by cuike on 15-9-27.
 */

function getString(){

    $.ajax({
        url:"http://localhost:8080/getAString.do",
        type:"POST",
        dataType:'json',
        success: function( data ) {
            if(data.success == true) {
                $(".divget").html("<strong>" + data.model + "</strong>  ");

            }else{
                var errorInfo = data.error;
                var str = "";
                for(var p in errorInfo){
                    str += p +":" + errorInfo[p];
                }
                $( ".divget" ).html( "<strong>" + str + "</strong>  " );

            }

        },

    });
}


function update(){
    var info ={
        name:"",
        passwd:"",
        sex:""
    };

    $.ajax({
        url:"http://localhost:8080/update.do",
        type:"POST",
        dataType:'json',
        contentType:"application/json",
        data:JSON.stringify(info),
        success: function( data ) {
            if(data.success == true) {
                $(".update").html("<strong>" + JSON.stringify(data.model) + "</strong>  ");

            }else{
                var errorInfo = data.error;
                var str = "";
                for(var p in errorInfo){
                    str += p +":" + errorInfo[p];
                }
                $( ".update" ).html( "<strong>" + str + "</strong>  " );

            }

        }
    });
}


function  errorExample(){
    var info ={
        name:"",
        passwd:"",
        sex:""
    };
    $.ajax({
        url:"http://localhost:8080/error.do",
        type:"POST",
        dataType:'json',
        contentType:"application/json",
        data:JSON.stringify(info),
        success: function( data ) {
            if(data.success == true) {
                $(".update").html("<strong>" + JSON.stringify(data.model) + "</strong>  ");

            }else{
                var errorInfo = data.error;
                var str = "";
                for(var p in errorInfo){
                    str += p +":" + errorInfo[p];
                }
                $( ".update" ).html( "<strong>" + str + "</strong>  " );

            }

        },
        success:function(data){
           alert9(data)
        }
    });
}