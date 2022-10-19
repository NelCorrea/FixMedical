document.querySelectorAll(".text-input").forEach((element)=>{
    element.addEventListener("blur", (event)=>{
        if(event.target.value !== ""){
            event.target.nextElementSibling.ClassList.add("filled");
        }else{
            event.target.nextElementSibling.ClassList.remove("filled");
        }
    });
})

