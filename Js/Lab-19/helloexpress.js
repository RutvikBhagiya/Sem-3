// 1. Create a hello world webapp using ExpressJS. (A)
const express = require("express");

const app = express();

app.get('/',(req,res)=>{
    res.send("Hello world");
});

app.listen(3000,()=>{
    console.log("from the serever");
});