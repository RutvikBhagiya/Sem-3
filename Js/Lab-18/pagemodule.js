// 2. Create a webapp with 5 pages like about, contact etc.. using “http” core module in NodeJS. (B)

const http = require('http');

const server = http.createServer((req,res)=>{
    if(req.url == '/home'){
        res.writeHead(200, { 'Content-Type': 'text/plain' });
        res.write("It's a 'HOME' page |^^|");
        res.end();
    }
    else if(req.url == '/about'){
        res.write("It's an 'ABOUT' page +__+");
        res.end();
    }
    else if(req.url == '/contact'){
        res.write("It's a 'CONTACT' page /|\\");
        res.end();
    }
    else if(req.url == '/help'){
        res.write("It's a 'HELP' page [-^-]");
        res.end();
    }
    else{
        res.writeHead(404, { 'Content-Type': 'text/plain' });
        res.write('Page Not Found');
        res.end();
    }
});

server.listen(3000,()=>{
    console.log("From the server");
});