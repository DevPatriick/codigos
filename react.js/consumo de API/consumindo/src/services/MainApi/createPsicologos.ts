import baseApi from "./config";

interface PsicologoPayload  {
     nome: string,
     apresentacao: string,
     email: string,
     senha: string;
}


export function cadastroPsicologos(payload: PsicologoPayload){
    return baseApi.post('/cadastro', payload)
}

export function listarPsicologo(){
    return baseApi.get('/listar')
}