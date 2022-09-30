"use strict";
const users = [
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
function logPerson(user) {
    console.log(` - ${user.name}, ${user.age}`);
}
console.log("Users: ");
users.forEach(logPerson);
