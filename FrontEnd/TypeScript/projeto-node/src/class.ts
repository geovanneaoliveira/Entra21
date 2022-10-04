interface Pingable{
    ping(): void;
}

class Point implements Pingable{
    _X: number = 0;
    Y: number = 0;
    readonly name: string = "This point";

    constructor(otherName?: string) {
        if(otherName !== undefined){
            this.name = otherName;
        }
    }

    static jump(){
        console.log("Jump");
    }

    ping = (): void => console.log("Ping");

    printPoint = () => {
        return `X: ${this.X}, Y:${this.Y}`;
    }

    get X() : number {
        return this._X;
    }

    set X(val: number){
        this._X = val;
    } 
}

class DPoint extends Point{
    Z: number = 0;

    printPoint = () => {
        return `X: ${this.X}, Y:${this.Y}Z: ${this.Z}`;
    }
}

type TPoint = {
    X: number,
    Y: number
}

let p = new Point("Pontinho");
p.X = 12;
p.Y = 6;
console.log(p.printPoint());

class CBox<T> {
    _contents: T[] = [];

    addItem = (item: T) => this._contents.push(item);

    removeLastItem = (item: T) => this._contents.pop();

    get contents(){
        return this._contents;
    }

    set contents(val: T[]){
        this._contents = val;
    }
}