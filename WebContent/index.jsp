<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro Restaurante</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="addRestaurante.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
</head>
<body>
   
    <div class="text-center mb-3 mt-3">
        <h1>Cadastro de Restaurante</h1>
    </div>
    <div class="d-flex justify-content-center ">

        <form action="">
            <div class="row mb-4 mt-3">
                <div class="col">
                    <input type="text" class="form-control" placeholder="Nome Restaurante">
                </div>
                <div class="col">
                    <input type="text" class="form-control" placeholder="CNPJ">
                </div>
                <div class="col">
                    <input type="tel" class="form-control" placeholder="Telefone">
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <input type="email" class="form-control" placeholder="Email">
                </div>
                <div class="col">
                    <select class="form-control">>
                        <option disabled selected>Alcance</option>
                        <option>1km - 5km</option>
                        <option>10km - 20km</option>
                        <option>20km - 50km</option>
                        <option>50km - 100km</option>
                    </select>
                </div>
                <div class="col">
                    <input type="text" class="form-control" placeholder="Horário">
                </div>
                <div class="col">
                    <select class="form-control">>
                        <option disabled selected>Possui ISO14001?</option>
                        <option>Sim</option>
                        <option>Não</option>
                    </select>
                </div>
            </div>

            <div class="text-center">
                <button class="btn btn-lg" type="submit" >Cadastrar</button>
            </div>
        </form>
    </div>
   
        
           
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
