function nullCheck(data, dest, kind){
    if(data ==null || data==''){
        $(dest).html(kind+" 필수")
        return false;
    }else{
        $(dest).html("정상")
        return true;
    }
}

function equals(data,checkData){
    if(data==checkData){
        return true;
    }else{
        return false;
    }
}