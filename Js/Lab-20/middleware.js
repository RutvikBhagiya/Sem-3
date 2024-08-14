// 1. Demonstrate the use of middleware in Express. (A)

const express = require('express');
const app = express();

const Demo = (req,res,next)=>{
    console.log("Executed >-<");
    next();
}

app.use('/home',Demo);

// app.use('/home',(req,res,next)=>{
//     console.log("Executed");
//     next();
// });

app.get('/',(req,res)=>{
    res.send("Its '/' called");
});

app.get('/home',(req,res)=>{
    res.send("Its '/home' called");
});

app.get('/home/abc',(req,res)=>{
    res.send("Its '/home/abc' called");
});

app.listen(3000,()=>{
    console.log("From Server");
});