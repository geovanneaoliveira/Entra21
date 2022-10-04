console.log("vasco");
let numeros: number | string | boolean;

type Rect = {
    width: number,
    height?: number
}

type Triangle = {
    angle: number,
    type: "isosceles" | "escaleno" | "equilátero"
}

type Circle = {
    radius: number
}

type GeometricFigure = Rect | Triangle | Circle;

let rect: Rect = {
    width: 20
};

let t: GeometricFigure = {
    angle: 45,
    type: "escaleno"
} 

t = {
    radius: 8
}

t = {
    height: 50,
    width: 20
}

let f = (x:number,y:number):number =>{
    return x + y;
}

console.log(f(1,2));