const express = require('express');
const path = require('path');

const app = express();

app.get('/home',(req,res)=>{
    res.sendFile(path.join(__dirname,'home.txt'));
});

app.get('/about',(req,res)=>{
    res.sendFile(path.join(__dirname,'about.txt'));
});

app.listen(3000,()=>{
    console.log("From the server");
});