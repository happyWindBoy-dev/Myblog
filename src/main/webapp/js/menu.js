$(".serBox").hover(function () {

    $(this).children().stop(false,true);

    $(this).children(".serBoxOn").fadeIn("slow");

    $(this).children(".pic1").animate({right: -110},400);

    $(this).children(".pic2").animate({left: 41},400);

    $(this).children(".txt1").animate({left: -240},400);

    $(this).children(".txt2").animate({right: 0},400);	

},function () {

    $(this).children().stop(false,true);

    $(this).children(".serBoxOn").fadeOut("slow");

    $(this).children(".pic1").animate({right:41},400);

    $(this).children(".pic2").animate({left: -110},400);

    $(this).children(".txt1").animate({left: 0},400);

    $(this).children(".txt2").animate({right: -240},400);	

});