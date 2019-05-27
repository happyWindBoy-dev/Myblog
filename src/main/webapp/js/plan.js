$(function(){
    var div1 = $(".addcontent");
       
       $(".add").click(function(){
           div1.fadeToggle();
           $(".delet").fadeToggle();
           $(".edit").fadeToggle(100);

       });
       
      
    });
function checkEmpty(value,text){

    if(null==value || value.length==0){
        alert(text+ "不能为空");
        return false;
    }
    return true;
}
function checkDeleteLink(){
    var confirmDelete = confirm("确认要删除");
    if(confirmDelete)
        return true;
    return false;
}
    function getUrlParms(para){
    var search=location.search; //页面URL的查询部分字符串
    var arrPara=new Array(); //参数数组。数组单项为包含参数名和参数值的字符串，如“para=value”
    var arrVal=new Array(); //参数值数组。用于存储查找到的参数值

    if(search!=""){
        var index=0;
        search=search.substr(1); //去除开头的“?”
        arrPara=search.split("&");

        for(i in arrPara){
            var paraPre=para+"="; //参数前缀。即参数名+“=”，如“para=”
            if(arrPara[i].indexOf(paraPre)==0&& paraPre.length<arrPara[i].length){
                arrVal[index]=decodeURI(arrPara[i].substr(paraPre.length)); //顺带URI解码避免出现乱码
                index++;
            }
        }
         }

        if(arrVal.length==1){
            return arrVal[0];
        }else if(arrVal.length==0){
            return null;
        }else{
            return arrVal;
        }
    }