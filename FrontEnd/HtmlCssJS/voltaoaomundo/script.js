var vPlaces = ["Volta Redonda", "Vista Alegre", "Valencia", "Vassouras", "Vicente de Carvalho"];
var oPlaces = ["Oman", "Olaria", "Oslo", "Olinda","Osaka"];
var lPlaces = ["Letonia", "Lages", "Londres", "Londrina", "Leblon"];
var tPlaces = ["Taiwan", "Tasmania", "Teeran", "Toquio", "Toronto"];
var aPlaces = ["Armenia", "Andes", "Angra dos Reis", "Arraial do Cabo"];
var volta = ['V', 'O', 'L', 'T', 'A'];
var attempt = 0;
var failedAttempts = 0;

function sendPlace(){
    var tentativa = document.getElementById("inputPlace").value;
    switch(attempt){
        case 0:
            if(tentativa.charAt(0).toUpperCase()=='V'){
                failedAttempts = 0;
                attempt++;
                if(vPlaces.includes(tentativa)){
                    succes();
                } else {
                    vPlaces.push(tentativa);
                    succes();
                    console.log(vPlaces);
                }
            } else {
                failedAttempts++;
                failure();
                attemptCheck();
            }
            break;
        case 1:
            if(tentativa.charAt(0).toUpperCase()=='O'){
                failedAttempts = 0;
                attempt++;
                if(oPlaces.includes(tentativa)){
                    succes();
                } else {
                    oPlaces.push(tentativa);
                    succes();
                }
            } else {
                failedAttempts++;
                failure();
                attemptCheck();
            }
            break;
        case 2:
            if(tentativa.charAt(0).toUpperCase()=='L'){
                failedAttempts = 0;
                attempt++;
                if(lPlaces.includes(tentativa)){
                    succes();
                } else {
                    lPlaces.push(tentativa);
                    succes();
                }
            } else {
                failedAttempts++;
                failure();
                attemptCheck();
            }
            break;
        case 3:
            if(tentativa.charAt(0).toUpperCase()=='T'){
                failedAttempts = 0;
                attempt++;
                if(tPlaces.includes(tentativa)){
                    succes();
                } else {
                    tPlaces.push(tentativa);
                    succes();
                }
            } else {
                failedAttempts++;
                failure();
                attemptCheck();
            }
            break;
        case 4:
            if(tentativa.charAt(0).toUpperCase()=='A'){
                failedAttempts = 0;
                attempt++;
                if(aPlaces.includes(tentativa)){
                    succes();
                } else {
                    aPlaces.push(tentativa);
                    succes();
                }
            } else {
                failedAttempts++;
                failure();
                attemptCheck();
            }
            break;
    }
}

function succes(){
    alert("Sim, você pode!");
    if(attempt == 5){
        attempt = 0;
    }
}

function failure(){
    alert("Não, você não pode!");
}

function attemptCheck(){
    if(failedAttempts == 3){
        let random = 1;
        switch(attempt){
            case 0:
                random = Math.floor(Math.random() * vPlaces.length);
                alert(`Mas você poderia ir para ${vPlaces[random]}!`);
                break;
            case 1:
                random = Math.floor(Math.random() * oPlaces.length);
                alert(`Mas você poderia ir para ${oPlaces[random]}!`);
                break;
            case 2:
                random = Math.floor(Math.random() * lPlaces.length);
                alert(`Mas você poderia ir para ${lPlaces[random]}!`);
                break;;
            case 3:
                random = Math.floor(Math.random() * tPlaces.length);
                alert(`Mas você poderia ir para ${tPlaces[random]}!`);
                break;
            case 4:
                random = Math.floor(Math.random() * aPlaces.length);
                alert(`Mas você poderia ir para ${aPlaces[random]}!`);
                break;
        }
    }
}