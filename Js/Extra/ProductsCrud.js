const express = require('express');

const app = express();

const bodyParser = require('body-parser');

app.use(bodyParser.urlencoded());

products=[
    {
        "series":"1",
        "name":"Mobile",
        "price":20000,
        "company":"vivo"
    },
    {
        "series":"1",
        "name":"Tv",
        "price":67302,
        "company":"panasonic"
    },
    {
        "series":"1",
        "name":"laptop",
        "price":90232,
        "company":"dell"
    }
]

app.get('/products',(req,res)=>{
    res.json(products);
});

app.post('/products',(req,res)=>{
    products.push(req.body);
    res.send("Data Added");
});

app.patch('/products/:series',(req,res)=>{
    const seriesToUpdate = products.findIndex(ser=>req.name == req.params.name);
    products[seriesToUpdate] = req.body;
    res.send(products[seriesToUpdate]);
});

app.delete('/products/:series',(req,res)=>{
    const seriesToDelete = products.findIndex(ser=>req.name == req.params.name);
    products.splice(seriesToDelete,1);
    res.send("Deleted");
});

app.listen(3000,()=>{
    console.log("Server Started");
});