const express = require('express');

const app = express();

const bodyParser = require('body-parser');

app.use(bodyParser.urlencoded());

books=[
    {
        "name":"Book-1",
        "price":2039,
        "author":"Author-1",
        "RDate":"12-02-2001"
    },
    {
        "name":"Book-2",
        "price":6732,
        "author":"Author-2",
        "RDate":"02-05-1992"
    },
    {
        "name":"Book-3",
        "price":9232,
        "author":"Author-3",
        "RDate":"11-12-2013"
    }
]

app.get('/books',(req,res)=>{
    res.json(books);
});

app.post('/books',(req,res)=>{
    books.push(req.body);
    res.send("Data Added");
});

app.patch('/books/:name',(req,res)=>{
    const nameToUpdate = books.findIndex(book=>req.name == req.params.name);
    books[nameToUpdate] = req.body;
    res.send(books[nameToUpdate]);
});

app.delete('/books/:name',(req,res)=>{
    const nameToDelete = books.findIndex(book=>req.name == req.params.name);
    books.splice(nameToDelete,1);
    res.send("Deleted");
});

app.listen(3000,()=>{
    console.log("Server Started");
});