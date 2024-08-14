const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser')
const Student = require('./StudentSchema');

const app = express();
app.use(bodyParser.urlencoded());

const connectionLink = 'mongodb+srv://Rutvik24:RutvikB24@cluster0.ab3fm.mongodb.net/Student_Detail';

mongoose.connect(connectionLink).then(()=>{
    console.log("Cloud connected");
    
    app.get('/students',async (req,res)=>{
        const students = await Student.find();
        res.send(students);
    });

    app.get('/students/:Eid',async (req,res)=>{
        const student = await Student.findOne({Eid : req.params.Eid});
        res.send(student);
    });

    // app.post('/students',async (req,res)=>{
    //     await Student.push(req.body);
    //     res.send("Updated");
    // });

    app.listen(3000,()=>{
        console.log("From Server");
    });
});

