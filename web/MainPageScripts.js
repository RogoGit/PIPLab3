//var inputRad = document.getElementById("fieldsForm:rad");
var oldRad = 1;

function getMousePos() {
    return {
        x: (event.clientX - 190) / 180,
        y: -(event.clientY - 210) / 180
    };
}

function makeNewDotClicked() {
    var aX = document.getElementById("fieldsForm:kx_input");
    var aY = document.getElementById("fieldsForm:ky");
    var aR = document.getElementById("fieldsForm:rad");
    aX.value = getMousePos().x.toFixed(3);
    aY.value = getMousePos().y.toFixed(3);
    aR.value =  document.getElementById("fieldsForm:rad").value;
    document.querySelector('.checkdot').click();
}


function resizeArea() {
    document.getElementById('fieldsForm:changer').value = 'true';
    document.querySelector('.checkdot').click();
    return true;
}

