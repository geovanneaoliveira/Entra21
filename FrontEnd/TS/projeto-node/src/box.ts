type Box<Type = any> = {
    contents?: Type[]
    contentLength?: () => number;
}

let box: Box<string> = {
    contents: [],
    contentLength: () => box.contents?.length ?? 0
};

box.contents?.push("conteudo");

let box2: Box<number> = {
    contents: []
};

let box3: Box = {
    contents: []
}

box2.contents?.push(12);

box3.contents?.push("conteudo");
box3.contents?.push(12);
box3.contents?.push(true);

function tes<T>(arg: T): T{
    return arg;
}

let n: number = tes(123);
let v: string = tes("123");
