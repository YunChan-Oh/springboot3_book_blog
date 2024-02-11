const deleteButton = document.getElementById('delete-btn');

if(deleteButton){
    deleteButton.addEventListener('click',event=>{
        let id=document.getElementById('article-id').value;
        fetch(`/api/articles/${id}`,{
            method:'DELETE'
        })
            .then(()=>{ //then은 fetch가 잘 완료되면 연이어서 동작
                alert('삭제가 완료되었습니다.');
                location.replace('/articles');
            })
    })
}