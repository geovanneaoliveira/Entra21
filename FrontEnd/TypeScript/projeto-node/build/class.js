"use strict";
class Point {
    constructor(otherName) {
        this._X = 0;
        this.Y = 0;
        this.name = "This point";
        this.printPoint = () => {
            return `X: ${this.X}, Y:${this.Y}`;
        };
        if (otherName !== undefined) {
            this.name = otherName;
        }
    }
    ping() {
        console.log("Ping");
    }
    get X() {
        return this._X;
    }
    set X(val) {
        this._X = val;
    }
}
class DPoint extends Point {
    constructor() {
        super(...arguments);
        this.Z = 0;
        this.printPoint = () => {
            return `X: ${this.X}, Y:${this.Y}Z: ${this.Z}`;
        };
    }
}
let p = new Point("Pontinho");
p.X = 12;
p.Y = 6;
console.log(p.printPoint());
