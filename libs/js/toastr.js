const btn = document.querySelector("#btn-btn");
const inputnome = document.querySelector("#exampleInputEmail1");

btn.onclick = ()=>{
    if(!inputnome.value){
       return  toastr.error("Campos invalidos")
    }
    toastr.success("Sucesso");
}
