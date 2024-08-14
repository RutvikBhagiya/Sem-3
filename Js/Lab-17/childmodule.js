//Demonstrate "child_process" core module in Nodejs;

const child_process = require('child_process');

// child_process.exec('File.java',(err,stout,stdin)=>{
//     console.log(stdout);
// });

child_process.exec('dir',(err,stdout,stdin)=>{
    console.log(stdout);
});