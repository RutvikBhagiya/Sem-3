// 2. Create a webapp with 5 pages like about, contact etc.. using ExpressJS. (B)

const express = require("express");

const app = express();

app.get('/',(req,res)=>{
    res.send("Hello world");
});

app.get('/about',(req,res)=>{
    res.send("About of 'About page'");
});

app.get('/home',(req,res)=>{
    res.send("About of 'Home page'");
});

app.get('/help',(req,res)=>{
    res.send("Not help available( ><_>< )");
});

app.get('/service',(req,res)=>{
    res.send("Not any services here(!-)"); 
});

app.listen(3000,()=>{
    console.log("From the server!");
});