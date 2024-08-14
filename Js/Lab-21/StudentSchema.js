const mongoose = require('mongoose');

const schema = mongoose.Schema({
    Eid : Number,
    name : String,
    email : String
});

module.exports = mongoose.model("Student",schema);