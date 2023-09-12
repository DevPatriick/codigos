import { useEffect, useState } from "react";

export default function PsicologoList(){

    interface Psicologo {
        nome: string,
        apresentacao: string,
        email: string,
        senha: string;
    }

    
    const [psicologo, setPsicologo] = useState<Psicologo[]>([]);
    useEffect(()=>{
        const getData = async () => {
            try {
                const response = await PsicologoList();
                setPsicologo(response.props); 
                // inves de props usar data
            } catch (error) {
                 alert("Deu ruim")
            }
        }

        getData()
    }, [setPsicologo])

    return (
        <main className="container cad my-5 p-5">
            <h1>Lista de Psicologos</h1>
            <ul className="list-group">
                {psicologo.map((psicologo) => (
                    <li className="list-group-item">{psicologo.nome}</li>
            ))}
                
            </ul>
        </main>
    )
}