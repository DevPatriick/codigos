

import { Link as LinkRoutes} from 'react-router-dom';
import "./style.css";


interface LinkProps{
    texto: string;
    redirect: string;
}

export default function Link(props: LinkProps){
     return(
         <LinkRoutes to={props.redirect} >
            {props.texto}
         </LinkRoutes>
     );
}