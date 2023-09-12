import Link from "../Link/index";


import "../../styles/index.css";


function Header(){
    return (
    <header>
        <h1>DINDIN</h1>
        <nav> 
           <Link texto="Cursos" redirect="/cursos"/>
           <Link texto="Blog" redirect="/blog"/>
           <Link texto="Contato" redirect="/contato"/>
        </nav>
    </header>
);
}

export default Header;