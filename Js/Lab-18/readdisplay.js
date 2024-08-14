// 3. Create a webapp in NodeJS which reads ƒles like about.txt, contact.txt and display it
// using http core module (C)

const http = require('http');
const fs = require('fs');

const server = http.createServer((req,res)=>{
    if(req.url == '/about'){
        fs.readFile('about.txt',(err,data)=>{
            if (err){
                res.write("Server error");
                res.end();
            }
            else{
                res.write(data.toString());
                res.end();
            }
            
        });
    }
    else if(req.url == '/contact'){
        fs.readFile('contact.txt',(err,data)=>{
            if (err){
                 res.write("Server error");
                res.end();
            }
            else{
                res.write(data.toString());
                res.end();
            }
        });
    }
    else{
        res.write("Not Found!*!");
        res.end();
    }
});

server.listen(3000,()=>{
    console.log("From server");
});