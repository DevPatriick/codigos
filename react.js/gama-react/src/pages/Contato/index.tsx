import Header from "../../components/Header";
import { useParams } from 'react-router-dom';



export default function Contato(){

    const params = useParams();

   return (
    <div>
        <Header />
        <h1>Página de contato</h1>
        <h2>Olá {params.nome}</h2>
    </div>
   )
}