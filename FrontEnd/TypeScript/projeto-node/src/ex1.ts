type User = {
    name: string,
    age: number,
    occupation: string
};

const users: User[] = [
    {
        name: "Max",
        age: 25,
        occupation: "Student"
    },
    {
        name: "Kate",
        age: 23,
        occupation: "Singer"
    }
];

function logPerson(user: User) {
    console.log(` - ${user.name}, ${user.age}`);
}

console.log("Users: ")
users.forEach(logPerson);