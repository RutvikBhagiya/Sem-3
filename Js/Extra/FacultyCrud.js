const express = require('express');
const app = express();

const bodyParser = require('body-parser');

app.use(bodyParser.urlencoded());

faculties = [
    {
        "id" : 1,
        "name" : "arjun",
        "email" : "arjun90@gmil.com"
    },
    {
        "id" : 2,
        "name" : "pradyuman",
        "email" : "pradyuman1@gmil.com"
    },
    {
        "id" : 3,
        "name" : "vishal",
        "email" : "vishal420@gmil.com"
    },
];

app.get('/faculties',(req,res)=>{
    res.json(faculties);
});
//post method use to add data
app.post('/faculties',(req,res)=>{
    faculties.push(req.body);
    res.send("Data Added");
});
//patch or put use for update data
app.patch('/faculties/:id',(req,res)=>{
    const idToUpdate = faculties.findIndex(fac=>req.id == req.params.id)
    faculties[idToUpdate] = req.body;
    res.send(faculties[idToUpdate]);

    //only add new data means override old values to new
    // const idToUpdate = faculties.findIndex(fac=>fac.id == req.params.id)
    // faculties[idToUpdate] = {...faculties[idToUpdate],...req.body};
    // res.send(faculties);
});

app.delete('/faculties/:id',(req,res)=>{
    const idToDelete = faculties.findIndex((fac)=>{
        if(fac.id == req.params.id){
            return true;
        }
    });
    //idto delete thi 1 delete karse
    faculties.splice(idToDelete,1);
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