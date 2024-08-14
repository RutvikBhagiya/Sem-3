// . Demonstrate “fs” core module in NodeJS. (A)

const fs = require('fs');

// fs.exists('new.txt',(exists)=>{
//     console.log(exists ? "File/Folder Founded !" : "File/Folder Not Founded");
// });

// fs.readFile('new.txt',(err,data)=>{
//    if (err) throw err;
//     console.log(data.toString());
// });

// fs.appendFile('new.txt','new Appended text',(err)=>{
//     if (err) throw err;
//     console.log("Appended");
// });

// fs.writeFile('create.txt','write into new created file',(err)=>{
//     if (err) throw err;
//     console.log("In file writed");
// });

fs.unlink('create.txt',(err)=>{
    if (err) throw err;
    console.log("Deleted");
});