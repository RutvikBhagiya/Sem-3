const express = require('express');
const app = express();

const bodyParser = require('body-parser');

app.use(bodyParser.urlencoded());

students = [
    {
        "id" : 1,
        "name" : "raju",
        "email" : "raju90@gmil.com"
    },
    {
        "id" : 2,
        "name" : "ketan",
        "email" : "ketan1@gmil.com"
    },
    {
        "id" : 3,
        "name" : "suresh",
        "email" : "suresh420@gmil.com"
    },
];

app.get('/students',(req,res)=>{
    res.json(students);
});
//post method use to add data
app.post('/students',(req,res)=>{
    students.push(req.body);
    res.send("Data Added");
});
//patch or put use for update data
app.patch('/students/:id',(req,res)=>{
    const idToUpdate = students.findIndex(stu=>req.id == req.params.id)
    students[idToUpdate] = req.body;
    res.send(students[idToUpdate]);

    //only add new data means override old values to new
    // const idToUpdate = students.findIndex(stu=>stu.id == req.params.id)
    // students[idToUpdate] = {...students[idToUpdate],...req.body};
    // res.send(students);
});

app.delete('/students/:id',(req,res)=>{
    const idToDelete = students.findIndex((stu)=>{
        if(stu.id == req.params.id){
            return true;
        }
    });
    //idto delete thi 1 delete karse
    students.splice(idToDelete,1);
    res.send("Deleted");
});


app.get('/home/:id',(req,res)=>{
    res.send(arr.find((e)=>{
        if(e.id == req.params.id){
            return e;
        }
    }));
});


app.listen(3000,()=>{
    console.log("Server running");
});