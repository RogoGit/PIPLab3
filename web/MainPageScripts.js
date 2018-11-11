//var inputRad = document.getElementById("fieldsForm:rad");
var oldRad = 1;

function getMousePos() {
    return {
        x: (event.clientX - 390) / 180,
        y: -(event.clientY - 340) / 180
    };
}

function makeNewDotClicked() {
    var aX = document.getElementById("AreaForm:AreaX");
    var aY = document.getElementById("AreaForm:AreaY");
    var aR = document.getElementById("AreaForm:AreaR");
    aX.value = getMousePos().x;
    aY.value = getMousePos().y;
    aR.value =  document.getElementById("fieldsForm:rad").value;
    //$('#areaSub').click();
    document.querySelector('.sbBut').click();
   /* return {
        x: aX.value,
        y: aY.value,
        r:  document.getElementById("fieldsForm:rad").value
    }*/
}

function makeNewDotForm() {
    var fX = document.getElementById("Fieldsf:fX");
    var fY = document.getElementById("Fieldsf:fY");
    var fR = document.getElementById("Fieldsf:fR");
    fX.value = document.getElementById("fieldsForm:kx").value;
    fY.value = document.getElementById("fieldsForm:kx").value;
    fR.value =  document.getElementById("fieldsForm:rad").value;
    //$('#fSub').click();
    document.querySelector('.fBut').click();
}

function resizeArea() {
    var newRad =  document.getElementById("fieldsForm:rad").value;
    var old = oldRad;
        oldRad = newRad;
document.getElementById("resizeForm:newR").value = newRad;
document.getElementById("resizeForm:oldR").value = old;
    document.querySelector('.resBut').click();
        return {
        n: newRad,
            o: old
    }
}

