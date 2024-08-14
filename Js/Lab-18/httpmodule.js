const http = require('http');
// const port = 3000;

const server = http.createServer((req,res)=>{
    res.write("first written");
    res.end("Hello from my server");
});

server.listen(8000,()=>{
    console.log('Server is running from 8000');
});