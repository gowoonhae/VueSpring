import Editor from '@toast-ui/editor';
import '@toast-ui/editor/dist/toastui-editor.css';

if(document.querySelector('#editor') != null){
    const editor = new Editor({
        el: document.querySelector('#editor') as HTMLElement,
        height: 'auto',
        minHeight: '500px',
        initialEditType: 'wysiwyg',
    });
}

export default defineNuxtPlugin(() => {
});